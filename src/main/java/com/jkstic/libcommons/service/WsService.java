package com.jkstic.libcommons.service;

import java.net.URISyntaxException;

import com.jkstic.libcommons.ClientBuilderWs;

public interface WsService {
	
	public void connect(ClientBuilderWs client) throws URISyntaxException;

}
