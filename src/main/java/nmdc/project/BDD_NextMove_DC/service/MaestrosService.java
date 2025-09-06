package nmdc.project.BDD_NextMove_DC.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import nmdc.project.BDD_NextMove_DC.model.Inscripcion;
import nmdc.project.BDD_NextMove_DC.model.Maestros;

@Service
public class MaestrosService {
	private final ArrayList<Maestros> lista = new ArrayList<Maestros>();
	@Autowired
	public MaestrosService() {
		lista.add(new Maestros("Pablo","López", "326472746", "@pabloL"));
		lista.add(new Maestros("Indigo","Valenzuela", "6555384736", "@indigoV"));
		lista.add(new Maestros("Zhevia","Kings", "8827462535", "@zheviakings"));
		lista.add(new Maestros("Kardan","Muñoz", "9987736453", "@kardanMuñoz"));
		lista.add(new Maestros("Kennybyaa","A", "8765463746", "@kennybyaa"));
	}
	public List<Maestros> getTeacher(){
		return lista;
	}
	public Maestros getTeacher(Long id) {
		Maestros tmpT = null;
	    for(Maestros tea : lista) {
	        if(tea.getId() == id) {
	            tmpT = tea;
	            break;
	        }
	    }
	    return tmpT;
		
	}
	public Maestros deleteTeacher(Long id) {
		Maestros tmpT = null;
	    for(Maestros tea : lista) {
	        if(tea.getId() == id) {
	            tmpT = tea;
	            lista.remove(tea);
	            break;
	        }
	    }
	    return tmpT;
	}
	public Maestros addMaestros(Maestros maestro) {
		lista.add(maestro);
		return null;
	}
	public Maestros putTeacher(Long id, Maestros maestro) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
