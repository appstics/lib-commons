package com.jkstic.libcommons.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ExangeDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nombre;
	private float volumen;
	private String data;
}
