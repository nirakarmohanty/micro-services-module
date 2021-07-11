package src.coding.tutor.patient.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import src.coding.tutor.patient.service.bo.PathologyDetailsBO;
import src.coding.tutor.patient.service.entity.Patient;
import src.coding.tutor.patient.service.svc.PatientService;

@RestController
@RequestMapping(value = "/patient")
public class PatientController {
	@Autowired
	private PatientService patientService;
	
	@RequestMapping(value = "/sayHello", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello Patinet Service!";
	}
	
	@PostMapping("/savePatient")
	public Patient savePatient(@RequestBody Patient patient) {		
		return patientService.savePatient(patient);
	}
	
	@GetMapping(value = "/patient-patholgoy")
	public PathologyDetailsBO getPatientWithPathology(String id) {
		return patientService.getPatientWithPathologyDetails(Long.valueOf(id));
	}
	
	@GetMapping(value = "/patient-patholgoy-feign")
	public PathologyDetailsBO getPatientWithPathologyByFeign(String name) {
		return patientService.getPatientWithPathologyDetailsByFeign(name);
	}
	
}
