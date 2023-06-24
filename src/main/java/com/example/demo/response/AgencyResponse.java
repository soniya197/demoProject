package com.example.demo.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgencyResponse {

	private String name;
	private String domain;
	private String mobileNumber;
	private String Address;

}
