package src.coding.tutor.patient.service.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import src.coding.tutor.patient.service.bo.PathologyDetailsBO;

@FeignClient(name = "pathology-service",url = "localhost:8085/pathology")
public interface PathologyServiceProxy {
	
	/*
	 * @GetMapping(value = "/searchByName/{id}") 
	 * public PathologyDetailsBO retrivePathology(@PathVariable Long id);
	 */
	@GetMapping(value = "/search/{id}")
	public PathologyDetailsBO retrivePathologyById(@PathVariable long id) ;

}
