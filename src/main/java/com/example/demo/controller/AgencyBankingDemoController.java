/*
 * package com.example.demo.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.example.demo.request.AgencyRequest; import
 * com.example.demo.response.AgencyResponse; import
 * com.example.demo.service.impl.AgencyServiceImpl; import
 * com.example.demo.util.AgencyConstants;
 * 
 * @RestController
 * 
 * @RequestMapping(AgencyConstants.CONTOLLER_ROOT_PATH) public class
 * AgencyBankingDemoController {
 * 
 * @Autowired private AgencyServiceImpl agencyService;
 * 
 * @PostMapping public ResponseEntity<AgencyResponse> registerAgent(@RequestBody
 * AgencyRequest agencyRequest) {
 * 
 * return ResponseEntity.ok(agencyService.registerAgent(agencyRequest));
 * 
 * } }
 */