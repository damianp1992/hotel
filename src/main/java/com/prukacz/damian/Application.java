package com.prukacz.damian;

import com.prukacz.damian.configuration.HibernateProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Import(value = {HibernateProperties.class})
@EnableJpaRepositories(basePackages = { "com.prukacz.damian.repository" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
