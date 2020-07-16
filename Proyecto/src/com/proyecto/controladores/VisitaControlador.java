package com.proyecto.controladores;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.proyecto.beans.Visitas;
import com.proyecto.dao.VisitasDao;

@Controller
public class VisitaControlador {

	@Autowired
	VisitasDao daovis;
	
	static Logger log = Logger.getLogger(ClienteControlador.class.getName());

	@RequestMapping("/AgregarVisitaC")
	public String IngresoFormulario(Model m) {
	m.addAttribute("command", new Visitas());
	log.info("Ingreso a formulario de creación de visita");
	return "AgregarVisitaClienteV";
	}
	
	@RequestMapping(value="/AgregarVisitaC", method= RequestMethod.POST)
	public String AgregarVisita(@ModelAttribute("vis") Visitas vis) {
		daovis.AgregarVisita(vis);
		log.info("Visita creada; " + vis.toString());
		return "redirect:/ListarVisitaC";
	}
	@RequestMapping("/ListarVisitaC")
	public String ListarVisitas(Model V) {
		List<Visitas> listavis =daovis.ListarVisitas();
		V.addAttribute("listavis", listavis);
		log.info("Listado de Visitas");
		return "ListarVisitasClientesV";
		
	}
	
}
