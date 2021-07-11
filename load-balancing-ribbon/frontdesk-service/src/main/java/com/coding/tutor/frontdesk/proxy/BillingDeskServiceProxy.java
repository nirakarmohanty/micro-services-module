package com.coding.tutor.frontdesk.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.coding.tutor.frontdesk.proxy.bo.BillDeskBO;

//@FeignClient(name = "billing-service", url = "localhost:8089/billingSvc")
@FeignClient(name = "billing-service")
@RibbonClient(name = "billing-service")

public interface BillingDeskServiceProxy {
	
	@PostMapping("/save/{patientId}")
	public BillDeskBO saveBillDesk(@PathVariable long patientId);
}
