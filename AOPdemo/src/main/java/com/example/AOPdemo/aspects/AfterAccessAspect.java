package com.example.AOPdemo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect // Aspect is the combination of advice and pointcut
@Configuration
public class AfterAccessAspect{
	
	private Logger log=LoggerFactory.getLogger(this.getClass());
	
	//what kind of method calls to intercept
	//execution(* com.example.AOPdemo.business.*.*(..))--->This expression is called PointCut,which defines what methods/method calls should be intercepted
	//Weaving-->Process of implementing spring AOP around method calls  & Waver--->Framework  used of weaving
	
	@AfterReturning(value="com.example.AOPdemo.aspects.PointcutJunction.businessLayer()",returning = "result")
	
	// Joinpoint ---->Specific interception of method calls
	
	public void afterreturning(JoinPoint joinpoint,Object result) {
		//Advice -->what should be done
		log.info("{} returned the value RESULT= {} ",joinpoint,result);
		
	}
	
	}
