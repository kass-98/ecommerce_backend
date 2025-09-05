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

import nmdc.project.BDD_NextMove_DC.model.Usuario;
import nmdc.project.BDD_NextMove_DC.service.UsuarioService;

@RestController
@RequestMapping(path="/api/usuarios/") //  http://localhost:8080/api/usuarios/
public class UsuarioController {
	private final UsuarioService service;
	@Autowired
	public UsuarioController(UsuarioService service) {
		this.service =service;
	}
	
	@GetMapping
	public List<Usuario> getUsuarios() {
		return service.getUser();
	}
	@GetMapping (path="{useId}")
	public 	Usuario getUsuarios(@PathVariable("useId") Long id) {
		return service.getUser(id);
	}
	@DeleteMapping (path="{useId}")
	public 	Usuario deleteUsuarios(@PathVariable("useId") Long id) {
		return service.deleteUser(id);
	}
	@PostMapping
	public Usuario addUsuario(@RequestBody Usuario usuario) {
		return service.addUser(usuario);
	}
	@PutMapping (path="{useId}")
	public 	Usuario updateUsuarios(@PathVariable("useId") Long id, 
			@RequestParam (required=false) String nombre,
			@RequestParam (required=false) String apellido,
			@RequestParam (required=false) String telefono,
			@RequestParam (required=false) String correo,
			@RequestParam (required=false) String fechaRegistro){
		return service.updateUser(id,nombre,apellido,telefono,correo,fechaRegistro);
	}
}
