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
public class walletBinanceDto implements Serializable  {

	private static final long serialVersionUID = 1L;
	private String coin;
	private String name;
	private String cantidad;
	private String locked;
	private String freeze;
}
