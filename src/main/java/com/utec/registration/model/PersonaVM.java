package com.utec.registration.model;

public class PersonaVM {
	
	private String nombre;
	private int edad;
	private String direccion;
	private String telefono;
	
	public PersonaVM(String nombre, int edad, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public PersonaVM() {}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "PersonaVM [nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}
	
	

}
