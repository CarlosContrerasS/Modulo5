package com.proyecto.beans;

public class Pagos {
	
	private int IDPago;
	private String FechaPago;
	private int MontoRegular;
	private int MontoAdicional;
	private int Rut_ID;


	public Pagos( int  IDPago, String FechaPago, int MontoRegular, int MontoAdicional, int Rut) {

		this.IDPago = IDPago;
		this.FechaPago = FechaPago;
		this.MontoRegular = MontoRegular;
		this.MontoAdicional = MontoAdicional;
		this.Rut_ID = Rut;

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
		return "Pagos [IDPago=" + IDPago + ", FechaPago=" + FechaPago + ", MontoRegular=" + MontoRegular
				+ ", MontoAdicional=" + MontoAdicional + ", Rut=" + Rut_ID + ", getIDPago()=" + getIDPago()
				+ ", getFechaPago()=" + getFechaPago() + ", getMontoRegular()=" + getMontoRegular()
				+ ", getMontoAdicional()=" + getMontoAdicional() + ", getRut()=" + getRut_ID() + "]";
	}
	
	

}
