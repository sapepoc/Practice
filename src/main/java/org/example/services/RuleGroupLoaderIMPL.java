package org.example.services;


import org.example.custexceptions.RuleNotFoundException;
import org.example.entities.RuleGroups;
import org.example.errorhandling.FXErrorCodes;
import org.example.errorhandling.Loggable;
import org.springframework.stereotype.Service;

@Service
public class RuleGroupLoaderIMPL implements RuleGroupLoader {
	
    private boolean rules=true;	
	
	@Loggable
	@Override
	public RuleGroups getRuleGroups() {
		
		System.out.println("Loading Rules Loaded");	
		
	/*	if(rules)
		{
		throw new RuleNotFoundException("FXError code is "+FXErrorCodes.RULE_NOT_FOUND+
				" error description " +FXErrorCodes.RULE_NOT_FOUND.getInfoMessage());
		}
		else*/			
		return null;
	
		
	}

}
