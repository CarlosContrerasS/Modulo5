package com.proyecto.beans;

public class Capacitaciones {

	private int IDCapacitacion;
	private String Fecha;
	private String Hora;
	private int NumAsistentes;
	private int Visitas_IDVisita;

	
	public Capacitaciones( int IDCapacitacion, String Fecha, String Hora, int NumAsistentes, int Visita_IDVisita) {
		this.IDCapacitacion = IDCapacitacion;
		this.Fecha = Fecha;
		this.NumAsistentes = NumAsistentes;
		this.Visitas_IDVisita = Visita_IDVisita;
		

	}
	
	public Capacitaciones() {
		
	}

	public int getIDCapacitacion() {
		return IDCapacitacion;
	}

	public void setIDCapacitacion(int iDCapacitacion) {
		IDCapacitacion = iDCapacitacion;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}

	public int getNumAsistentes() {
		return NumAsistentes;
	}

	public void setNumAsistentes(int numAsistentes) {
		NumAsistentes = numAsistentes;
	}

	public int getVisitas_IDVisita() {
		return Visitas_IDVisita;
	}

	public void setVisitas_IDVisita(int visita_IDVisita) {
		Visitas_IDVisita = visita_IDVisita;
	}

	@Override
	public String toString() {
		return "Capacitaciones [IDCapacitacion=" + IDCapacitacion + ", Fecha=" + Fecha + ", Hora=" + Hora
				+ ", NumAsistentes=" + NumAsistentes + ", Visita_IDVisita=" + Visitas_IDVisita + ", getIDCapacitacion()="
				+ getIDCapacitacion() + ", getFecha()=" + getFecha() + ", getHora()=" + getHora()
				+ ", getNumAsistentes()=" + getNumAsistentes() + ", getVisita_IDVisita()=" + getVisitas_IDVisita() + "]";
	}

	

	
}
