package com.proyecto.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  


import org.springframework.web.bind.annotation.RequestMapping;    

import org.apache.log4j.Logger;

import com.proyecto.beans.ReporteActividades;
import com.proyecto.dao.ReporteDao;

@Controller
public class ReporteControlador {
	
	@Autowired
	ReporteDao daorep;
	
	static Logger log = Logger.getLogger(ReporteControlador.class.getName());
	
	@RequestMapping("/ListarActividadesC")    
    public String ListarActividades(Model m){    
        List<ReporteActividades> listaact=daorep.ListaActividades();		//genera la lista que mostrara
        m.addAttribute("listaact", listaact);  
        log.info("Listado de Actividades");
        return "ListarActividadesV";			//Manda a la vista para poder verlos.
	}
}