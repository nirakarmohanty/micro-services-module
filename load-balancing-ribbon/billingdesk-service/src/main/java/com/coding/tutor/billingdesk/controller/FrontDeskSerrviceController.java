package com.coding.tutor.billingdesk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.tutor.frontdesk.entity.FrontDesk;
import com.coding.tutor.frontdesk.servcie.FrontDeskService;

import lombok.Getter;

@RestController
@RequestMapping("/frontdesk")
public class FrontDeskSerrviceController {
	@Autowired
	private FrontDeskService frontDeskSvc;
	
	@GetMapping(value = "/hello")
	public String sayhello() {
		return "Hello Frontdesk Service";
	}
	@PostMapping(value = "/saveFrontDesk")
	public FrontDesk save(@RequestBody FrontDesk requestObject) {		
		return frontDeskSvc.saveFrontDeskData(requestObject);		
	}
	
	@GetMapping(value = "/getById/{id}")
	public FrontDesk getFrontDesk(@PathVariable String id) {		
		return frontDeskSvc.getFrontDesk(Long.valueOf(id));		
	}
}
