package com.example.demo.service;

import com.example.demo.request.AgencyRequest;
import com.example.demo.response.AgencyResponse;

public interface AgencyService {

	public AgencyResponse registerAgent(AgencyRequest agencyRequest);
}
