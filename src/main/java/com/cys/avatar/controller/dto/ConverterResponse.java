package com.cys.avatar.controller.dto;

import lombok.Data;

@Data
public class ConverterResponse {

	private String id;

	private ConverterEnum type;

	private String result;
}
