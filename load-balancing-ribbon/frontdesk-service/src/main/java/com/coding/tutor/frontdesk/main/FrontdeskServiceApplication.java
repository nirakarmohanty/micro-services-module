package com.coding.tutor.frontdesk.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(scanBasePackages = { "com.coding.tutor.frontdesk.*" ,"com.coding.tutor.frontdesk.proxy"})
@EnableJpaRepositories("com.coding.tutor.frontdesk.repository")
@EntityScan("com.coding.tutor.frontdesk.*")
//@EnableFeignClients(basePackages = {"com.coding.tutor.frontdesk.proxy"})
@EnableFeignClients
@ComponentScan(basePackages ="com.coding.tutor.frontdesk.proxy" )
@RestController
public class FrontdeskServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontdeskServiceApplication.class, args);
	}
	
	@GetMapping(value = "/hello")
	public String sayhello() {
		return "Hello Frontdesk Service";
	}
	
}
