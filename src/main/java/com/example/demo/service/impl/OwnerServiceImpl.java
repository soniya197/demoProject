package com.example.demo.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.OwnerData;
import com.example.demo.entity.UserData;
import com.example.demo.repository.OwnerRepository;
import com.example.demo.request.OwnerRequest;
import com.example.demo.request.UserRequest;
import com.example.demo.response.OwnerResponse;
import com.example.demo.response.OwnerResponseInfo;
import com.example.demo.response.UserResponseInfo;
import com.example.demo.service.OwnerService;
import com.example.demo.util.OwnerConstants;
import com.example.demo.util.UserConstants;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OwnerServiceImpl implements OwnerService {

	@Autowired
	private OwnerRepository ownerRepository;

	@Override
	public OwnerResponse OwnerRegister(OwnerRequest ownerRequest) {

		OwnerData ownerData = new OwnerData();
		BeanUtils.copyProperties(ownerRequest, ownerData);

		ownerRepository.save(ownerData);

		OwnerResponse ownerResponse = new OwnerResponse();
		ownerResponse.setResponseCode(UserConstants.SuccessCode);
		ownerResponse.setResponseMessage("Registred Successfully");
		return ownerResponse;

	}

	@Override
	public OwnerResponseInfo getOwnerByFirstName(String firstName, String secondName) {
		log.info("Incoming request==" + firstName, secondName);
		OwnerData ownerData = ownerRepository.findByFirstNameAndSecondName(firstName, secondName);
		OwnerResponseInfo ownerInfo = new OwnerResponseInfo();
		if (ownerData == null) {
			ownerInfo.setResponseMessage("No data found for given first name and second name");
			ownerInfo.setResponseCode(206);
		} else {
			ownerInfo.setResponseCode(OwnerConstants.SuccessCode);
			ownerInfo.setOwnerData(ownerData);
		}

		return ownerInfo;
	}
	@Override
	public OwnerResponseInfo updateOwnerData(String firstName, String secondName, UserRequest userRequest) {
		log.info("updateOwnerData request==" + firstName, secondName);
		OwnerData ownerData = ownerRepository.findByFirstNameAndSecondName(firstName, secondName);

		OwnerResponseInfo ownerInfo = new OwnerResponseInfo();
		if (ownerData == null) {
			ownerInfo.setResponseMessage("No data found for given first name and second name");
			ownerInfo.setResponseCode(206);
		} else {
			BeanUtils.copyProperties(userRequest, ownerData);

			ownerRepository.save(ownerData);
			ownerInfo.setResponseCode(OwnerConstants.SuccessCode);
			ownerInfo.setResponseMessage("User Data is updated successfully!");

		}

		return ownerInfo;
	}

}
