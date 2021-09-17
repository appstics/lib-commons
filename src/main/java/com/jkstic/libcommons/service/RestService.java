package com.jkstic.libcommons.service;

import java.io.IOException;
import java.net.URISyntaxException;

import com.jkstic.libcommons.ClientBuilderRest;

public interface RestService<T> {
	
	public T get(ClientBuilderRest data, Class<?> obj)throws IOException, URISyntaxException;
	public T post(ClientBuilderRest data, Class<?> obj) throws IOException, URISyntaxException;
	public T put(ClientBuilderRest data, Class<?> obj) throws IOException, URISyntaxException;
	public T delete(ClientBuilderRest data, Class<?> obj) throws IOException, URISyntaxException;
}
