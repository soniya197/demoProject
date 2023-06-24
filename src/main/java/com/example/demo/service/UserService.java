package com.example.demo.service;

import com.example.demo.request.UserRequest;
import com.example.demo.response.UserResponse;
import com.example.demo.response.UserResponseInfo;

public interface UserService {// this is interface @Service should not be here

	public UserResponse userRegister(UserRequest userRequest);

	public UserResponseInfo getUserRegister();

	public UserResponseInfo getUserByEmail(String userEmail);

	public UserResponseInfo updateOwnerData(String firstName, String secondName, UserRequest userRequest);
}
