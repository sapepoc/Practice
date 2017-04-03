package org.example.services;


import org.example.entities.RuleEngine;
import org.example.enums.EngineType;

public interface RuleEngineBuilder {

	RuleEngine buildRuleEngine(EngineType engineType);

}
