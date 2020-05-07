package com.example.AOPdemo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AOPdemo.data.Dao_two;

@Service
public class Business_two {
	
	@Autowired
	public Dao_two dao2;
	
	public String calculate() {
		return dao2.retrieveinfo();
		
	}
	
	
	

}
