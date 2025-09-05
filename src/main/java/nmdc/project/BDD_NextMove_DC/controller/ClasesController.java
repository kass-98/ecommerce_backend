package nmdc.project.BDD_NextMove_DC.controller;

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

import nmdc.project.BDD_NextMove_DC.model.Clases;
import nmdc.project.BDD_NextMove_DC.service.ClasesService;

@RestController
@RequestMapping(path="/api/clases/")
public class ClasesController {
	
	private final ClasesService service;
	@Autowired
	public ClasesController(ClasesService service){
		this.service = service;
	}
	@GetMapping
	public List<Clases> getClases(){
		return service.getClases();
	}
	@GetMapping(path="{useId}")
	public Clases getClases(@PathVariable("useId") Long id){
		return service.getClases(id);
	}
	@DeleteMapping(path="{useId}")
	public Clases deleteClases(@PathVariable("useId") Long id){
		return service.deleteClases(id);
	}
	@PostMapping
	public Clases addClases(@RequestBody Clases clase) {
		return service.addClases(clase);
	}
	@PutMapping(path="{useId}")
	public Clases updateClases(@PathVariable("useId") Long id,
			@RequestParam(required=false) String nombreClases,
			@RequestParam(required=false) String edadAdmision,
			@RequestParam(required=false) String horario) {
			return service.updateClases(id,nombreClases,edadAdmision, horario);
		}

}
