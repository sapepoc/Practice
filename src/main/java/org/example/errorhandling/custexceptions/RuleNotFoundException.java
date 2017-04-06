package org.example.errorhandling.custexceptions;

public class RuleNotFoundException extends RulesException {

	private String message = null;

	public RuleNotFoundException() {
		super();
	}

	public RuleNotFoundException(String message) {
		super(message);
		this.message = message;

	}

	@Override
	public String getMessage() {
		return message;
	}
}
