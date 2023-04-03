package com.jkstic.libcommons.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

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
public class ProcessorRuleDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String observator;
	private String action;
	private String price;
	private Boolean notification;
	
	@JsonIgnore
	private LocalDateTime createdAt;

	@JsonIgnore
	private LocalDateTime updatedAt;
	
}
