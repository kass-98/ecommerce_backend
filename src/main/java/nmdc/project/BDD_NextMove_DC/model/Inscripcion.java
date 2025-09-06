package nmdc.project.BDD_NextMove_DC.model;

import java.time.LocalDate;


public class Inscripcion {
	private Long id;
	private LocalDate fechaInscripcion;
	
	private static long total=0;
	public Inscripcion(LocalDate fechaInscripcion) {
		super();
		this.fechaInscripcion = fechaInscripcion;
		Inscripcion.total++;
		this.id = Inscripcion.total;
	}
	public Inscripcion() {
		Inscripcion.total++;
		this.id = Inscripcion.total;
	}
	public LocalDate getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(LocalDate fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Inscripcion [id=" + id + ", fechaInscripcion=" + fechaInscripcion + "]";
	}
	

}
