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

import com.proyecto.beans.Mejoras;
import com.proyecto.dao.MejorasDao;

@Controller
public class MejorasControlador {
	
	@Autowired
	MejorasDao daomej;
	
	static Logger log = Logger.getLogger(MejorasControlador.class.getName());
	
	@RequestMapping("/AgregarMejorasC")    
    public String IngresoFormulario(Model m){
        m.addAttribute("command", new Mejoras()); 
        log.info("Ingreso a formulario de creación de Mejoras");
        return "AgregarMejorasV";
    } 
	
	@RequestMapping(value="/AgregarMejorasP", method = RequestMethod.POST)    
    public String AgregarMejoras(@ModelAttribute("mej") Mejoras mej){  
		daomej.Agregar(mej);												
        log.info("Mejoras creado: " + mej.toString());
        return "redirect:/ListarMejorasC";						
    }
	
	 @RequestMapping("/ListarMejorasC")    
	    public String ListarChequeo(Model m){    
	        List<Mejoras> listamej=daomej.ListaMejoras();		
	        m.addAttribute("listamej", listamej);  
	        log.info("Listado de Mejoras");
	        return "ListarMejorasV";			
	    }
	 
	 @RequestMapping("/EliminarMejorasC")    
	    public String Formulario(Model m){    
	    	 m.addAttribute("command", new Mejoras());
		        log.info("Ingreso a formulario de elimicación de mejoras");
		        return "EliminarMejorasV";		
	    }
	 
	 @RequestMapping(value="/EliminarMejorasP", method = RequestMethod.GET)    
	    public String Eliminar(@RequestParam("idmejoras") int IDMejora){
		 daomej.Eliminar(IDMejora);								//buscar en la base el rut y lo elimina, si no lo encuentra no tira error.
		 log.debug("DEBUG - Mejora eliminada");
		  return "redirect:/ListarMejorasC"; 		// Manda al controlador de listar, para que genere la kista y luego mostrar los clientes
	    }
	 
	 
	 @RequestMapping("/EditarMejorasV")    
	    public String FormularioE(Model m){    
	    	 m.addAttribute("command", new Mejoras());
		        log.info("Ingreso a formulario de actulizacion de mejoras");
		        return "EditarMejorasV";		
	    }
	 
	 @RequestMapping(value="/editMejoraC", method = RequestMethod.GET)    
	    public String edit(@RequestParam("IDMejora") int IDMejora, Model m){  
		        Mejoras mej =daomej.getEmpById(IDMejora);
		        m.addAttribute("Listamej", mej);
		        log.info("Ingreso a edición de mejora");
		        return "EditarMejorasV";
		    }
	 
	 @RequestMapping(value="/editsaveMejorasC",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("mej") Mejoras mej){
	        daomej.update(mej);
	        log.info("Procesando edición de mejoras");
	        return "redirect:/ListarMejorasC";
	    }

}
