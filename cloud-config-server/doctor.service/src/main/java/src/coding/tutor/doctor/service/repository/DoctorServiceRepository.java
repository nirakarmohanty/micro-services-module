package src.coding.tutor.doctor.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import src.coding.tutor.doctor.service.entity.Doctor;

@Repository
public interface DoctorServiceRepository extends JpaRepository<Doctor, Long>{

}
