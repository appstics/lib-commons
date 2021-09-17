package com.jkstic.libcommons;

import java.io.Serializable;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientBuilderRest implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String url;
	private Map<String,String> listRequestHeaders;
	private Map<String,String> listRequestPathParams;
	private Map<String,String> listRequestQueryParams;
	private String body;
	
}
