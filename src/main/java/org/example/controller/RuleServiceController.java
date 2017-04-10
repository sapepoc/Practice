package org.example.controller;

import org.example.DTO.DataUnMarshallar;
import org.example.entities.RuleGroups;
import org.example.enums.EngineType;
import org.example.errorhandling.FXErrorCodes;

import org.example.services.ProxyService;
import org.example.services.RuleEngine;
import org.example.services.RuleEngineBuilder;
import org.example.services.RuleGroupLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RuleServiceController {

	@Autowired
	RuleGroupLoader ruleGroupLoader;
	@Autowired
	ProxyService proxyService;

	@Autowired
	DataUnMarshallar dataUnMarshallar;

	@Autowired
	RuleEngineBuilder ruleEngineBuilder;
	@Autowired
	RuleEngine ruleEngine;

	EngineType engineType;

	public void start() {

		System.out.println(FXErrorCodes.Series.EVENTS.toString()+" "+FXErrorCodes.ALERT_NOT_FOUND.getInfoMessage());

		RuleGroups ruleGroups = ruleGroupLoader.getRuleGroups();
		String data = proxyService.getData();
		dataUnMarshallar.unmarshal(data);
		FXErrorCodes.ALERT_NOT_FOUND.getInfoMessage();
		
		
		
	}

}
