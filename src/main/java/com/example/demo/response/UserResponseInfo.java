package com.example.demo.response;

import java.util.List;

import com.example.demo.entity.UserData;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponseInfo {

	private Integer responseCode;
	private String responseMessage;
	private List<UserData> userList;
	private UserData userData;
}
