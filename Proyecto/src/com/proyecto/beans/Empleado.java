package com.proyecto.beans;

public class Empleado {
	private int RutEmpleado;
	private String NombreEmpleado;
	private String Especialidad;


	public Empleado( int RutEmpleado, String NombreEmpleado, String Especialidad) {

		this.RutEmpleado = RutEmpleado;
		this.NombreEmpleado = NombreEmpleado;
		this.Especialidad = Especialidad;
		
	}
	
	public Empleado() {
		
	}

	public int getRutEmpleado() {
		return RutEmpleado;
	}

	public void setRutEmpleado(int rutEmpleado) {
		RutEmpleado = rutEmpleado;
	}

	public String getNombreEmpleado() {
		return NombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		NombreEmpleado = nombreEmpleado;
	}

	public String getEspecialidad() {
		return Especialidad;
	}

	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Empleado [RutEmpleado=" + RutEmpleado + ", NombreEmpleado=" + NombreEmpleado + ", Especialidad="
				+ Especialidad + ", getRutEmpleado()=" + getRutEmpleado() + ", getNombreEmpleado()="
				+ getNombreEmpleado() + ", getEspecialidad()=" + getEspecialidad() + "]";
	}
	
	

}
