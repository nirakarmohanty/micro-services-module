package src.coding.tutor.doctor.service.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.coding.tutor.doctor.service.entity.Doctor;
import src.coding.tutor.doctor.service.repository.DoctorServiceRepository;

@Component
public class DoctorServiceDAO {

	@Autowired
	private DoctorServiceRepository repository;

	public Doctor saveDoctor(Doctor entity) {
		return repository.save(entity);
	}

	public Doctor getDoctor(long id) {
		return repository.findById(id).get();
	}

	public List<Doctor> getAllDoctor() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
}
