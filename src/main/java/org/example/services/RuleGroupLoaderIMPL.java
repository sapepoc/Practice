package org.example.services;


import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import org.example.entities.RuleGroups;
import org.example.entities.Trade;
import org.example.entities.Trades;
import org.example.errorhandling.Loggable;
import org.springframework.stereotype.Component;


@Component
public class RuleGroupLoaderIMPL implements RuleGroupLoader {
	
    private boolean rules=true;	
	
	@Loggable
	@Override
	public RuleGroups getRuleGroups() throws Exception{

		return null;
	
		
	}

}
