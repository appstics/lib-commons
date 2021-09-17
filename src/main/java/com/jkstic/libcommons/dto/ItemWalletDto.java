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
public class ItemWalletDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nameCoin;
	private double cantidad;
	private double precioCompra;
	private boolean wallet;
	
	private ExangeDto id_exchanges;
	private UsersDto id_users;
}
