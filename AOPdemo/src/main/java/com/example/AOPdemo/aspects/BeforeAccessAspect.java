package com.example.AOPdemo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect // Aspect is the combination of advice and pointcut
@Configuration
public class BeforeAccessAspect {
	
	private Logger log=LoggerFactory.getLogger(this.getClass());
	
	//what kind of method calls to intercept
	//execution(* com.example.AOPdemo.business.*.*(..))--->This expression is called PointCut,which defines what methods/method calls should be intercepted
	//Weaving-->Process of implementing spring AOP around method calls  & Waver--->Framework  used of weaving
	@Before("com.example.AOPdemo.aspects.PointcutJunction.businessLayer()")
	
	// Joinpoint ---->Specific interception of method calls
	
	public void before(JoinPoint joinpoint) {
		//Advice -->what should be done
		log.info("Allowed execution for {} ",joinpoint);
		
	}
	
	}
