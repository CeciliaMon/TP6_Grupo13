package ar.edu.unju.escmi.poo.principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import ar.edu.unju.escmi.poo.Collection.CollectionPersona;
import ar.edu.unju.escmi.poo.Collection.CollectionRol;
import ar.edu.unju.escmi.poo.Elements.Persona;
import ar.edu.unju.escmi.poo.Elements.Usuario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opc = 0;
		Persona person = new Persona();
		Usuario user = new Usuario();
		CollectionPersona.getPersonas();
		CollectionRol.getRoles();
		/*boolean bandera;
		int edad;
		do {
			try {
				 bandera = true;
				System.out.println("Ingrese edad: ");
				edad = teclado.nextInt();
				
			}catch(InputMismatchException imp) {
				bandera = false;
				System.out.println("Debe ingresar un valor numerico");
				teclado.next();
			}
			
		}while(bandera == false);
		
		System.out.println("continuamos");*/
		
		
			System.out.println("--------------Inicio de sesion---------------");
			System.out.println("Ingrese el email del usuario: ");
			user.setEmail(teclado.next());
			System.out.println("Ingrese la contraseña del usuario: ");
			user.setPassword(teclado.next());
			//CollectionPersona.buscarPersona(user.getEmail(), user.getPassword());
			if (user.accesoPersona() == true && person.getUsuario().getRol().getDescripcion().contains("ADMIN") == CollectionRol.getRoles().contains("ADMIN")) {
				do {
					System.out.println("-------------Menu de opciones del usuario ADMIN------------");
					System.out.println("1) Alta de persona: ");
					System.out.println("2) Buscar un usuario por su email y mostrar todos sus datos: ");
					System.out.println("3) Salir: ");
					System.out.println("Ingrese una opcion: ");
					opc = teclado.nextInt();
				switch(opc) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					System.out.println("Sesion finalizada");
					break;
				}	
				
		}while(opc != 3);
	}
		
	}
}

