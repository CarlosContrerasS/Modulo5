package com.proyecto.controladores;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.proyecto.beans.Pagos;
import com.proyecto.dao.PagosDao;


@Controller
public class PagoControlador {

	@Autowired
	PagosDao daopao;

	static Logger log = Logger.getLogger(PagoControlador.class.getName());

	@RequestMapping("/AgregarPagoC")    
    public String IngresoPago(Model m){
        m.addAttribute("command", new Pagos());
        log.info("Ingreso a formulario de creación de pagos");
        return "AgregarPagoClienteV";
    } 

    @RequestMapping(value="/AgregarPagoC",method = RequestMethod.POST)    
    public String AgregarPago(@ModelAttribute("pago") Pagos pao){
        daopao.Agregar(pao);
        log.info("Pago creado: " + pao.toString());
        return "redirect:/ListarPagoC";
    }
	
	
	 @RequestMapping("/ListarPagoC")    
	    public String ListarPagos(Model m){    
	        List<Pagos> listapag=daopao.ListaPagos();		
	        m.addAttribute("listapag", listapag);  
	        log.info("Listado de pagos");
	        return "ListarPagosClientesV";			
	    }
	 

	
}


