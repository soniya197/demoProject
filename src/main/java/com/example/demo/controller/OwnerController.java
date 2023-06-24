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

import com.example.demo.request.OwnerRequest;
import com.example.demo.request.UserRequest;
import com.example.demo.response.OwnerResponse;
import com.example.demo.response.OwnerResponseInfo;
import com.example.demo.service.OwnerService;
import com.example.demo.util.OwnerConstants;

@RestController
@RequestMapping(OwnerConstants.CONTROLLER_ROOT_PATH)
public class OwnerController {

	@Autowired // owner service
	private OwnerService ownerService;

	@PostMapping("owner")// owner mapping
	public ResponseEntity<OwnerResponse> callOwnerRegister(@RequestBody OwnerRequest ownerRequest) {
		return ResponseEntity.ok(ownerService.OwnerRegister(ownerRequest));
	}

	@GetMapping("getByOwner/{firstName}/{secondName}")
	public ResponseEntity<OwnerResponseInfo> getallusers(@PathVariable String firstName,
			@PathVariable String secondName) {
		return ResponseEntity.ok(ownerService.getOwnerByFirstName(firstName, secondName));
	}

	@PutMapping("updateOwnerData/{firstName}/{secondName}")
	public ResponseEntity<OwnerResponseInfo> updateOwnerData(@PathVariable String firstName,
			@PathVariable String secondName, @RequestBody UserRequest userRequest) {
		return ResponseEntity.ok(ownerService.updateOwnerData(firstName, secondName, userRequest));
	}
}
