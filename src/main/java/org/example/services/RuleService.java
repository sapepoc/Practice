package org.example.services;


import org.drools.runtime.StatelessKnowledgeSession;
import org.example.entities.Trades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class RuleService {
	


		@Autowired
		private ApplicationContext applicationContext;

		public void checkTrade(Trades trades) {

			StatelessKnowledgeSession statelessKnowledgeSession = (StatelessKnowledgeSession) applicationContext
					.getBean("tradeSession");
			statelessKnowledgeSession.execute(trades.getTradeList());
		}
	
	

	
}
