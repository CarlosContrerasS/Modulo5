package com.proyecto.beans;

public class Checklist {
	
	private int IDChequeo;
	private String Detalle;
	private String Estado;
	private int Visita_IDVisita;


	public Checklist(int IDChequeo, String Detalle, String Estado, int Visita_IDVisita) {

		this.IDChequeo = IDChequeo;
		this.Detalle = Detalle;
		this.Estado = Estado;
		this.Visita_IDVisita = Visita_IDVisita;
	}
	
public Checklist() {
		
	}

public int getIDChequeo() {
	return IDChequeo;
}

public void setIDChequeo(int iDChequeo) {
	IDChequeo = iDChequeo;
}

public String getDetalle() {
	return Detalle;
}

public void setDetalle(String detalle) {
	Detalle = detalle;
}

public String getEstado() {
	return Estado;
}

public void setEstado(String estado) {
	Estado = estado;
}

public int getVisita_IDVisita() {
	return Visita_IDVisita;
}

public void setVisita_IDVisita(int visita_IDVisita) {
	Visita_IDVisita = visita_IDVisita;
}

@Override
public String toString() {
	return "Checklist [IDChequeo=" + IDChequeo + ", Detalle=" + Detalle + ", Estado=" + Estado + ", Visita_IDVisita="
			+ Visita_IDVisita + ", getIDChequeo()=" + getIDChequeo() + ", getDetalle()=" + getDetalle()
			+ ", getEstado()=" + getEstado() + ", getVisita_IDVisita()=" + getVisita_IDVisita() + "]";
}

	

}
