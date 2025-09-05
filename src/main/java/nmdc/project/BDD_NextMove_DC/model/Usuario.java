package nmdc.project.BDD_NextMove_DC.model;

public class Usuario {
	private Long id;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	private String fechaRegistro;
	
	private static long total=0;
	public Usuario(String nombre, String apellido, String telefono, String correo, String fechaRegistro) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.fechaRegistro = fechaRegistro;
		Usuario.total++;
		this.id = Usuario.total;
	}
	public Usuario() {
		Usuario.total++;
		this.id = Usuario.total;
		

	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", correo=" + correo + ", fechaRegistro=" + fechaRegistro + "]";
	}
}
