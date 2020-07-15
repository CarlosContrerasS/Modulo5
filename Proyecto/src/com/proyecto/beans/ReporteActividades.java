package com.proyecto.beans;

public class ReporteActividades {
	


		private int Rut;
		private String FechaVisita;
		private int IDVisitas;
		private String FechaCapacitacion;
		private int	NumAsistentes;
		private String FechaAsesoria;
		private String Gestion;


		public ReporteActividades() {
		}


		public ReporteActividades(int rut, String fechaVisita, int iDVisitas, String fechaCapacitacion, int numAsistentes,
				String fechaAsesoria, String gestion) {
			super();
			Rut = rut;
			FechaVisita = fechaVisita;
			IDVisitas = iDVisitas;
			FechaCapacitacion = fechaCapacitacion;
			NumAsistentes = numAsistentes;
			FechaAsesoria = fechaAsesoria;
			Gestion = gestion;
		}


		public int getRut() {
			return Rut;
		}


		public void setRut(int rut) {
			Rut = rut;
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


		public String getFechaAsesoria() {
			return FechaAsesoria;
		}


		public void setFechaAsesoria(String fechaAsesoria) {
			FechaAsesoria = fechaAsesoria;
		}


		public String getGestion() {
			return Gestion;
		}


		public void setGestion(String gestion) {
			Gestion = gestion;
		}


		@Override
		public String toString() {
			return "Actividades [Rut=" + Rut + ", FechaVisita=" + FechaVisita + ", IDVisitas=" + IDVisitas
					+ ", FechaCapacitacion=" + FechaCapacitacion + ", NumAsistentes=" + NumAsistentes
					+ ", FechaAsesoria=" + FechaAsesoria + ", Gestion=" + Gestion + "]";
		}
		
		
}	


	
