package com.example.AOPdemo.data;

import org.springframework.stereotype.Repository;

import com.example.AOPdemo.aspects.TrackTime;

@Repository
public class Dao_one {
	
	@TrackTime
	public String retrieveinfo() {
		return "Hello, retrieved from doa 1 ";
		
	}

}
