package nmdc.project.BDD_NextMove_DC.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nmdc.project.BDD_NextMove_DC.model.Inscripcion;
import nmdc.project.BDD_NextMove_DC.model.Pago;

@Service
public class InscripcionService {
	private final ArrayList<Inscripcion> lista = new ArrayList<Inscripcion>();
	@Autowired
	public InscripcionService() {
		lista.add(new Inscripcion(LocalDate.parse("2025-08-01")));
		lista.add(new Inscripcion(LocalDate.parse("2025-08-12")));
		lista.add(new Inscripcion(LocalDate.parse("2025-08-16")));
		lista.add(new Inscripcion(LocalDate.parse("2025-08-16")));
		lista.add(new Inscripcion(LocalDate.parse("2025-09-01")));

	}
	public List<Inscripcion> getInscription(){
		return lista;
	}
	
	public Inscripcion getInscription(Long id){
		Inscripcion tmpIns = null;
	    for(Inscripcion ins : lista) {
	        if(ins.getId() == id) {
	            tmpIns = ins;
	            break;
	        }
	    }
	    return tmpIns;
	}
	
	

}
