package src.coding.tutor.pathology.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import src.coding.tutor.pathology.service.entity.Pathology;

@Repository
public interface PathologyRepository extends JpaRepository<Pathology, Long>{

	Pathology findByName(String name);
	
}
