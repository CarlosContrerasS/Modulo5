package com.proyecto.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class AccesoControlador {

	@RequestMapping("/AccesoAdministradorC")    
    public String Acceso(){
        return "acceso_administrador";
    } 

}
