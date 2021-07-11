package src.coding.tutor.pathology.service.ssvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.coding.tutor.pathology.service.dao.PathologyDAO;
import src.coding.tutor.pathology.service.entity.Pathology;

@Component
public class PathologyService {
	@Autowired
	private PathologyDAO pathologyDao;

	public Pathology savePathology(Pathology pathology) {
		return pathologyDao.savePathlogy(pathology);
	}

	public Pathology searchById(long id) {
		return pathologyDao.seachById(id);
	}

	public String deletPathology(Pathology pathology) {
		pathologyDao.deletPathology(pathology);
		return "Sucessfuly delted";
	}

	public Pathology searchByName(String name) {
		// TODO Auto-generated method stub
		return pathologyDao.searchByName(name);
	}

}
