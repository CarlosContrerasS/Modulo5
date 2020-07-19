package com.proyecto.controladores;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.beans.Chequeo;
import com.proyecto.dao.ChequeoDao;

@Controller
public class ChequeoControlador {
	
	@Autowired
	ChequeoDao daoche;
	
	static Logger log = Logger.getLogger(ChequeoControlador.class.getName());
	
	@RequestMapping("/AgregarChequeoC")    
    public String IngresoFormulario(Model m){
        m.addAttribute("command", new Chequeo()); 
        log.info("Ingreso a formulario de creación de chequeo");
        return "AgregarChequeoV";
    } 
	
	@RequestMapping(value="/AgregarChequeoP", method = RequestMethod.POST)    
    public String AgregarChequeo(@ModelAttribute("che") Chequeo che){  
		daoche.Agregar(che);												
        log.info("Chequeo creado: " + che.toString());
        return "redirect:/ListarChequeoC";						
    }
	
	 @RequestMapping("/ListarChequeoC")    
	    public String ListarChequeo(Model m){    
	        List<Chequeo> listache=daoche.ListaChequeo();		
	        m.addAttribute("listache", listache);  
	        log.info("Listado de Chequeo");
	        return "ListarChequeoV";			
	    }
	 
	 @RequestMapping("/EliminarChequeoC")    
	    public String Formulario(Model m){    
	    	 m.addAttribute("command", new Chequeo());
		        log.info("Ingreso a formulario de elimicación de chequeo");
		        return "EliminarChequeoV";		
	    }
	 
	 @RequestMapping(value="/EliminarChequeoP", method = RequestMethod.GET)    
	    public String Eliminar(@RequestParam("idcahequeo") int IDChequeo){
		 daoche.Eliminar(IDChequeo);								//buscar en la base el rut y lo elimina, si no lo encuentra no tira error.
		 log.debug("DEBUG - Che eliminada");
		  return "redirect:/ListarChequeoC"; 		// Manda al controlador de listar, para que genere la kista y luego mostrar los clientes
	    }
	 
	 
	 @RequestMapping("/EditarChequeoV")    
	    public String FormularioE(Model m){    
	    	 m.addAttribute("command", new Chequeo());
		        log.info("Ingreso a formulario de actulizacion de chequeo");
		        return "EditarChequeoV";		
	    }
	 
	 @RequestMapping(value="/editChequeoC", method = RequestMethod.GET)    
	    public String edit(@RequestParam("IDChequeo") int IDChequeo, Model m){  
		        Chequeo che =daoche.getEmpById(IDChequeo);
		        m.addAttribute("ListaChe", che);
		        log.info("Ingreso a edición de chequeo");
		        return "EditarChequeoV";
		    }
	 
	 @RequestMapping(value="/editsaveChequeoC",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("che") Chequeo che){
	        daoche.update(che);
	        log.info("Procesando edición de chequeo");
	        return "redirect:/ListarChequeoC";
	    }

}
