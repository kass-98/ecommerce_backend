package nmdc.project.BDD_NextMove_DC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nmdc.project.BDD_NextMove_DC.model.Maestros;
import nmdc.project.BDD_NextMove_DC.service.MaestrosService;

@RestController
@RequestMapping(path="/api/maestros")
public class MaestrosController {
	private final MaestrosService service;
	@Autowired
	public MaestrosController(MaestrosService service) {
		this.service = service;
	}
	@GetMapping
	public List<Maestros> getMaestros(){
		return service.getTeacher();
	}
	

}
