package com.proyecto.beans;

public class Cliente {
	
	private int Rut;
	private String Nombre;
	private int Telefono;
	private String Mail;
	private String Rubro;
	private String Direccion;

	public Cliente() {
	
	}
	
	public Cliente( int Rut, String Nombre, int Telefono, String Mail, String Rubro, String Direccion) {

		this.Rut = Rut;
		this.Nombre = Nombre;
		this.Telefono = Telefono;
		this.Mail = Mail;
		this.Rubro = Rubro;
		this.Direccion = Direccion;

	}

	public int getRut() {
		return Rut;
	}

	public void setRut(int rut) {
		Rut = rut;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}


	public String getRubro() {
		return Rubro;
	}

	public void setRubro(String rubro) {
		Rubro = rubro;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	@Override
	public String toString() {
		return "Cliente [Rut=" + Rut + ", Nombre=" + Nombre + ", Telefono=" + Telefono + ", CorreoElectronico="
				+ Mail + ", Rubro=" + Rubro + ", Direccion=" + Direccion + ", getRut()=" + getRut()
				+ ", getNombre()=" + getNombre() + ", getTelefono()=" + getTelefono() + ", getRubro()=" + getRubro()
				+ ", getDireccion()=" + getDireccion() + ", getMail()=" + getMail() + "]";
	}

	
	

}
