package com.coding.tutor.frontdesk.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = { "com.coding.tutor.frontdesk" })
@EnableJpaRepositories("com.coding.tutor.frontdesk.repository")
@EntityScan("com.coding.tutor.frontdesk.*")
public class FrontdeskServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontdeskServiceApplication.class, args);
	}

}
