package org.example.services;


import org.example.entities.RuleGroups;
import org.example.exception.ReadException;
import org.springframework.stereotype.Service;

@Service
public class RuleGroupLoaderIMPL implements RuleGroupLoader {

	@Override
	public RuleGroups getRuleGroups() {
		
		System.out.println("Rules Loaded");
		return null;
		// TODO Auto-generated method stub
	
		
	}

}
