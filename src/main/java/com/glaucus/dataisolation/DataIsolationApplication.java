package com.glaucus.dataisolation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author ankita.aswal
 *
 */

@SpringBootApplication
public class DataIsolationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataIsolationApplication.class, args);
	}

}
