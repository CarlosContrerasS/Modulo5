package com.proyecto.controladores;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.beans.Atrasos;
import com.proyecto.dao.AtrasosDao;

@Controller
public class AtrasosControlador {
	
	@Autowired
	AtrasosDao daoatr;
	
	static Logger log = Logger.getLogger(AtrasosControlador.class.getName());
	
	@RequestMapping("/ListarAtrasosC")    
    public String ListarAtrasos(Model m){    
        List<Atrasos> listaatr=daoatr.ListaAtrasos();		//genera la lista que mostrara
        m.addAttribute("listaAtrasos", listaatr);  
        log.info("Listado de Actividades");
        return "ListarAtrasosV";			//Manda a la vista para poder verlos.
	}

}
