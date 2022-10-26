package ar.edu.unju.escmi.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class CollectionPersona {
public static List<Persona> personas;
	
	public static List<Persona> getPersonas(){
		if(personas ==null){
			CollectionRol.getRoles();
			personas = new ArrayList<Persona>();
			Usuario us = new Usuario("jperez@mail.com", "123", true, CollectionRol.roles.get(0), LocalDate.of(2022, 10, 1));
			Persona per = new Persona("Juan", "Perez", (long) 20130466, us);
			personas.add(per);	
		}
		return personas;
	}
	
	public static void agregarPersona(Persona persona){
		personas.add(persona);
	}
	public static Persona buscarPersona(String email, String password){
		Persona persona = null;
		for(Persona per : personas) {
			per.getUsuario().getEmail().equals(email);
			per.getUsuario().getPassword().equals(password);
		}
		return persona;
	}
}
