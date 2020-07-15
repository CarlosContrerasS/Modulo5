package com.proyecto.controladores;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.beans.ReporteGlobal;
import com.proyecto.dao.ReporteGlobalDao;

@Controller
public class ReporteGlobalControlador {

	@Autowired
	ReporteGlobalDao daorepG;
	
	static Logger log = Logger.getLogger(ReporteControlador.class.getName());
	
	@RequestMapping("/ListarGlobalC")    
    public String ListarGlobal(Model g){    
        List<ReporteGlobal> listaGlobal=daorepG.ListaGlobal();		//genera la lista que mostrara
        g.addAttribute("listaGlobal", listaGlobal);  
        log.info("Listado global");
        return "ListarGlobalV";			//Manda a la vista para poder verlos.
	}

}
