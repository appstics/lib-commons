package com.jkstic.libcommons.dto;

import java.io.Serializable;
import java.util.Date;

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
public class TransactionDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Date date;
	private String par;
	private String side;
	private String price;
	private Double executed;
	private String executedPair;
	private Double amount;
	private String amountPair;
	private Double fee; 
	private String feePair;
}
