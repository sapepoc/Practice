package org.example.controller;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

import javax.xml.transform.TransformerConfigurationException;

import org.example.DTO.DataUnMarshallar;
import org.example.entities.RuleEngine;
import org.example.entities.RuleGroups;
import org.example.entities.Trades;
import org.example.enums.EngineType;
import org.example.errorhandling.FXErrorCodes;

import org.example.services.ProxyService;
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
