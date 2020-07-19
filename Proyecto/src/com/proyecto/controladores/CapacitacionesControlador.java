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

import com.proyecto.beans.Capacitaciones;
import com.proyecto.dao.CapacitacionesDao;

@Controller
public class CapacitacionesControlador {
	
	@Autowired
	CapacitacionesDao daocap;
	
	static Logger log = Logger.getLogger(CapacitacionesControlador.class.getName());
	
	@RequestMapping("/AgregarCapacitacionesC")    
    public String IngresoFormulario(Model m){
        m.addAttribute("command", new Capacitaciones()); 
        log.info("Ingreso a formulario de creación de capacitaciones");
        return "AgregarCapacitacionesV";
    } 
	
	@RequestMapping(value="/AgregarCapacitaconesP", method = RequestMethod.POST)    
    public String AgregarCapacitaciones(@ModelAttribute("cap") Capacitaciones cap){  
		daocap.Agregar(cap);												
        log.info("Capacitacion creado: " + cap.toString());
        return "redirect:/ListarCapacitacionesC";						
    }
	
	 @RequestMapping("/ListarCapacitacionesC")    
	    public String ListarCapacitaciones(Model m){    
	        List<Capacitaciones> listacap=daocap.ListaCapacitaciones();		
	        m.addAttribute("listacap", listacap);  
	        log.info("Listado de Capacitaciones");
	        return "ListarCapacitacionesV";			
	    }
	 
	 @RequestMapping("/EliminarCapacitacionesC")    
	    public String Formulario(Model m){    
	    	 m.addAttribute("command", new Capacitaciones());
		        log.info("Ingreso a formulario de elimicación de capacitaciones");
		        return "EliminarCapacitacionesV";		
	    }
	 
	 @RequestMapping(value="/EliminarCapacitacionesP", method = RequestMethod.GET)    
	    public String Eliminar(@RequestParam("idcapacitaciones") int IDCapacitacion){
		 daocap.Eliminar(IDCapacitacion);								//buscar en la base el rut y lo elimina, si no lo encuentra no tira error.
		 log.debug("DEBUG - Capacitacion eliminada");
		  return "redirect:/ListarCapacitacionesC"; 		// Manda al controlador de listar, para que genere la kista y luego mostrar los clientes
	    }
	 
	 
	 @RequestMapping("/EditarCapacitacionesV")    
	    public String FormularioE(Model m){    
	    	 m.addAttribute("command", new Capacitaciones());
		        log.info("Ingreso a formulario de actulizacion de capacitaciones");
		        return "EditarCapacitacionV";		
	    }
	 
	 @RequestMapping(value="/editCapacitacionesC", method = RequestMethod.GET)    
	    public String edit(@RequestParam("IDCapacitacion") int IDCapacitacion, Model m){  
		        Capacitaciones cap =daocap.getEmpById(IDCapacitacion);
		        m.addAttribute("ListaCap", cap);
		        log.info("Ingreso a edición de capacitaciones");
		        return "EditarCapacitacionesV";
		    }
	 
	 @RequestMapping(value="/editsaveCpacitacionesC",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("cap") Capacitaciones cap){
	        daocap.update(cap);
	        log.info("Procesando edición de capacitaciones");
	        return "redirect:/ListarCapacitacionesC";
	    }

}
