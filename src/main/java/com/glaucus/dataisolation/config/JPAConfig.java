package com.glaucus.dataisolation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author ankita.aswal
 *
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.glaucus.dataisolation.repository")
public class JPAConfig {

}
