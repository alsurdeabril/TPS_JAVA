package ar.edu.unlam.pb01.tp09.dominio;

public class Usuario {

	/* Atributos */
	private String usuario;
	private String contrasenia;
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	
	
	/* Constructor */
	public Usuario(String usuario, String contrasenia, String nombre, String apellido, int dni, int edad) {
		
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		
	} // end constructor
	
	/* Métodos */
	public String getUsuario() {
		return this.nombre;
	} // end getUsuario
	
	public String getContrasenia() {
		return this.contrasenia;
	} // getContrasenia
	
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	} // end setContrasenia
	
	public void setEdad(int edad) {
		this.edad = edad;
	} // end setEdad
	
} // end Usuario
