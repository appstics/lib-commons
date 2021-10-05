package com.jkstic.libcommons.ws.dto;

import java.util.List;

import com.jkstic.libcommons.dto.MarketsDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
@Data
public class MarketsStreamViewerDto {

	private List<MarketsDto> marketsList;
}
