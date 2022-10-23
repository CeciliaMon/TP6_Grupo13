package ar.edu.unju.escmi.poo;

public class Rol {
	private String descripcion;
	private static final int DURACION_ROL=20;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public static int getDuracionRol() {
		return DURACION_ROL;
	}
	public Rol(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
	public Rol() {
		super();
	}
	
	
}
