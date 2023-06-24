package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserData;
import com.example.demo.repository.UserRepository;
import com.example.demo.request.UserRequest;
import com.example.demo.response.UserResponse;
import com.example.demo.response.UserResponseInfo;
import com.example.demo.service.UserService;
import com.example.demo.util.OwnerConstants;
import com.example.demo.util.UserConstants;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserResponse userRegister(UserRequest userRequest) {

		UserData userData = new UserData();
		BeanUtils.copyProperties(userRequest, userData);

		userRepository.save(userData);

		UserResponse userResponse = new UserResponse();
		userResponse.setResponseCode(UserConstants.SuccessCode);
		userResponse.setResponseMessage("Registred Successfully");
		return userResponse;
	}

	@Override
	public UserResponseInfo getUserRegister() {

		List<UserData> userList = userRepository.findAll();

		UserResponseInfo userInfo = new UserResponseInfo();
		userInfo.setResponseCode(UserConstants.SuccessCode);
		userInfo.setUserList(userList);
		return userInfo;
	}

	@Override
	public UserResponseInfo getUserByEmail(String userEmail) {
		UserData userData = userRepository.findByEmail(userEmail);

		UserResponseInfo userInfo = new UserResponseInfo();
		userInfo.setResponseCode(UserConstants.SuccessCode);
		userInfo.setUserData(userData);
		return userInfo;
	}

	@Override
	public UserResponseInfo updateOwnerData(String firstName, String secondName, UserRequest userRequest) {
		log.info("updateOwnerData request==" + firstName, secondName);
		UserData userData = userRepository.findByFirstNameAndSecondName(firstName, secondName);

		UserResponseInfo ownerInfo = new UserResponseInfo();
		if (userData == null) {
			ownerInfo.setResponseMessage("No data found for given first name and second name");
			ownerInfo.setResponseCode(206);
		} else {
			BeanUtils.copyProperties(userRequest, userData);

			userRepository.save(userData);
			ownerInfo.setResponseCode(OwnerConstants.SuccessCode);
			ownerInfo.setResponseMessage("User Data is updated successfully!");

		}

		return ownerInfo;
	}
}// you need to stop running port first then start , this error is coming since
	// app is running already
// 1 min
