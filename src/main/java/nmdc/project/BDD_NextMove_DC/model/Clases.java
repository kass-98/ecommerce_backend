package nmdc.project.BDD_NextMove_DC.model;

public class Clases {
	private Long id;
	private String nombreClase;
	private String edadAdmision;
	private String horario;
	
	private static long total=0;
	public Clases(String nombreClase, String edadAdmision, String horario) {
		super();
		this.nombreClase = nombreClase;
		this.edadAdmision = edadAdmision;
		this.horario = horario;
		Clases.total++;	
		this.id=Clases.total;
	}
	public Clases() {
		Clases.total++;	
		this.id=Clases.total;
		
	}//constructor vacio
	public String getNombreClase() {
		return nombreClase;
	}
	public void setNombreClase(String nombreClase) {
		this.nombreClase = nombreClase;
	}
	public String getEdadAdmision() {
		return edadAdmision;
	}
	public void setEdadAdmision(String edadAdmision) {
		this.edadAdmision = edadAdmision;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Clases [id=" + id + ", nombreClase=" + nombreClase + ", edadAdmision=" + edadAdmision + ", horario="
				+ horario + "]";
	}
	

}
