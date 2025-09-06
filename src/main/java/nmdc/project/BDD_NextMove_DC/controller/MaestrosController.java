package nmdc.project.BDD_NextMove_DC.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nmdc.project.BDD_NextMove_DC.model.Inscripcion;
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
	@GetMapping(path="{useT}")
	public Maestros getMaestros(@PathVariable("useT") Long id){
		return service.getTeacher(id);
	}
	@DeleteMapping (path="{useT}")
	public Maestros deleteMaestros(@PathVariable("useT") Long id){
		return service.deleteTeacher(id);
	}
	@PostMapping 
	public Maestros addMaestros(@RequestBody Maestros maestro){
		return service.addMaestros(maestro);
	}
	@PutMapping(path="{useT}")
	public Maestros putMaestros(@PathVariable("useT") Long id, @RequestBody Maestros maestroActualizado) {
		return service.updateMaestros(id, maestroActualizado);
	}

	

}
