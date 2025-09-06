package nmdc.project.BDD_NextMove_DC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nmdc.project.BDD_NextMove_DC.model.Inscripcion;
import nmdc.project.BDD_NextMove_DC.service.InscripcionService;

@RestController
@RequestMapping(path="/api/inscripciones")
public class InscripcionController {
	private final InscripcionService service;
	@Autowired
	public InscripcionController(InscripcionService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Inscripcion> getInscripciones(){
		return service.getInscription();
	}
	@GetMapping(path= "{insId}")
	public Inscripcion getInscripciones(@PathVariable("insId") Long id){
		return service.getInscription(id);
	}

}
