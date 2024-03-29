package com.jkstic.libcommons.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConfigurationDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String llave;
	private String valor;
	
}
