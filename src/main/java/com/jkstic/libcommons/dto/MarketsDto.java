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
public class MarketsDto  implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private ExangeDto id_exchanges;
	private String base_simbol;
	private String base_quote;
	private double price;
	private int isactive;
	private double min_inv;
	private double comision_market;
	private double comision_maker;
}
