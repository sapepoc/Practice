package org.example.controller;

import java.util.Collections;
import java.util.List;

import org.example.DTO.DataUnMarshallar;
import org.example.entities.RuleEngine;
import org.example.entities.RuleGroups;
import org.example.entities.Trades;
import org.example.enums.EngineType;
import org.example.services.ProxyService;
import org.example.services.RuleEngineBuilder;
import org.example.services.RuleGroupLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

		RuleGroups ruleGroups = ruleGroupLoader.getRuleGroups();
		String data = proxyService.getData();
	    List<Trades> tradeList = dataUnMarshallar.unmarshal(data);
		RuleEngine ruleEngine = ruleEngineBuilder.buildRuleEngine(engineType);
	  //  Collections.synchronizedMap(m)

	}


}
