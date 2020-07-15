package com.proyecto.controladores;
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

import org.apache.log4j.Logger;

import com.proyecto.beans.Accidentes;
import com.proyecto.dao.AccidentesDao;


@Controller
public class AccidenteControlador {
	
	@Autowired
	AccidentesDao daoacc;
	
	static Logger log = Logger.getLogger(AccidenteControlador.class.getName());
	
	//LLega del index y lo manda la vista para recoger la información
	
	 @RequestMapping("/AgregarAccidenteC")    
	    public String IngresoFormulario(Model m){
	        m.addAttribute("command", new Accidentes()); 
	        log.info("Ingreso a formulario de creación de accidentes");
	        return "AgregarAccidenteV";
	    } 
	 
	 @RequestMapping(value="/AgregarAccidenteC", method = RequestMethod.POST)    
	    public String AgregarAccidenteM(@ModelAttribute("acc") Accidentes acc){    
	        daoacc.AgregarAccidenteM(acc);												//Agrego al nuevo accidente
	        log.info("Accidente creado: " + acc.toString());
	        return "redirect:/ListarAccidenteC";						//Envio al controlador para que lo muestre en la lista
	    }
	 
	// Este controlador crea la lista de accidentes.
		 @RequestMapping("/ListarAccidenteC")    
		    public String ListarAccidente(Model m){    
		        List<Accidentes> listaacc=daoacc.ListarAccidenteM();		//genera la lista que mostrara
		        m.addAttribute("listaacc", listaacc);  
		        log.info("Listado de Accidentes");
		        return "ListarAccidenteV";			//Manda a la vista para poder verlos.
		    }
		 
	
}
