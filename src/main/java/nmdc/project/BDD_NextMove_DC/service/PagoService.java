package nmdc.project.BDD_NextMove_DC.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nmdc.project.BDD_NextMove_DC.model.Pago;
import nmdc.project.BDD_NextMove_DC.model.Usuario;

@Service
public class PagoService {
	private final ArrayList<Pago> lista = new ArrayList<Pago>();
	@Autowired
	public PagoService() {
		lista.add(new Pago("700", "anual","2025-08-01"));
		lista.add(new Pago("130", "suelta","2025-08-12"));
		lista.add(new Pago("700", "anual", "2025-08-16"));
		lista.add(new Pago("130", "suelta", "2025-08-16"));
		lista.add(new Pago("700", "anual","2025-09-01"));
	}
	public List<Pago> getPayment(){
		return lista;
	}
	public Pago getPayment(Long id) {
		Pago tmpCash = null;
	    for(Pago cash : lista) {
	        if(cash.getId() == id) {
	            tmpCash = cash;
	            break;
	        }
	    }
	    return tmpCash;
		
	}
	public Pago deletePayment(Long id) {
		Pago tmpCash = null;
	    for(Pago cash : lista) {
	        if(cash.getId() == id) {
	            tmpCash = cash;
	            lista.remove(cash);
	            break;
	        }
	    }
	    return tmpCash;
		
	}
	public Pago addPayment(Pago pago) {
		lista.add(pago);
		
		return pago;
	}
	
	public Pago updatePayment(Long id, String costo, String paquete, String fechaPago) {
		Pago tmpPayment=null;
		for(Pago pa:lista){
			if(pa.getId()==id) {
				if(costo!=null)pa.setCosto(costo);
				if(paquete!=null)pa.setPaquete(paquete);
				if(fechaPago!=null)pa.setFechaPago(fechaPago);
				tmpPayment=pa;
				break;
				
			}//if
		}//foreach
		return tmpPayment;
	}
	
}
