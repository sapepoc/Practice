package org.example.aspect.exception;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExceptionAspect {

	@Pointcut("execution(* org.example.DTO..*(..))")
	public void servicesPointCut() {

	}

	@AfterThrowing(pointcut = "execution(* org.example.DTO..*(..))", throwing = "Read")
	public void afterThrowingReadExc() {
		System.out.println("*************Caught Reader Exception Exception *****************");
	//	System.out.println(joinPoint.getSignature().toLongString() + " exception here!");
	}

	/*
	 * @AfterThrowing(pointcut = "execution(* org.example.DTO..*(..))", throwing
	 * = "FileN") public void afterThrowingExceptio() { System.out.
	 * println("*************Caught File Exception Exception *****************"
	 * ); }
	 */

	@AfterThrowing(pointcut = "servicesPointCut()", throwing = "FileN")
	public void dTOException() {
		System.out.println("*************Caught File Exception Exception *****************");
	}

	@AfterThrowing(pointcut = "servicesPointCut()", throwing = "Excep")
	public void superExceptionHandler() {
		System.out.println("*************Caught super Exception Exception *****************");
	}

	
	
}
