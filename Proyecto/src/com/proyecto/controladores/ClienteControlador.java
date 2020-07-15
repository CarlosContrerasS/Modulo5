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

import com.proyecto.controladores.ClienteControlador;
import com.proyecto.beans.Cliente;
import com.proyecto.dao.ClienteDao; 

@Controller
public class ClienteControlador {
	
	@Autowired
	ClienteDao dao;
	
	static Logger log = Logger.getLogger(ClienteControlador.class.getName());
	
	//LLega del index y lo manda la vista para recoger la información
	
	 @RequestMapping("/AgregarClienteC")    
	    public String IngresoFormulario(Model m){
	        m.addAttribute("command", new Cliente()); 
	        log.info("Ingreso a formulario de creación de clientes");
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
	        m.addAttribute("list", list);  
	        log.info("Listado de clientes");
	        return "ListarClientesV";			//Manda a la vista para poder verlos.
	    }
	 
	 
	 //Este Controlador recibe de la pestaña del nav para eliminar un cliente
	 
	  @RequestMapping("/EliminarClienteC")    
	    public String Formulario(Model m){    
	    	 m.addAttribute("command", new Cliente());
		        log.info("Ingreso a formulario de elimicación de clientes");
		        return "EliminarClienteV";		// Manda a la vista para que se escriba el rut del cliente a eliminar
	    }
	  
	  //LLega del formulario donde se ingresa el rut o de la lista donde se trae el rut
	  
	 @RequestMapping(value="/EliminarCliente", method = RequestMethod.POST)    
	    public String Eliminar(@RequestParam("rut") int rut){
		 dao.Eliminar(rut);								//buscar en la base el rut y lo elimina, si no lo encuentra no tira error.
		 log.debug("DEBUG - Cliente eliminado");
		  return "redirect:/ListarClienteC"; 		// Manda al controlador de listar, para que genere la kista y luego mostrar los clientes
	    }
	  
	 @RequestMapping(value="/EliminarCliente", method = RequestMethod.GET)    
	    public String Eliminar2(@RequestParam("rut") int rut){
		 dao.Eliminar(rut);								//buscar en la base el rut y lo elimina, si no lo encuentra no tira error.
		 log.debug("DEBUG - Cliente eliminado");
		  return "redirect:/ListarClienteC"; 		// Manda al controlador de listar, para que genere la kista y luego mostrar los clientes
	    }
	 
	 @RequestMapping("/EditarClienteC")    
	    public String Actualizar( Model m){    
    	 m.addAttribute("command", new Cliente());
	     log.info("Ingreso a edición de clientes");
	        return "BuscarEditarClienteV";
	    }

	    @RequestMapping(value="/EditarCliente", method = RequestMethod.GET)    
	    public String EditarListar(Model c){    
	    	List<Cliente> lista=dao.ListaClientes();		//genera la lista que mostrara
		       c.addAttribute("lista", lista);  
	        log.info("Procesando edición de clientes");
	        return "redirect:/EditarClienteV";
	    }
	    
	    @RequestMapping(value="/EditarCliente", method = RequestMethod.POST)    
	    public String Editar_Listado(@ModelAttribute("cliente") Cliente cliente){
	    	dao.Editar(cliente);
	    	log.info("Mostrando la edición de clientes");
	        return "redirect:/ListarClienteC";
	    }

	   
}
