package com.glaucus.dataisolation.service;

import org.springframework.stereotype.Component;

import com.glaucus.dataisolation.model.NumberIncrement;

@Component
public interface IncrementService {

	public NumberIncrement saveIncrementCount();
}
