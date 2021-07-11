package src.coding.tutor.pathology.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import src.coding.tutor.pathology.service.entity.Pathology;
import src.coding.tutor.pathology.service.ssvc.PathologyService;

@RestController
@RequestMapping(value = "/pathology")
public class PathologyController {

	@Autowired
	private PathologyService pathologyService;

	@GetMapping(value = "/sayHello")
	public String sayHello() {
		return "Hello Pathology Service!";
	}

	@GetMapping(value = "/search/{id}")
	public Pathology search(@PathVariable long id) {
		return pathologyService.searchById(id);
	}
	@GetMapping(value = "/searchByName/{name}")
	public Pathology searchByName(@PathVariable String name) {
		return pathologyService.searchByName(name);
	}


	@PostMapping(value = "/save")
	public Pathology savePathology(@RequestBody Pathology pathology) {
		return pathologyService.savePathology(pathology);
	}
	@PostMapping(value = "/delete")
	public String deletePathology(@RequestBody Pathology pathology) {
		return pathologyService.deletPathology(pathology);
	}
}
