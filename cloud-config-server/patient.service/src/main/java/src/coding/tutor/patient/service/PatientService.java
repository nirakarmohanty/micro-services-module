package src.coding.tutor.patient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import src.coding.tutor.patient.service.bo.PatientFeeDetails;
import src.coding.tutor.patient.service.dao.PatientDAO;
import src.coding.tutor.patient.service.entity.Patient;

@Component
public class PatientService {

	@Autowired
	private PatientDAO patientDao;
	@Value("${patient.fee}")
	private int patientFee;
	@Value("${service.tax}")
	private int tax;

	public Patient savePatient(Patient patient) {
		return patientDao.savePatient(patient);
	}

	public Patient findById(long id) {
		// TODO Auto-generated method stub
		return patientDao.findById(id);
	}

	public List<Patient> findAll() {

		return patientDao.findAll();
	}

	public PatientFeeDetails getPatientFeeDetails() {
		PatientFeeDetails patientFeeDetails = new PatientFeeDetails();
		patientFeeDetails.setPatientFee(patientFee);
		patientFeeDetails.setTax(tax);
		return patientFeeDetails;
	}

}
