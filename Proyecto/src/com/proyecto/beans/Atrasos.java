package com.proyecto.beans;

public class Atrasos {

	private int Rut;
	private String Nombre;
	private int IDPago;
	private String FechaPago;
	private int MontoRegular;
	private int MontoAdicional;
	
	public Atrasos(int rut, String nombre, int iDPago, String fechaPago, int montoRegular, int montoAdicional) {
		super();
		Rut = rut;
		Nombre = nombre;
		IDPago = iDPago;
		FechaPago = fechaPago;
		MontoRegular = montoRegular;
		MontoAdicional = montoAdicional;
	}
	
	public Atrasos() {
		
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

	public int getIDPago() {
		return IDPago;
	}

	public void setIDPago(int iDPago) {
		IDPago = iDPago;
	}

	public String getFechaPago() {
		return FechaPago;
	}

	public void setFechaPago(String fechaPago) {
		FechaPago = fechaPago;
	}

	public int getMontoRegular() {
		return MontoRegular;
	}

	public void setMontoRegular(int montoRegular) {
		MontoRegular = montoRegular;
	}

	public int getMontoAdicional() {
		return MontoAdicional;
	}

	public void setMontoAdicional(int montoAdicional) {
		MontoAdicional = montoAdicional;
	}

	@Override
	public String toString() {
		return "Atrasos [Rut=" + Rut + ", Nombre=" + Nombre + ", IDPago=" + IDPago + ", FechaPago=" + FechaPago
				+ ", MontoRegular=" + MontoRegular + ", MontoAdicional=" + MontoAdicional + "]";
	}
	
	
	
	
	
	
}

