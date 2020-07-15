package com.proyecto.beans;

public class Visitas {
	
	private int IDVisita;
	private String Direccion;
	private String Ciudad;
	private String Fecha;
	private String Resumen;
	private String Observaciones;
	private int Rut_Id;
	private int Empleado_RutEmpleado;


	public Visitas( int IDVisitas, String Direccion, String Ciudad, String Fecha, String Resumen, 
			String Observaciones, int Rut, int Empleado_RutEmpleado) {

		this.IDVisita = IDVisitas;
		this.Direccion = Direccion;
		this.Ciudad = Ciudad;
		this.Fecha = Fecha;
		this.Resumen = Resumen;
		this.Observaciones = Observaciones;
		this.Rut_Id = Rut;
		this.Empleado_RutEmpleado = Empleado_RutEmpleado;

	}
	
	public Visitas() {
		
	}

	public int getIDVisita() {
		return IDVisita;
	}

	public void setIDVisita(int iDVisitas) {
		IDVisita = iDVisitas;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getResumen() {
		return Resumen;
	}

	public void setResumen(String resumen) {
		Resumen = resumen;
	}

	public String getObservaciones() {
		return Observaciones;
	}

	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}

	public int getRut_Id() {
		return Rut_Id;
	}

	public void setRut_Id(int rut) {
		Rut_Id = rut;
	}

	public int getEmpleado_RutEmpleado() {
		return Empleado_RutEmpleado;
	}

	public void setEmpleado_RutEmpleado(int empleado_RutEmpleado) {
		Empleado_RutEmpleado = empleado_RutEmpleado;
	}

	@Override
	public String toString() {
		return "Visitas [IDVisita=" + IDVisita + ", Direccion=" + Direccion + ", Ciudad=" + Ciudad + ", Fecha="
				+ Fecha + ", Resumen=" + Resumen + ", Observaciones=" + Observaciones + ", Rut=" + Rut_Id
				+ ", Empleado_RutEmpleado=" + Empleado_RutEmpleado + ", getIDVisitas()=" + getIDVisita()
				+ ", getDireccion()=" + getDireccion() + ", getCiudad()=" + getCiudad() + ", getFecha()=" + getFecha()
				+ ", getResumen()=" + getResumen() + ", getObservaciones()=" + getObservaciones() + ", getRut()="
				+ getRut_Id() + ", getEmpleado_RutEmpleado()=" + getEmpleado_RutEmpleado() + "]";
	}
	
	

}
