package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.cybage")
@EnableJpaRepositories("com.cybage.repository")
@EntityScan("com.cybage.model")
public class ExcelSheetGenerationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcelSheetGenerationApplication.class, args);
	}

}
