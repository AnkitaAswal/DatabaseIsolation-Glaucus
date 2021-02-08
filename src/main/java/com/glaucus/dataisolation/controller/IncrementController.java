package com.glaucus.dataisolation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glaucus.dataisolation.model.NumberIncrement;
import com.glaucus.dataisolation.service.IncrementService;

/**
 * @author ankita.aswal
 *
 */
@RestController
@RequestMapping("/")
public class IncrementController {

	@Autowired
	private IncrementService incrementService;

	//post method to increment count value by 1 in database
	@PostMapping("increment")
	public NumberIncrement incrementCount() {

		return incrementService.saveIncrementCount();
	}
	
	//get method for getting count value from database
	@GetMapping("getCount")
	public int getCount() {
		return incrementService.getCount();
	}
}
