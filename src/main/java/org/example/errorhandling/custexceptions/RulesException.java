package org.example.errorhandling.custexceptions;


public class RulesException extends RuntimeException {

	private String message = null;

	public RulesException() {
		super();
	}

	public RulesException(String message) {
		super(message);
		this.message = message;

	}

	@Override
	public String getMessage() {
		return message;
	}

}
