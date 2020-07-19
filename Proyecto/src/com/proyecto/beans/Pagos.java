package com.proyecto.beans;

public class Pagos {
	
	private int IDPago;
	private String FechaPago;
	private String FechaVencimiento;
	private int MontoRegular;
	private int MontoAdicional;
	private int Rut_ID;


	public Pagos( int  IDPago, String FechaPago, String FechaVencimiento, int MontoRegular, int MontoAdicional, int Rut) {

		this.IDPago = IDPago;
		this.FechaPago = FechaPago;
		this.FechaVencimiento = FechaVencimiento;
		this.MontoRegular = MontoRegular;
		this.MontoAdicional = MontoAdicional;
		this.Rut_ID = Rut;

	}

	public String getFechaVencimiento() {
		return FechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		FechaVencimiento = fechaVencimiento;
	}

	public Pagos() {
		
		
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

	public int getRut_ID() {
		return Rut_ID;
	}

	public void setRut_ID(int rut) {
		Rut_ID = rut;
	}

	
	@Override
	public String toString() {
		return "Pagos [IDPago=" + IDPago + ", FechaPago=" + FechaPago + ", FechaVencimiento=" + FechaVencimiento
				+ ", MontoRegular=" + MontoRegular + ", MontoAdicional=" + MontoAdicional + ", Rut_ID=" + Rut_ID
				+ ", getFechaVencimiento()=" + getFechaVencimiento() + ", getIDPago()=" + getIDPago()
				+ ", getFechaPago()=" + getFechaPago() + ", getMontoRegular()=" + getMontoRegular()
				+ ", getMontoAdicional()=" + getMontoAdicional() + ", getRut_ID()=" + getRut_ID() + "]";
	}


	
	

}
