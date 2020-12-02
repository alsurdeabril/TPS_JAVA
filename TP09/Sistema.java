package ar.edu.unlam.pb01.tp09.dominio;

/*8. Desarrolla la clase Sistema. La misma solo tendr� un nombre de Sistema, y el listado de usuarios habilitados para loguearse al mismo (obviamente la clase Sistema deber� contar con el m�todo loguearUsuario, el cual recibir� el nombre y la contrase�a y devolver� el resultado del proceso de login).
 El mismo debe tener las siguientes opciones:
a. Ingresar el nombre del Sistema
b. Agregar usuarios al Sistema
c. Loguearse en el Sistema
Para validar el correcto funcionamiento, realiz� al menos la siguiente prueba:
a. Ingres� el �Sistema de Asistencias de Unlam�.
b. Registr� 5 usuarios.
c. Logueate con un usuario y contrase�a v�lidos
d. Intent� loguearte con un usuario inexistente
e. Intent� loguearte con una contrase�a inv�lida de un usuario existente.*/

public class Sistema {
	
	/* Atributos */
	private String nombreSistema;
	private Usuario usuariosHabilitados[];
	private final int CANTIDAD_USUARIOS_A_AGREGAR;
	
	/* Constructor */
	public Sistema(int cantidadUsuariosAagregar) {
		this.nombreSistema = "";
		this.CANTIDAD_USUARIOS_A_AGREGAR = cantidadUsuariosAagregar;
		this.usuariosHabilitados = new Usuario[cantidadUsuariosAagregar];
		
	} // end constructor
	
	/* M�todos */
	public void setNombreSistema(String nombreSistema) {
		this.nombreSistema = nombreSistema;
	} // end setNombreSistema
	
	public String getNombreSistema() {
		return this.getNombreSistema();
	} // end getNombreSistema
	
	public void agregarUsuarios(String usuario, String contrasenia, String nombre, String apellido, int dni, int edad) {
		
		Usuario nuevoIngreso = new Usuario(usuario, contrasenia, nombre, apellido, dni, edad);
		
		int i = 0;
		boolean seAgrega = false;
		
		while(i < usuariosHabilitados.length && !seAgrega) {
			
			if(usuariosHabilitados[i] == null) {
				usuariosHabilitados[i] = nuevoIngreso;
				seAgrega = true;
			} else {
				seAgrega = false;
				i++;
			} // end conditional
			
		} // end while
		
	} // end agregarUsuarios
	
	public boolean loguearUsuario(String usuario, String contrasenia) {
		boolean verificacionCorrecta = false;
		
		int i = 0;
		
		while(i < CANTIDAD_USUARIOS_A_AGREGAR && !verificacionCorrecta) {
			
			if(usuariosHabilitados[i].getUsuario().equals(usuario) && usuariosHabilitados[i].getContrasenia().equals(contrasenia)) {
				verificacionCorrecta = true;
			} else {
				i++;
			} // end conditional
			
		} // end while
		
		return verificacionCorrecta;
	} // end  loguearUsuario
	
} // end Sistema
