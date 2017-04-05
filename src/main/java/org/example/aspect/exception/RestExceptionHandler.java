package org.example.aspect.exception;


import org.example.exception.ReadException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


/*@ControllerAdvice*/
public class RestExceptionHandler {
	

	@ExceptionHandler(Exception.class)
	public void exception(Exception e) {
		
		System.out.println("handled in REST");
	}
	
	@ExceptionHandler(ReadException.class)
	public String rederExceptionHandle(ReadException e) {

		System.out.println("handled in REST");
		return e.toString();
	}

}
