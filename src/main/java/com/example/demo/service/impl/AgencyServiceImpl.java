/*
 * package com.example.demo.service.impl;
 * 
 * import org.springframework.beans.BeanUtils; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.example.demo.entity.AgentData; import
 * com.example.demo.repository.AgentRepository; import
 * com.example.demo.request.AgencyRequest; import
 * com.example.demo.response.AgencyResponse; import
 * com.example.demo.service.AgencyService; import
 * com.example.demo.util.MapperUtil;
 * 
 * import lombok.extern.slf4j.Slf4j;
 * 
 * @Service
 * 
 * @Slf4j public class AgencyServiceImpl implements AgencyService {
 * 
 * @Autowired private AgentRepository agentRepository;
 * 
 * 
 * @Autowired private MapperUtil mapperUtil;
 * 
 * @Override public AgencyResponse registerAgent(AgencyRequest agencyRequest) {
 * 
 * AgentData agentData = new AgentData();
 * BeanUtils.copyProperties(agencyRequest, agentData); AgentData agentDataSaved
 * = agentRepository.save(agentData);//same like this
 * 
 * AgencyResponse agencyResponse = new AgencyResponse();
 * 
 * // mapperUtil.mapAgentDataToAgencyResponse(agentDataSaved, agencyResponse);
 * agencyResponse.setAddress(agencyRequest.getAddress()); return agencyResponse;
 * 
 * }
 * 
 * }
 */