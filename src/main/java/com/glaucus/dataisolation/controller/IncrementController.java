package com.glaucus.dataisolation.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

	@PostMapping("increment")
	public NumberIncrement incrementCount() {

		return incrementService.saveIncrementCount();
	}
}
