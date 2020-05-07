package com.example.AOPdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.AOPdemo.business.Business_one;
import com.example.AOPdemo.business.Business_two;

@SpringBootApplication
public class AoPdemoApplication implements CommandLineRunner  {
	
	private Logger log=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Business_one b1;
	
	@Autowired
	private Business_two b2;
	

	public static void main(String[] args) {
		SpringApplication.run(AoPdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		log.info(b1.calculate());
		log.info(b2.calculate());
		
		
		
		
	}

}
