package src.coding.tutor.doctor.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import src.coding.tutor.doctor.service.DoctorService;
import src.coding.tutor.doctor.service.bo.DoctorFeeDetails;
import src.coding.tutor.doctor.service.entity.Doctor;

@RestController
@RequestMapping(value = "/doctor")

public class DoctorServiceController {

	@Autowired
	private DoctorService doctorService;

	
	

	@PostMapping(path = "/save")
	public Doctor saveDoctor(@RequestBody Doctor doctor) {
		return doctorService.insertDoctor(doctor);
	}

	// http://localhost:8080/doctor-svc/doctor
	@RequestMapping(value = "/doctor", method = RequestMethod.GET)
	public String getDoctroSvc() {
		return "Hello Doctor Service!";
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public Doctor search(long id) {
		return doctorService.findDoctroById(id);
	}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public List<Doctor> findAll() {
		return doctorService.finAllDoctor();
	}

	@RequestMapping(value = "/getFee", method = RequestMethod.GET)
	public DoctorFeeDetails getFeeDetails() {
		return doctorService.getDoctorFeeDetails();
	}
}
