package com.coding.tutor.billdesk.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.tutor.billdesk.service.BillDeskService;
import com.coding.tutor.billdesk.service.entity.BillDesk;

@RestController
@RequestMapping("/billingSvc")
public class BillingServiceController {
	
	@Autowired
	private BillDeskService billService;

	@GetMapping(name = "/sayHello")
	public String sayHello() {
		return "hello Billing service!";
	}
	
	@PostMapping("/save/{patientId}")
	public BillDesk saveBillDesk(@PathVariable long patientId) {
		return billService.saveBillDesk(patientId);		
	}
	@GetMapping("/getBillDeskDetails/{patientId}")
	public BillDesk getBillDeskByID(@PathVariable long patientId) {
		return billService.getBillDeskByID(patientId);	
	}

}
