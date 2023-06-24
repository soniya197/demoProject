package com.example.demo.service;

import com.example.demo.request.OwnerRequest;
import com.example.demo.request.UserRequest;
import com.example.demo.response.OwnerResponse;
import com.example.demo.response.OwnerResponseInfo;

public interface OwnerService {

	public OwnerResponse OwnerRegister(OwnerRequest ownerRequest);

	public OwnerResponseInfo getOwnerByFirstName(String firstName, String secondName);

	public OwnerResponseInfo updateOwnerData(String firstName, String secondName, UserRequest userRequest);


}
