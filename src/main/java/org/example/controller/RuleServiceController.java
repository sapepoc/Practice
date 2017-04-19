package org.example.controller;



import java.io.File;

import org.drools.common.EventFactHandle;
import org.drools.runtime.rule.FactHandle;
import org.example.DTO.DataUnMarshallar;
import org.example.DTO.Person;
import org.example.entities.RuleGroups;
import org.example.entities.Trade;
import org.example.entities.Trades;
import org.example.enums.EngineType;
import org.example.errorhandling.FXErrorCodes;
import org.example.services.ProxyService;
import org.example.services.RuleEngine;
import org.example.services.RuleEngineBuilder;
import org.example.services.RuleGroupLoader;
import org.example.services.RuleService;
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
	RuleService ruleService;

	EngineType engineType;

	public void start() {
		
		File file = new File("D:/FX/Trade.xml");
		
		if(file.exists())
		{
			System.out.println("**********************file exists******************************");
		}
		
		else
		{
			System.out.println("*********************Does not  exists******************************");
		}
		try {
			Trades trades=dataUnMarshallar.unmarshal(file, Trades.class);
			ruleService.checkTrade(trades);
		    
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
	

}
