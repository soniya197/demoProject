package com.example.demo.response;

import java.util.List;
import com.example.demo.entity.OwnerData;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OwnerResponseInfo {

	private Integer responseCode;
	List<OwnerData> ownerList;
	OwnerData ownerData;
	private String responseMessage;
}
