package com.proyecto.beans;

public class Mejoras {
	private int IDMejora;
	private String Fecha;
	private String Motivo;
	private String Actividades;
	private String Estado;
	private int Rut_ID;


	public Mejoras( int IDMejora, String Fecha, String Motivo, String Actividades, String Estado, int Rut) {

		this.IDMejora = IDMejora;
		this.Fecha = Fecha;
		this.Motivo = Motivo;
		this.Actividades = Actividades;
		this.Estado = Estado;
		this.Rut_ID = Rut;
		
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

	public int getRut_ID() {
		return Rut_ID;
	}

	public void setRut_ID(int rut) {
		Rut_ID = rut;
	}

	@Override
	public String toString() {
		return "Mejoras [IDMejora=" + IDMejora + ", Fecha=" + Fecha + ", Motivo=" + Motivo + ", Actividades="
				+ Actividades + ", Estado=" + Estado + ", Rut_ID=" + Rut_ID + ", getIDMejora()=" + getIDMejora()
				+ ", getFecha()=" + getFecha() + ", getMotivo()=" + getMotivo() + ", getActividades()="
				+ getActividades() + ", getEstado()=" + getEstado() + ", getRut_ID()=" + getRut_ID() + "]";
	}
	
}
