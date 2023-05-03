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
public class PriceVolumenDto implements Serializable {

	private static final long serialVersionUID = -4209030312030465714L;

	private String name;
	private String volumen;
	private String price;
}
