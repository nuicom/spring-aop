package com.nuinote.spring.aop.springaop.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class AfterAopAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@AfterReturning(
			value = "com.nuinote.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()",
			returning = "result")
	public void afterReturning(JoinPoint joinpoint,Object result) {
		logger.info("{} returned with value {}",joinpoint,result);
	}
	
	@After(
			value = "com.nuinote.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void after(JoinPoint joinpoint) {
		logger.info("after execution of {}",joinpoint);
	}
	
}
