package com.example.AOPdemo.aspects;

import org.aspectj.lang.annotation.Pointcut;


// A class to keep all the pointcuts at one place
public class PointcutJunction {
	
	//intercept the method calls in the business package
	@Pointcut("execution(* com.example.AOPdemo.business.*.*(..))")
	public void businessLayer() {
		
	}
	
	//intercept the method calls in the Dao package
	@Pointcut("execution(* com.example.AOPdemo.data.*.*(..))")
	public void dataLayer() {
		
	}
	
	// all the beans with dao in the name are matched by this pointcut
	@Pointcut("bean(*dao*)")
	public void beanContainingdao() {}
	
	//intercept all method calls within this package mentioned
	@Pointcut("within(com.example.AOPdemo.data..*)")
	public void datalayerexecutionWithin() {}
	
	
	//Tracktime is the custom annotation created to track the performance of the methods,defining it here in pointcut 
	@Pointcut("@annotation(com.example.AOPdemo.aspects.TrackTime)")
	public void tracktimeannotation() {}

}
