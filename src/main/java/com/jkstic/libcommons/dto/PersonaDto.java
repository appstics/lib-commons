package com.jkstic.libcommons.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
public class PersonaDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private Long id;
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String email;
	private String telefono;
	private String telegram;
}
