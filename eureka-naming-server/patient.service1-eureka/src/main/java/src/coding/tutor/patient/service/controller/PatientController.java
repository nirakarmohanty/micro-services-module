package src.coding.tutor.patient.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/patient")
public class PatientController {

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(long id) {
		return "";
	}
	@RequestMapping(value = "/sayHello", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello Patinet Service!";
	}
}
