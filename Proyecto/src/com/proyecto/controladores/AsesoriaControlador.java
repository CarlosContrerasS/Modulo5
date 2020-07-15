package com.proyecto.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

import org.apache.log4j.Logger;

import com.proyecto.beans.Asesorias;
import com.proyecto.dao.AsesoriasDao;

@Controller
public class AsesoriaControlador {

	@Autowired
	AsesoriasDao daoase;
	
	static Logger log = Logger.getLogger(AsesoriaControlador.class.getName());
	
	 @RequestMapping("/AgregarAsesoriaC")    
	    public String Ingreso(Model m){
	        m.addAttribute("command", new Asesorias()); 
	        log.info("Ingreso a formulario de creación de asesorias");
	        return "AgregarAsesoriaV";
	    } 
	 
	 @RequestMapping(value="/AgregarAsesoriaC", method = RequestMethod.POST)    
	    public String AgregarAsesorias(@ModelAttribute("ase") Asesorias ase){    
	        daoase.AgregarAsesorias(ase);												//Agrego al nuevo accidente
	        log.info("Asesoria creada: " + ase.toString());
	        return "redirect:/ListarAsesoriaC";						//Envio al controlador para que lo muestre en la lista
	    }
	 
	// Este controlador crea la lista de accidentes.
		 @RequestMapping("/ListarAsesoriaC")    
		    public String ListarAsesorias(Model m){    
		        List<Asesorias> listaase=daoase.ListarAsesorias();		//genera la lista que mostrara
		        m.addAttribute("listaase", listaase);  
		        log.info("Listado de Asesorias");
		        return "ListarAsesoriaV";			//Manda a la vista para poder verlos.
		    }

}
