package src.coding.tutor.patient.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import src.coding.tutor.patient.service.entity.Patient;

public interface PatientSvcRepository extends JpaRepository<Patient, Long> {

	Patient findByName(String name);

	

}
