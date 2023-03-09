package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// Pointcut Declarations

//	Creating a Pointcut Declaration:
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {}
	
	// Advices
	
//  Applying the Pointcut Declaration to our Advice
	@Before("forDaoPackage()")
	public void beforeAnyMethodOfDaoPackage() {
		System.out.println("\n=====>>> Executing @Before advice on method (this @Before advice matches all of the methods from the \"com.luv2code.aopdemo.dao\" package)");
	}
	
//  Applying the Pointcut Declaration to our Advice
	@Before("forDaoPackage()")
	public void performApiAnalytics() {
		System.out.println("\n=====>>> Performing API analytics");
	}
	
	
}







