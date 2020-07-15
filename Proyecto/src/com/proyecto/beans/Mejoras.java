package com.proyecto.beans;

public class Mejoras {
	private int IDMejora;
	private String Fecha;
	private String Motivo;
	private String Actividades;
	private String Estado;
	private int Rut;


	public Mejoras( int IDMejora, String Fecha, String Motivo, String Actividades, String Estado, int Rut) {

		this.IDMejora = IDMejora;
		this.Fecha = Fecha;
		this.Motivo = Motivo;
		this.Actividades = Actividades;
		this.Estado = Estado;
		this.Rut = Rut;
		
	}
	
	public Mejoras() {
		
	}

	public int getIDMejora() {
		return IDMejora;
	}

	public void setIDMejora(int iDMejora) {
		IDMejora = iDMejora;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getMotivo() {
		return Motivo;
	}

	public void setMotivo(String motivo) {
		Motivo = motivo;
	}

	public String getActividades() {
		return Actividades;
	}

	public void setActividades(String actividades) {
		Actividades = actividades;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public int getRut() {
		return Rut;
	}

	public void setRut(int rut) {
		Rut = rut;
	}

	@Override
	public String toString() {
		return "Mejoras [IDMejora=" + IDMejora + ", Fecha=" + Fecha + ", Motivo=" + Motivo + ", Actividades="
				+ Actividades + ", Estado=" + Estado + ", Rut=" + Rut + ", getIDMejora()=" + getIDMejora()
				+ ", getFecha()=" + getFecha() + ", getMotivo()=" + getMotivo() + ", getActividades()="
				+ getActividades() + ", getEstado()=" + getEstado() + ", getRut()=" + getRut() + "]";
	}
	
}
