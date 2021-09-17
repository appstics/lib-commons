package com.jkstic.libcommons.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserEmailDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nameUser;
	private String email;
}
