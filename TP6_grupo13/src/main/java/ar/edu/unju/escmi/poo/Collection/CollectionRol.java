package ar.edu.unju.escmi.poo.Collection;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.Elements.Persona;
import ar.edu.unju.escmi.poo.Elements.Rol;

public abstract class CollectionRol {
	public static List<Rol> roles;
	
	public static List<Rol> getRoles(){
		if(roles ==null){
			roles = new ArrayList<Rol>();
			roles.add(new Rol("ADMIN"));
			roles.add(new Rol("CLIENTE"));	
		}
		return roles;
	}

	public static void agregarRol(Rol rol){
		roles.add(rol);
	}
	public static Rol buscarRol(String descripcion){
		Rol rol = null;
		for(Rol role : roles) {
			role.getDescripcion().equals(descripcion);
		}
		return rol;
	}
}
