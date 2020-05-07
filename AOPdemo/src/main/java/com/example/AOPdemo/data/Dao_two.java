package com.example.AOPdemo.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao_two {
	
	public String retrieveinfo() {
		return "Hello, retrieved from doa 2";
		
	}

}
