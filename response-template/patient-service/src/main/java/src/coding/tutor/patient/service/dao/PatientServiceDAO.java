package src.coding.tutor.patient.service.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.coding.tutor.patient.service.entity.Patient;
import src.coding.tutor.patient.service.repo.PatientSvcRepository;

@Component
public class PatientServiceDAO {

	@Autowired
	private PatientSvcRepository patientSvcRepo;
	
	public Patient savePatient(Patient patient) {
		return patientSvcRepo.save(patient);
	}

	public Patient getPatientDetails(String name) {
		return patientSvcRepo.findByName(name);
		
	}
	public Patient getPatientDetailsById(long  id) {
		return patientSvcRepo.findById(id).get();
		
	}

	public Patient getPatientDetailsByName(String name) {
		return patientSvcRepo.findByName(name);
	}
}
