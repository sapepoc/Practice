package org.example.aspect.exception;


import org.example.exception.ReadException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class RestExceptionHandler {
	
//	 private static final Logger logger = LoggerFactory.getLogger(MyControllerAdviceDemo.class);
	

	@ExceptionHandler(Exception.class)
	public void exception(Exception e) {

		// logger.info("handleIOException - Catching: " + ex.getClass().getSimpleName());
	}
	
	@ExceptionHandler(ReadException.class)
	public String rederExceptionHandle(ReadException e) {

		return "error";
	}

}
