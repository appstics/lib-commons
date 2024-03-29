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
public class UserPersonDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String user;
	private String pws;
	private String name;
	private String email;
	private String token;
	private String role;
}
