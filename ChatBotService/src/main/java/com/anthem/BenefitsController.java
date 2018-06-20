package com.anthem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anthem.component.IBenefitsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/data")
public class BenefitsController {
	@Autowired
	private IBenefitsService ibenefitsService;

	@RequestMapping(value = "/benefits", method = RequestMethod.POST, produces = "application/json")
	public Benefits getBenefitsbyUserId(
			@RequestHeader(value = "id", required = false, defaultValue = "4512223") final String id) {
		Benefits benefits = ibenefitsService.getBenefitsDetails(id);
		return benefits;
	}
	
	@RequestMapping(value = "/benefitsstring", method = RequestMethod.POST, produces = "text/html")
	public String getBenefitsbyUserIdString(
			@RequestHeader(value = "id", required = false, defaultValue = "4512223") final String id) throws JsonProcessingException {
		Benefits benefits = ibenefitsService.getBenefitsDetails(id);
		ObjectMapper mapper = new ObjectMapper();
		String outputString = mapper.writeValueAsString(benefits);
		
		return outputString;
	}
}