package com.glaucus.dataisolation.service;

import org.springframework.stereotype.Component;

import com.glaucus.dataisolation.model.NumberIncrement;

@Component
public interface IncrementService {

	//increment count value by 1 in database
	public NumberIncrement saveIncrementCount();

	//get count value from database
	public int getCount();
}
