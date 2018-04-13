package com.nuinote.spring.aop.springaop.aspect;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	@Pointcut("execution(* com.nuinote.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {
		
	}
	
	@Pointcut("execution(* com.nuinote.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {
		
	}
	
	@Pointcut("com.nuinote.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution() "
			+ "&& com.nuinote.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution() ")
	public void allLayerExecution() {
		
	}
	
	@Pointcut("bean(*dao*)")
	public void beanContainingDao() {
		
	}
	
	@Pointcut("@annotation(com.nuinote.spring.aop.springaop.aspect.TrackTime)")
	public void trackTimeAnnotation() {
		
	}
}
