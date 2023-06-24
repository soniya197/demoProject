package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.UserRequest;
import com.example.demo.response.UserResponse;
import com.example.demo.response.UserResponseInfo;
import com.example.demo.service.UserService;
import com.example.demo.util.UserConstants;

@RestController
@RequestMapping(UserConstants.CONTROLLER_ROOT_PATH)
public class UserController {

	@Autowired
	private UserService userSerive;

	@PostMapping
	public ResponseEntity<UserResponse> callUserRegister(@RequestBody UserRequest userRequest) {
		return ResponseEntity.ok(userSerive.userRegister(userRequest));

	}

	@GetMapping
	public ResponseEntity<UserResponseInfo> getallusers() {
		return ResponseEntity.ok(userSerive.getUserRegister());
	}

	@GetMapping("/getByUser/{userEmail}")
	public ResponseEntity<UserResponseInfo> getallusers(@PathVariable String userEmail) {
		return ResponseEntity.ok(userSerive.getUserByEmail(userEmail));
	}

	@PutMapping("updateUserData/{firstName}/{secondName}")
	public ResponseEntity<UserResponseInfo> updateOwnerData(@PathVariable String firstName,
			@PathVariable String secondName, @RequestBody UserRequest userRequest) {
		return ResponseEntity.ok(userSerive.updateOwnerData(firstName, secondName, userRequest));
	}

}
