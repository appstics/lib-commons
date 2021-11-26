package com.jkstic.libcommons.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jkstic.libcommons.enums.ProcessorEnum;
import com.jkstic.libcommons.enums.ProcessorInCoreEnum;

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
public class ProcessorDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nameThread;
	private String moneda;
	private Double margen_beneficio;
	private Double margen_perdidas;
	private Boolean notification_telegram;
	private Boolean notification_email;
	private ProcessorEnum state;
	private Long idUser;
	
	@JsonIgnore
	private ProcessorInCoreEnum stateInCore;
	
	
}
