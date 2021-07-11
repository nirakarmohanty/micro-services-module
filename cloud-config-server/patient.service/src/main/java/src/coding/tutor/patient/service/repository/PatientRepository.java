package src.coding.tutor.patient.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import src.coding.tutor.patient.service.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
