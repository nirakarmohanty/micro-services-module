package src.coding.tutor.patient.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import src.coding.tutor.patient.service.PatientService;
import src.coding.tutor.patient.service.bo.PatientFeeDetails;
import src.coding.tutor.patient.service.entity.Patient;

@RestController
@RequestMapping(value = "/patient")
public class PatientServiceController {

	@Autowired
	private PatientService patientService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String getPatientSvc() {
		return "Hello patient Service!";
	}

	@RequestMapping(value = "/save", method = RequestMethod.PUT)
	public Patient savePatient(@RequestBody Patient patient) {
		return patientService.savePatient(patient);
	}
	//http://localhost:8082/patient/search/2
	@GetMapping(value = "/search/{id}")
	public Patient findPatientById(@PathVariable("id") long id) {
		return patientService.findById(id);
	}

	@GetMapping(value = "/findAll")
	public List<Patient> findAllPatient() {
		return patientService.findAll();
	}
	@GetMapping(value="/getPatientFee")
	public PatientFeeDetails getpatientFeeDetails() {
		return patientService.getPatientFeeDetails();
	}
}
