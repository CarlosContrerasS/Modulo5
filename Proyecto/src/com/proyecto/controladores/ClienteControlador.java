package com.proyecto.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.log4j.Logger;


import com.proyecto.beans.Cliente;
import com.proyecto.dao.ClienteDao; 

@Controller
public class ClienteControlador {
	
	@Autowired
	ClienteDao dao;
	
	static Logger log = Logger.getLogger(ClienteControlador.class.getName());
	
	//LLega del index y lo manda la vista para recoger la informaci�n
	
	 @RequestMapping("/AgregarClienteC")    
	    public String IngresoFormulario(Model m){
	        m.addAttribute("command", new Cliente()); 
	        log.info("Ingreso a formulario de creaci�n de clientes");
	        return "AgregarClienteV";
	    } 
	 
	 // LLega del formulario con los datos
	 
	@RequestMapping(value="/AgregarClienteC", method = RequestMethod.POST)    
    public String AgregarCliente(@ModelAttribute("cli") Cliente cli){    
        dao.Agregar(cli);												//Agrego al nuevo cliente
        log.info("Cliente creado: " + cli.toString());
        return "redirect:/ListarClienteC";						//Envio al controlador para que lo muestre en la lista
    }
	
		// Este controlador crea la lista para mandar a mostrar los clientes.
	 @RequestMapping("/ListarClienteC")    
	    public String ListarCliente(Model m){    
	        List<Cliente> list=dao.ListaClientes();		//genera la lista que mostrara
	        m.addAttribute("listCl", list);  
	        log.info("Listado de clientes");
	        return "ListarClientesV";			//Manda a la vista para poder verlos.
	    }
	 
	 
	 //Este Controlador recibe de la pesta�a del nav para eliminar un cliente
	 
	  @RequestMapping("/EliminarClienteC")    
	    public String Formulario(Model m){    
	    	 m.addAttribute("command", new Cliente());
		        log.info("Ingreso a formulario de elimicaci�n de clientes");
		        return "EliminarClienteV";		// Manda a la vista para que se escriba el rut del cliente a eliminar
	    }
	  
	  //LLega del formulario donde se ingresa el rut o de la lista donde se trae el rut
	  
	 @RequestMapping(value="/EliminarCliente", method = RequestMethod.POST)    
	    public String Eliminar(@RequestParam("rut") int rut){
		 dao.Eliminar(rut);								//buscar en la base el rut y lo elimina, si no lo encuentra no tira error.
		 log.debug("DEBUG - Cliente eliminado");
		  return "redirect:/ListarClienteC"; 		// Manda al controlador de listar, para que genere la kista y luego mostrar los clientes
	    }
	  
	 @RequestMapping(value="/EliminarClienteP", method = RequestMethod.GET)    
	    public String Eliminar2(@RequestParam("Rut") int Rut){
		 dao.Eliminar(Rut);								//buscar en la base el rut y lo elimina, si no lo encuentra no tira error.
		 log.debug("DEBUG - Cliente eliminado");
		  return "redirect:/ListarClienteC"; 		// Manda al controlador de listar, para que genere la kista y luego mostrar los clientes
	    }
	 
	 @RequestMapping("/EditarClienteV")
	    public String FormularioE(Model m){
	    	 m.addAttribute("command", new Cliente());
		        log.info("Ingreso a formulario de actualizacion de empleados");
		        return "EditarClienteV";		
	    }
	
	 @RequestMapping(value="/editClienteC", method = RequestMethod.GET)
	    public String edit2(@RequestParam("Rut") int Rut, Model m){
		 Cliente cli =dao.getEmpById(Rut);
		        m.addAttribute("listaCliente",cli);
		        log.info("Ingreso a edici�n de clientes");
		        return "EditarClienteV";
		    }
	
	 @RequestMapping(value="/editsaveClienteC", method = RequestMethod.POST)
	   public String editsave2(@ModelAttribute("c") Cliente c){
	        dao.update(c);
	        log.info("Procesando edici�n de clientes");
	        return "redirect:/ListarClienteC";
	    }
	   
}
