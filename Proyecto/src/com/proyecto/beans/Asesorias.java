package com.proyecto.beans;

public class Asesorias {
	
	private int IDAsesoria;
	private String Detalle;
	private String Gestion;
	private String Propuestas;
	private String Fecha;
	private String Pagada;
	private int Visitas_IDVisita;


	public Asesorias() {
		
	}
	
	public Asesorias(int IDAsesoria, String Detalle, String Gestion, String Propuestas, String Fecha, 
			String Pagada, int Visitas_IDVisita) {
		
		this.IDAsesoria = IDAsesoria;
		this.Detalle = Detalle;
		this.Gestion = Gestion;
		this.Propuestas = Propuestas;
		this.Fecha = Fecha;
		this.Pagada = Pagada;
		this.Visitas_IDVisita = Visitas_IDVisita;
		
	}

	public int getIDAsesoria() {
		return IDAsesoria;
	}

	public void setIDAsesoria(int iDAsesoria) {
		IDAsesoria = iDAsesoria;
	}

	public String getDetalle() {
		return Detalle;
	}

	public void setDetalle(String detalle) {
		Detalle = detalle;
	}

	public String getGestion() {
		return Gestion;
	}

	public void setGestion(String gestion) {
		Gestion = gestion;
	}
	public String getPropuestas() {
		return Propuestas;
	}

	public void setPropuestas(String propuestas) {
		Propuestas = propuestas;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getPagada() {
		return Pagada;
	}

	public void setPagada(String pagada) {
		Pagada = pagada;
	}

	public int getVisitas_IDVisita() {
		return Visitas_IDVisita;
	}

	public void setVisitas_IDVisita(int visitas_IDVisita) {
		Visitas_IDVisita = visitas_IDVisita;
	}

	
	public String toString() {
		return "Asesorias [IDAsesoria=" + IDAsesoria + ", Detalle=" + Detalle + ", Gestion=" + Gestion + ", Propuestas="
				+ Propuestas + ", Fecha=" + Fecha + ", Pagada=" + Pagada + ", Visitas_IDVisita=" + Visitas_IDVisita
				+ ", getIDAsesoria()=" + getIDAsesoria() + ", getDetalle()=" + getDetalle() + ", getGestion()="
				+ getGestion() + ", getPropuestas()=" + getPropuestas() + ", getFecha()=" + getFecha()
				+ ", getPagada()=" + getPagada() + ", getVisitas_IDVisita()=" + getVisitas_IDVisita() + "]";
	}
	
	

}
