package com.anthem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anthem.component.IBenefitsService;

@RestController
@RequestMapping("/data")
public class BenefitsController {
	@Autowired
	private IBenefitsService ibenefitsService;

	@RequestMapping(value = "/benefits", method = RequestMethod.POST, produces = "application/json")
	public Benefits getBenefitsbyUserId(
			@RequestParam(value = "id", required = false, defaultValue = "0") final String id) {
		Benefits benefits = ibenefitsService.getBenefitsDetails(id);
		return benefits;
	}
}