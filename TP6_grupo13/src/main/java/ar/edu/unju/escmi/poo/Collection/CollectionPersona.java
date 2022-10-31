package ar.edu.unju.escmi.poo.Collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.Elements.Persona;
import ar.edu.unju.escmi.poo.Elements.Usuario;

public abstract class CollectionPersona {
public static List<Persona> personas;
	
	public static List<Persona> getPersonas(){
		if(personas == null){
			CollectionRol.getRoles();
			personas = new ArrayList<Persona>();
			//Usuario con rol "ADMIN"
			Usuario us = new Usuario("montanocecilia77@gmail.com", "123", true, CollectionRol.roles.get(0), LocalDate.of(2022, 10, 1));
			Persona per = new Persona("Cecilia", "Montaño", (long) 20130466, us);
			//Usuario con rol "CLIENTE"
			Usuario us2 = new Usuario("maxiflores048@gmail.com", "556", true, CollectionRol.roles.get(1), LocalDate.of(2022, 10, 2));
			Persona per2 = new Persona("Maximiliano", "Flores", (long) 7177718, us2);
			personas.add(per);
			personas.add(per2);
		}
		return personas;
	}
	
	public static void agregarPersona(Persona persona){
		personas.add(persona);
	}
	public static Persona buscarPersona(String email, String password){
		Persona persona= null;
		for(Persona per : personas) {
			persona = per.getUsuario().equals(email, password);
		}
		return persona;
	}
}
