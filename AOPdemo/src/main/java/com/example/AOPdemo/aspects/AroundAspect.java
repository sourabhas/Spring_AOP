package com.example.AOPdemo.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect // Aspect is the combination of advice and pointcut
@Configuration
public class AroundAspect {
	
	private Logger log=LoggerFactory.getLogger(this.getClass());
	
	/* //when calculating performance of whole business layer
	@Around("com.example.AOPdemo.aspects.PointcutJunction.businessLayer()")  */
	
	//when calculating performance of any particular methods only using Tracktime -->which is defined in Pointcut
	@Around("com.example.AOPdemo.aspects.PointcutJunction.tracktimeannotation()")
	
	
	// Joinpoint ---->Specific interception of method calls
	//ProceedingJoinpoint-allows continuation of execution even after interception
	
	public void arroundprocess(ProceedingJoinPoint joinpoint) throws Throwable {
	
		//Advice -->what should be done
		//around advice is having both before, after work as well as during the process-> work to be done.
		long start_time=System.currentTimeMillis();
		
		joinpoint.proceed();
		
		long time_taken=System.currentTimeMillis()-start_time;
		log.info("the time taken by method{} is {} ",joinpoint,time_taken);
		
		}
	
	}
