package com.glaucus.dataisolation.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.glaucus.dataisolation.model.NumberIncrement;

/**
 * @author ankita.aswal
 *
 */
@Repository
public interface NumberRepository extends CrudRepository<NumberIncrement, Integer> {
	@Query(
			value = "SELECT * FROM numberincrement n WHERE n.id = 1 FOR UPDATE", 
			nativeQuery = true)
	NumberIncrement findOne(int id);
}
