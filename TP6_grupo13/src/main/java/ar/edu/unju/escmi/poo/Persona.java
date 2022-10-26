package ar.edu.unju.escmi.poo;

public class Persona {
	private String nombre;
	private String apellido;
	private Long dni;
	private Usuario usuario;
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
	public Long getDni() {
		return dni;
	}
	public void setDni(Long dni) {
		this.dni = dni;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Persona(String nombre, String apellido, Long dni, Usuario usuario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.usuario = usuario;
	}
	public Persona() {
		super();
	}
	public boolean equals(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
