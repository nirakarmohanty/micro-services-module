package src.coding.tutor.pathology.service.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.coding.tutor.pathology.service.entity.Pathology;
import src.coding.tutor.pathology.service.repository.PathologyRepository;

@Component
public class PathologyDAO {

	@Autowired
	private PathologyRepository pathologyRepo;
	
	public Pathology savePathlogy(Pathology entity) {
		return pathologyRepo.save(entity);
	}

	public Pathology seachById(long id) {
		
		return pathologyRepo.findById(id).get();
	}

	public void deletPathology(Pathology pathology) {
		pathologyRepo.deleteById(pathology.getId());
	}

	public Pathology searchByName(String name) {
		// TODO Auto-generated method stub
		return pathologyRepo.findByName(name);
	}

}
