package com.coding.tutor.billdesk.service.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = { "com.coding.tutor.billdesk.service" })
@EnableJpaRepositories("com.coding.tutor.billdesk.service")
@EntityScan("com.coding.tutor.billdesk.service.entity")
public class BillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}

	

}
