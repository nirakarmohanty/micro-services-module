package src.coding.tutor.patient.service.svc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import src.coding.tutor.patient.service.bo.PathologyDetailsBO;
import src.coding.tutor.patient.service.dao.PatientServiceDAO;
import src.coding.tutor.patient.service.entity.Patient;
import src.coding.tutor.patient.service.proxy.PathologyServiceProxy;

@Component
public class PatientService {
	
	@Autowired
	private PatientServiceDAO patientDao;
	
	@Autowired
	PathologyServiceProxy proxy;

	public Patient savePatient(Patient patient) {
		return patientDao.savePatient(patient);
	}

	public PathologyDetailsBO getPatientWithPathologyDetails(long id) {
		Patient patientDetails = patientDao.getPatientDetailsById(id);
		
		Map<String,Long> uriVariables=new HashMap();
		uriVariables.put("id", id);
		
		ResponseEntity<PathologyDetailsBO> responseEntity = 
				new RestTemplate().getForEntity("http://localhost:8085/pathology/search/{id}", 
				PathologyDetailsBO.class, uriVariables);
		PathologyDetailsBO patientBO = responseEntity.getBody();
		System.out.println(patientBO.toString());
		
		//PatientDetailBO patientBO= new PatientDetailBO();
		patientBO.setPatientName(patientDetails.getName());
		patientBO.setPatientAge(patientDetails.getAge());
		patientBO.setPatientId(patientDetails.getId());
		patientBO.setPatientsex(patientDetails.getSex());
		
		return patientBO;
	}

	public PathologyDetailsBO getPatientWithPathologyDetailsByFeign(String name) {
		Patient patientDetails = patientDao.getPatientDetailsByName(name);
		PathologyDetailsBO patientBO = proxy.retrivePathologyById(patientDetails.getId());
		patientBO.setPatientName(patientDetails.getName());
		patientBO.setPatientAge(patientDetails.getAge());
		patientBO.setPatientId(patientDetails.getId());
		patientBO.setPatientsex(patientDetails.getSex());
		
		return patientBO;
		
	}

}
