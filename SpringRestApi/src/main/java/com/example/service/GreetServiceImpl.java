package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class GreetServiceImpl implements GreetService{

	

	@Override
	public String welcomeUser(String name) {
		// TODO Auto-generated method stub
		return "welcome" + name.toUpperCase();
	}
	@Override
	public String printname(String name) {
		// TODO Auto-generated method stub
		return "Hello"+name.toLowerCase();
	}

	@Override
	public String showMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
