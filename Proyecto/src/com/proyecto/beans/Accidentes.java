package com.proyecto.beans;

public class Accidentes {
	private int IdAccidente;
	private String Fecha;
	private String Hora;
	private String Suceso;
	private String	Lugar;
	private int Rut_Id;
	private int Dias_Perdidos;
	private int Num_Trab;


	public Accidentes() {
		
	}
	public Accidentes(int IdAccidente, String Fecha, String 	Hora, String Suceso, String Lugar, int Rut_Id, 
			int Dias_Perdidos, int Num_Trab) {
			
		this.IdAccidente = IdAccidente;
		this.Fecha = Fecha;
		this.Hora = Hora;
		this.Suceso = Suceso;
		this.Lugar = Lugar;
		this.Rut_Id = Rut_Id;
		this.Dias_Perdidos = Dias_Perdidos;
		this.Num_Trab = Num_Trab;
		
	}
	public int getIdAccidente() {
		return IdAccidente;
	}
	public void setIdAccidente(int idAccidente) {
		IdAccidente = idAccidente;
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
	public String getSuceso() {
		return Suceso;
	}
	public void setSuceso(String suceso) {
		Suceso = suceso;
	}
	public String getLugar() {
		return Lugar;
	}
	public void setLugar(String lugar) {
		Lugar = lugar;
	}
	public int getRut_Id() {
		return Rut_Id;
	}
	public void setRut_Id(int rut_Id) {
		Rut_Id = rut_Id;
	}
	public int getDias_Perdidos() {
		return Dias_Perdidos;
	}
	public void setDias_Perdidos(int dias_Perdidos) {
		Dias_Perdidos = dias_Perdidos;
	}
	public int getNum_Trab() {
		return Num_Trab;
	}
	public void setNum_Trab(int num_Trab) {
		Num_Trab = num_Trab;
	}
	
	public String toString() {
		return "Accidente [IdAccidente=" + IdAccidente + ", Fecha=" + Fecha + ", Hora=" + Hora + ", Suceso=" + Suceso
				+ ", Lugar=" + Lugar + ", Rut_Id=" + Rut_Id + ", Dias_Perdidos=" + Dias_Perdidos + ", Num_Trab="
				+ Num_Trab + ", getIdAccidente()=" + getIdAccidente() + ", getFecha()=" + getFecha() + ", getHora()="
				+ getHora() + ", getSuceso()=" + getSuceso() + ", getLugar()=" + getLugar() + ", getRut_Id()="
				+ getRut_Id() + ", getDias_Perdidos()=" + getDias_Perdidos() + ", getNum_Trab()=" + getNum_Trab() + "]";
	}
	
	

}
