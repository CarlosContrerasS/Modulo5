package com.proyecto.beans;

public class ReporteGlobal {
	
	private int Rut;
	private String Nombre;
	private int IDPago;
	private int FechaPago;
	private int MontoRegular;
	private int MontoAdicional;
	private float Accidentabilidad;	
	private String FechaVisita;
	private int IDVisitas;
	private String FechaCapacitacion;
	private int NumAsistentes;
	private String FechaAsesorias;
	private String Gestion;

	public ReporteGlobal() {
		
	}

	public ReporteGlobal(int rut, String nombre, int iDPago, int fechaPago, int montoRegular, int montoAdicional,
			float accidentabilidad, String fechaVisita, int iDVisitas, String fechaCapacitacion, int numAsistentes,
			String fechaAsesorias, String gestion) {
		super();
		Rut = rut;
		Nombre = nombre;
		IDPago = iDPago;
		FechaPago = fechaPago;
		MontoRegular = montoRegular;
		MontoAdicional = montoAdicional;
		Accidentabilidad = accidentabilidad;
		FechaVisita = fechaVisita;
		IDVisitas = iDVisitas;
		FechaCapacitacion = fechaCapacitacion;
		NumAsistentes = numAsistentes;
		FechaAsesorias = fechaAsesorias;
		Gestion = gestion;
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

	public int getFechaPago() {
		return FechaPago;
	}

	public void setFechaPago(int fechaPago) {
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

	public float getAccidentabilidad() {
		return Accidentabilidad;
	}

	public void setAccidentabilidad(float accidentabilidad) {
		Accidentabilidad = accidentabilidad;
	}

	public String getFechaVisita() {
		return FechaVisita;
	}

	public void setFechaVisita(String fechaVisita) {
		FechaVisita = fechaVisita;
	}

	public int getIDVisitas() {
		return IDVisitas;
	}

	public void setIDVisitas(int iDVisitas) {
		IDVisitas = iDVisitas;
	}

	public String getFechaCapacitacion() {
		return FechaCapacitacion;
	}

	public void setFechaCapacitacion(String fechaCapacitacion) {
		FechaCapacitacion = fechaCapacitacion;
	}

	public int getNumAsistentes() {
		return NumAsistentes;
	}

	public void setNumAsistentes(int numAsistentes) {
		NumAsistentes = numAsistentes;
	}

	public String getFechaAsesorias() {
		return FechaAsesorias;
	}

	public void setFechaAsesorias(String fechaAsesorias) {
		FechaAsesorias = fechaAsesorias;
	}

	public String getGestion() {
		return Gestion;
	}

	public void setGestion(String gestion) {
		Gestion = gestion;
	}

	@Override
	public String toString() {
		return "ReporteGlobal [Rut=" + Rut + ", Nombre=" + Nombre + ", IDPago=" + IDPago + ", FechaPago=" + FechaPago
				+ ", MontoRegular=" + MontoRegular + ", MontoAdicional=" + MontoAdicional + ", Accidentabilidad="
				+ Accidentabilidad + ", FechaVisita=" + FechaVisita + ", IDVisitas=" + IDVisitas
				+ ", FechaCapacitacion=" + FechaCapacitacion + ", NumAsistentes=" + NumAsistentes + ", FechaAsesorias="
				+ FechaAsesorias + ", Gestion=" + Gestion + "]";
	}

	
	
	

}