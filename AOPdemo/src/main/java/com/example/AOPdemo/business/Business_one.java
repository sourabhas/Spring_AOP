package com.example.AOPdemo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AOPdemo.aspects.TrackTime;
import com.example.AOPdemo.data.Dao_one;

@Service
public class Business_one {
	
	@Autowired
	public Dao_one dao;
	
	@TrackTime
	public String calculate() {
		return dao.retrieveinfo();
		
	}
	
	
	

}
