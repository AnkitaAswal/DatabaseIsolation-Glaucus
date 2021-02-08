package com.glaucus.dataisolation.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaucus.dataisolation.model.NumberIncrement;
import com.glaucus.dataisolation.repository.NumberRepository;
import com.glaucus.dataisolation.service.IncrementService;

/**
 * @author ankita.aswal
 *
 */
@Service

/**
 * Transactional default values: 
 * isolation=READ_COMMITTED
 * propagation=REQUIRED
 */
@Transactional
public class IncrementServiceImpl implements IncrementService {

	@Autowired
	NumberRepository numberRepository;
	
	@Override
	public NumberIncrement saveIncrementCount() {
		NumberIncrement  number=numberRepository.findOnePessimistic(1);
		if(number!=null) {
			number.setCount(number.getCount()+1);
			numberRepository.save(number);
		}

		return number;
	}
	
	@Override
	public int getCount() {
		return numberRepository.findOnePessimistic(1).getCount();
	}
}
