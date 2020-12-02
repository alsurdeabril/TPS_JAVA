package ar.edu.umlam.pb01.tp09.prueba;

import java.util.Scanner;

import ar.edu.unlam.pb01.tp09.dominio.Sistema;

/*8. Desarolla la clase Sistema. La misma solo tendr� un nombre de Sistema, y el listado de
usuarios habilitados para loguearse al mismo (obviamente la clase Sistema deber� contar
con el m�todo loguearUsuario, el cual recibir� el nombre y la contrase�a y devolver� el
resultado del proceso de login). Verific� el correcto funcionamiento a trav�s de la clase
PruebaSistema. El mismo debe tener las siguientes opciones:
a. Ingresar el nombre del Sistema
b. Agregar usuarios al Sistema
c. Loguearse en el Sistema
Para validar el correcto funcionamiento, realiz� al menos la siguiente prueba:
a. Ingres� el �Sistema de Asistencias�.
b. Registr� 5 usuarios.
c. Logueate con un usuario y congtrase�a v�lidos
d. Intent� loguearte con un usuario inexistente
e. Intent� loguearte con una contrase�a inv�lida de un usuario existente.*/

public class PruebaSistema {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int cantidadUsuariosAagregar = 0;
		int opcionIngresada = 0;
		String nombreSistema = "";
		String nombreUsuario = "";
		String contrasenia = "";
		String nombre = "";
		String apellido = "";
		int dni = 0;
		int edad = 0;
		
		System.out.println("***Bienvenido/a***\n");
		
		do {
			System.out.println("Ingrese la cantidad de usuarios que quiera que contenga el sistema: ");
			cantidadUsuariosAagregar = input.nextInt();
		} while (cantidadUsuariosAagregar <= 0);
		
		Sistema nuevoSistema = new Sistema(cantidadUsuariosAagregar);
		
		do {
				do {
		System.out.println("Men� de opciones: \n1- Ingresar nombre del sistema. \n2-Agregar usuarios al sistema. \n3-Loguearse en el sistema. \n0- Salir.");
		opcionIngresada = input.nextInt();
		
		if (opcionIngresada < 0 || opcionIngresada > 3) {
			System.out.println("Ingrese una opci�n v�lida");
		}// end conditional
		
		switch(opcionIngresada) {
		
		case 1:
			System.out.println("Ingrese el nombre del sistema: ");
			nombreSistema = input.next();
			nuevoSistema.setNombreSistema(nombreSistema);
			break;
			
		case 2:
			System.out.println("Ingrese el nombre que servir� como usuario: ");
			nombreUsuario = input.next();
			System.out.println("Ingrese la contrase�a: ");
			contrasenia = input.next();
			System.out.println("Ingrese nombre: ");
			nombre = input.next();
			System.out.println("Ingrese apellido: ");
			apellido = input.next();
			System.out.println("Ingrese DNI: ");
			dni = input.nextInt();
			System.out.println("Ingrese edad: ");
			edad = input.nextInt();
			
			nuevoSistema.agregarUsuarios(nombreUsuario, contrasenia, nombre, apellido, dni, edad);
			
			break;
			
		case 3:
			System.out.println("Ingrese nombre de usuario");
			nombreUsuario = input.next();
			System.out.println("Ingrese la contrase�a: ");
			contrasenia	= input.next();
			
			boolean verificacion = nuevoSistema.loguearUsuario(nombreUsuario, contrasenia);
			if( verificacion == true) {
				System.out.println("Acceso permitido.");
			} else {
				System.out.println("Acceso denegado.\nVerifique que su nombre de usuario o contrase�a sean las correctas.");
			} // end conditional
			
			break;
		
		} // end switch
		
				} while(opcionIngresada >= 1 && opcionIngresada <= 3);
			
		} while(opcionIngresada < 0 || opcionIngresada > 3);
		
	
		 
			
	} // end main

} // end PruebaSistema