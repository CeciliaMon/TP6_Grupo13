package ar.edu.unju.escmi.poo;

import java.util.ArrayList;
import java.util.List;

public abstract class CollectionRol {
	public static List<Rol> roles;
	public static List<Persona> personas;
	
	public static List<Rol> getRoles(){
		if(roles ==null){
			roles = new ArrayList<Rol>();
			roles.add(new Rol("ADMIN"));
			roles.add(new Rol("CLIENTE"));	
		}
		return roles;
	}

	public static void agregarPersona(Persona persona){
		personas.add(persona);
	}
	public static Persona buscarPersona(String email, String password){
		Persona persona = null;
		for(Persona per : personas) {
			per.getUsuario().getEmail().equals(email);
		}
		return persona;
	}
}
