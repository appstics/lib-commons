package com.jkstic.libcommons.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jkstic.libcommons.ClientBuilderRest;
import com.jkstic.libcommons.service.RestService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RestServiceImpl implements RestService<Object> {

	@Override
	public Object get(ClientBuilderRest data, Class<?> obj, Boolean asList, Boolean debug) throws IOException, URISyntaxException {

		data = dataQueryParams(data);

		HttpURLConnection conn = dataConectionHeaders(data, "GET", debug);

		if (conn.getResponseCode() == 200) {
			if (debug) {
				log.info("resquest ok");
			}
			return dataRequestParams(conn, obj,asList, debug);
		} else if (conn.getResponseCode() != 200) {
			if (debug) {
				log.error("ErrorCode: " + conn.getResponseCode());
				log.error("Error: " + conn.getResponseMessage());
			}
			throw new RuntimeException("Failed code: " + conn.getResponseCode() + " --> " + conn.getResponseMessage());
		}

		conn.disconnect();
		return null;
	}

	@Override
	public Object post(ClientBuilderRest data, Class<?> obj, Boolean asList, Boolean debug) throws IOException, URISyntaxException {

		data = dataQueryParams(data);
		byte[] postDataBytes = data.getBody().getBytes("UTF-8");

		HttpURLConnection conn = dataConectionHeaders(data, "POST", debug);

		conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
		conn.setDoOutput(true);
		conn.getOutputStream().write(postDataBytes);

		if (conn.getResponseCode() == 200) {
			if (debug) {
				log.info("resquest ok");
			}
			return dataRequestParams(conn, obj,asList, debug);
		} else if (conn.getResponseCode() == 202) {
			return dataRequestParams(conn, obj, asList,debug);
		} else if (conn.getResponseCode() != 200) {
			if (debug) {
				log.error("ErrorCode: " + conn.getResponseCode());
				log.error("Error: " + conn.getResponseMessage());
			}
			throw new RuntimeException("Failed code: " + conn.getResponseCode() + " --> " + conn.getResponseMessage());
		}

		conn.disconnect();
		return null;
	}

	@Override
	public Object put(ClientBuilderRest data, Class<?> obj, Boolean asList, Boolean debug) throws IOException, URISyntaxException {

		data = dataQueryParams(data);
		byte[] postDataBytes = data.getBody().getBytes("UTF-8");

		HttpURLConnection conn = dataConectionHeaders(data, "PUT", debug);

		conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
		conn.setDoOutput(true);
		conn.getOutputStream().write(postDataBytes);

		if (conn.getResponseCode() == 200) {
			if (debug) {
				log.info("resquest ok");
			}
			return dataRequestParams(conn, obj, asList,debug);
		} else if (conn.getResponseCode() != 200) {
			if (debug) {
				log.error("ErrorCode: " + conn.getResponseCode());
				log.error("Error: " + conn.getResponseMessage());
			}
			throw new RuntimeException("Failed code: " + conn.getResponseCode() + " --> " + conn.getResponseMessage());
		}

		conn.disconnect();
		return null;
	}

	@Override
	public Object delete(ClientBuilderRest data, Class<?> obj, Boolean asList, Boolean debug) throws IOException, URISyntaxException {

		data = dataQueryParams(data);

		HttpURLConnection conn = dataConectionHeaders(data, "DELETE", debug);

		if (conn.getResponseCode() == 200) {
			if (debug) {
				log.info("resquest ok");
			}
			return dataRequestParams(conn, obj,asList, debug);
		} else if (conn.getResponseCode() != 200) {
			if (debug) {
				log.error("ErrorCode: " + conn.getResponseCode());
				log.error("Error: " + conn.getResponseMessage());
			}
			throw new RuntimeException("Failed code: " + conn.getResponseCode() + " --> " + conn.getResponseMessage());
		}

		conn.disconnect();
		return null;
	}

	private HttpURLConnection dataConectionHeaders(ClientBuilderRest data, String method, Boolean debug)
			throws IOException, URISyntaxException {
		URL url = new URL(data.getUrl());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod(method);

		String propietyheaders = "";

		Iterator<String> it = data.getListRequestHeaders().keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = data.getListRequestHeaders().get(key);

			conn.setRequestProperty(key, value);
			propietyheaders = propietyheaders + " -H " + key + "=" + value;
		}

		if (debug) {
			log.info("CALL: " + method + "  " + conn.getURL().toURI().toString() + "  " + propietyheaders + " -d " + data.getBody());
		}

		return conn;
	}

	private ClientBuilderRest dataQueryParams(ClientBuilderRest data) {

		if (data.getListRequestQueryParams() != null) {
			data.setUrl(data.getUrl() + "?");

			data.getListRequestQueryParams().forEach((key, value) -> {
				data.setUrl(data.getUrl() + key + "=" + value + "&");
			});
			data.setUrl(data.getUrl().substring(0, data.getUrl().length() - 1));
		}
		return data;
	}

	private Object dataRequestParams(HttpURLConnection conn, Class<?> obj, Boolean asList, Boolean debug) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String result = "";
			String output = br.readLine();

			while (output != null) {
				result += output;
				output = br.readLine();
			}

			if (obj == null) {
				return result;
			} else {
				if(asList) {
					return castingArrayList(result, obj);
				}else {
					return new Gson().fromJson(result, obj);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

	private <T> List<T> castingArrayList(String json, Class<?> obj) {

		Type type = TypeToken.getParameterized(ArrayList.class, obj).getType();

		return new Gson().fromJson(json, type);
	}
}
