package ar.edu.umlam.pb01.tp09.prueba;

import java.util.Scanner;

import ar.edu.unlam.pb01.tp09.dominio.Sistema;

/*8. Desarolla la clase Sistema. La misma solo tendrá un nombre de Sistema, y el listado de
usuarios habilitados para loguearse al mismo (obviamente la clase Sistema deberá contar
con el método loguearUsuario, el cual recibirá el nombre y la contraseña y devolverá el
resultado del proceso de login). Verificá el correcto funcionamiento a través de la clase
PruebaSistema. El mismo debe tener las siguientes opciones:
a. Ingresar el nombre del Sistema
b. Agregar usuarios al Sistema
c. Loguearse en el Sistema
Para validar el correcto funcionamiento, realizá al menos la siguiente prueba:
a. Ingresá el “Sistema de Asistencias”.
b. Registrá 5 usuarios.
c. Logueate con un usuario y congtraseña válidos
d. Intentá loguearte con un usuario inexistente
e. Intentá loguearte con una contraseña inválida de un usuario existente.*/

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
		System.out.println("Menú de opciones: \n1- Ingresar nombre del sistema. \n2-Agregar usuarios al sistema. \n3-Loguearse en el sistema. \n0- Salir.");
		opcionIngresada = input.nextInt();
		
		if (opcionIngresada < 0 || opcionIngresada > 3) {
			System.out.println("Ingrese una opción válida");
		}// end conditional
		
		switch(opcionIngresada) {
		
		case 1:
			System.out.println("Ingrese el nombre del sistema: ");
			nombreSistema = input.next();
			nuevoSistema.setNombreSistema(nombreSistema);
			break;
			
		case 2:
			System.out.println("Ingrese el nombre que servirá como usuario: ");
			nombreUsuario = input.next();
			System.out.println("Ingrese la contraseña: ");
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
			System.out.println("Ingrese la contraseña: ");
			contrasenia	= input.next();
			
			boolean verificacion = nuevoSistema.loguearUsuario(nombreUsuario, contrasenia);
			if( verificacion == true) {
				System.out.println("Acceso permitido.");
			} else {
				System.out.println("Acceso denegado.\nVerifique que su nombre de usuario o contraseña sean las correctas.");
			} // end conditional
			
			break;
		
		} // end switch
		
				} while(opcionIngresada >= 1 && opcionIngresada <= 3);
			
		} while(opcionIngresada < 0 || opcionIngresada > 3);
		
	
		 
			
	} // end main

} // end PruebaSistema