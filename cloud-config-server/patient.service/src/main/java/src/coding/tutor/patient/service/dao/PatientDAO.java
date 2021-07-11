package src.coding.tutor.patient.service.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.coding.tutor.patient.service.entity.Patient;
import src.coding.tutor.patient.service.repository.PatientRepository;

@Component
public class PatientDAO {

	@Autowired
	private PatientRepository patientRepository;

	public Patient savePatient(Patient entity) {
		return patientRepository.save(entity);
	}

	public Patient findById(long id) {

		return patientRepository.findById(id).get();
	}

	public List<Patient> findAll() {

		return patientRepository.findAll();
	}

}
