package ar.edu.unju.escmi.poo.Elements;

import java.time.LocalDate;

import ar.edu.unju.escmi.poo.Collection.CollectionPersona;

public class Usuario {
	private String email;
	private String password;
	private boolean estado;
	private Rol rol;
	private LocalDate fechaAlta;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Usuario(String email, String password, boolean estado, Rol rol, LocalDate fechaAlta) {
		super();
		this.email = email;
		this.password = password;
		this.estado = estado;
		this.rol = rol;
		this.fechaAlta = fechaAlta;
	}
	public Usuario() {
		super();
	}
	//dATEtIMApARSEeXCEPTION   B
	public boolean verificarCredenciales() {
		if (CollectionPersona.buscarPersona(email, password).equals(email, password)) {
			estado = true;
		}
		else {
			estado = false;
		}
		
		return estado;
		
	}
	
	public boolean verificarDuracionRoL() {
		if (getRol().getDuracionRol() > Rol.getDuracionRol()) {
			estado = false;
		}
		else {
			estado = true;
		}
		return estado;
		
	}
	public boolean accesoPersona() {
		boolean band;
		if ((verificarCredenciales() == true) && (verificarDuracionRoL() == true)) {
			CollectionPersona.getPersonas();
			band = true;
		}
		else {
			System.out.println("El usuario no tiene permitido el acceso");
			band = false;
		}
		return band;
	}
	public Persona equals(String email2, String password2) {
		return null;
		// TODO Auto-generated method stub
		
	}
	
}
