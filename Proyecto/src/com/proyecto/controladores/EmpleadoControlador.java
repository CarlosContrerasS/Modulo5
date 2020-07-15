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

import com.proyecto.beans.Empleado;
import com.proyecto.dao.EmpleadoDao;


@Controller
public class EmpleadoControlador {

	
	@Autowired
	EmpleadoDao daoemp;
	
	
	static Logger log = Logger.getLogger(EmpleadoControlador.class.getName());
	
	@RequestMapping("/AgregarEmpleadoC")    
    public String IngresoFormulario(Model m){
        m.addAttribute("command", new Empleado()); 
        log.info("Ingreso a formulario de creación de empleado");
        return "AgregarEmpleadoV";
    } 
	
	@RequestMapping(value="/AgregarEmpleadoP", method = RequestMethod.POST)    
    public String AgregarEmpleado(@ModelAttribute("emp") Empleado emp){  
		System.out.println(emp.getNombreEmpleado());
		daoemp.Agregar(emp);												
        log.info("Empleado creado: " + emp.toString());
        return "redirect:/ListarEmpleadoC";						
    }
	
	 @RequestMapping("/ListarEmpleadoC")    
	    public String ListarEmpleado(Model m){    
	        List<Empleado> list=daoemp.ListaEmpleados();		
	        m.addAttribute("listV", list);  
	        log.info("Listado de empleados");
	        return "ListarEmpleadosV";			
	    }
	 
	 @RequestMapping("/EliminarEmpleadoC")    
	    public String Formulario(Model m){    
	    	 m.addAttribute("command", new Empleado());
		        log.info("Ingreso a formulario de elimicación de empleados");
		        return "EliminarEmpleadoV";		
	    }
	 
	 @RequestMapping(value="/EliminarEmpleadoP", method = RequestMethod.GET)    
	    public String Eliminar(@RequestParam("RutEmpleado") int RutEmpleado){
		 System.out.println(RutEmpleado);
		 daoemp.Eliminar(RutEmpleado);								//buscar en la base el rut y lo elimina, si no lo encuentra no tira error.
		 log.debug("DEBUG - Empleado eliminado");
		  return "redirect:/ListarEmpleadoC"; 		// Manda al controlador de listar, para que genere la kista y luego mostrar los clientes
	    }
	 
	 
	 @RequestMapping("/EditarEmpleadoV")    
	    public String FormularioE(Model m){    
	    	 m.addAttribute("command", new Empleado());
		        log.info("Ingreso a formulario de actulizacion de empleados");
		        return "EditarEmpleadoV";		
	    }
	 
	 @RequestMapping(value="/editEmpleadoC", method = RequestMethod.GET)    
	    public String edit(@RequestParam("RutEmpleado") int RutEmpleado, Model m){  
		        Empleado emp =daoemp.getEmpById(RutEmpleado);
		        m.addAttribute("ListaE",emp);
		        log.info("Ingreso a edición de clientes");
		        return "EditarEmpleadoV";
		    }
	 
	 @RequestMapping(value="/editsaveEmpleadoC",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("emp") Empleado emp){
	        daoemp.update(emp);
	        log.info("Procesando edición de empleados");
	        return "redirect:/ListarEmpleadoC";
	    }
	 
	 
}

	

