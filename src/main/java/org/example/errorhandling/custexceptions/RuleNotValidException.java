package org.example.errorhandling.custexceptions;

import org.example.errorhandling.FXErrorCodes;

public class RuleNotValidException extends RulesException {

	

	private String message = null;

	public RuleNotValidException() {
		super();
	}

	public RuleNotValidException(String message) {
		super(message);
		this.message = message;

	}

	@Override
	public String getMessage() {
		return message;
	}
}
