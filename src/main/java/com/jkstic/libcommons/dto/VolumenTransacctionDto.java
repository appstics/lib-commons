package com.jkstic.libcommons.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VolumenTransacctionDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Date from;
	private Date to;
	private Map<String,Integer> volumens;

}
