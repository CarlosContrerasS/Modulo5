package com.proyecto.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class AccesoControlador {

	@RequestMapping("/AccesoAdministradorC")    
    public String Acceso1(){
        return "acceso_administrador";
    } 
	
	@RequestMapping("/AccesoClienteC")    
    public String Acceso2(){
        return "acceso_cliente";
    } 
	
	@RequestMapping("/AccesoProfesionalC")    
    public String Acceso3(){
        return "acceso_profesional";
    } 

}
