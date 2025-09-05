package nmdc.project.BDD_NextMove_DC.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import nmdc.project.BDD_NextMove_DC.model.Clases;
import nmdc.project.BDD_NextMove_DC.model.Usuario;

@Service
public class ClasesService {
	private final ArrayList<Clases> lista = new ArrayList<Clases>();
	
	public ClasesService() {
		lista.add(new Clases("Hip-Hop","15 años en adelante" ,"lunes de 18:00 a 19:30 hrs"));
		lista.add(new Clases("Hip-Hop","15 años en adelante" ,"Sábado y domingo de 11:00 a 12:15 hrs."));
		lista.add(new Clases("Heels", "15 años en adelante" ,"Jueves de 19:30 a 21:00 hrs."));
		lista.add(new Clases("Heels","15 años en adelante" ,"Sábado de 12:15 a 13:30 hrs."));
		lista.add(new Clases("Jazz","15 años en adelante" , "Jueves de 18:00 a 19:00 hrs."));
	}
	public List<Clases> getClases(){
		return lista;
	}
	public Clases getClases(Long id) {
		Clases tmpCl = null;
	    for(Clases Cl : lista) {
	        if(Cl.getId() == id) {
	            tmpCl = Cl;
	            break;
	        }
	    }
	    return tmpCl;
	}
	public Clases deleteClases(Long id) {
		Clases tmpCl = null;
	    for(Clases Cl : lista) {
	        if(Cl.getId() == id) {
	            tmpCl = Cl;
	            lista.remove(Cl);
	            break;
	        }
	    }
	    return tmpCl;
		
	}
	
	public Clases addClases(Clases clase) {
		lista.add(clase);
		return clase;
	}
	public Clases updateClases(Long id, String nombreClases, String edadAdmision, String horario) {
		Clases tmpCl=null;
		for(Clases cl:lista) {
			if(cl.getId()==id) {
				if(nombreClases!=null)cl.setNombreClase(nombreClases);
				if(edadAdmision!=null)cl.setEdadAdmision(edadAdmision);
				if(horario!=null)cl.setHorario(horario);
				tmpCl=cl;
				break;
			}//if
			
		}//foreach
		return tmpCl;
		
	}
	
	

}
