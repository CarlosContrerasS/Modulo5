<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/menu.css"/>
    <link rel="stylesheet" href="./css/stylesheet.css"/>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500&display=swap" rel="stylesheet">
    <title>Segurimax - Seguridad Laboral</title> 
    <script>
        $(".submenu").click(function(){
$(this).children("ul").slideToggle();
})

$("ul").click(function(ev){
ev.stopPropagation();
})
</script> 
</head>
<body style="background-image: url(./img/fondo.svg); background-position: center center;">
    <header>
        <input type="checkbox" id="btn-menu" />
<label for="btn-menu"><i class="fa fa-bars"></i></label>
 <nav class="menu" style="z-index: 4;">
        <ul>
            <li><a href="./index.jsp">Inicio</a></li>
                 
            <li><a class="submenu" href="#">Accidentes<i class="fa fa-caret-down"></i></a>
                <ul>
                    <li><a href="AgregarAccidenteC">Ingreso Accidente</a></li>
                    <li><a href="ListarAccidenteC">Listado Accidentes</a></li>
                </ul></li>
                 <li><a  class="submenu"  href="#">Visitas<i class="fa fa-caret-down"></i></a>
                <ul>
                    <li><a href="AgregarVisitaC">Agregar Visita</a></li>
                    <li><a href="ListarVisitaC">Listar Visitas</a></li>
                </ul></li>
            
                            
                <li><a class="submenu"  href="#">Asesorias<i class="fa fa-caret-down"></i></a>
                <ul>
                    <li><a href="AgregarAsesoriaC">Ingreso Asesoria</a></li>
                    <li><a href="ListarAsesoriaC">Listado de Asesorias</a></li>
                </ul></li>
                
                <li><a class="submenu"  href="#">Capacitaciones<i class="fa fa-caret-down"></i></a>
                <ul>
                    <li><a href="AgregarCapacitacionesC">Ingreso Capacitacion</a></li>
                    <li><a href="ListarCapacitacionesC">Listado de Capacitaciones</a></li>
                </ul></li>
                
                <li><a class="submenu"  href="#">Mejoras<i class="fa fa-caret-down"></i></a>
                <ul>
                    <li><a href="AgregarMejorasC">Ingreso Mejoras</a></li>
                    <li><a href="ListarMejorasC">Listado de Mejoras</a></li>
                </ul></li>
                
                <li><a class="submenu"  href="#">Check List<i class="fa fa-caret-down"></i></a>
                <ul>
                    <li><a href="AgregarChequeoC">Ingreso Chek List</a></li>
                    <li><a href="ListarChequeoC">Listado de Chek List</a></li>
                </ul></li>
               
            </ul>
        </nav>
</header>
<div id="header_img">
    
    <img src="./img/img_header_profesional.png" title="Segurimax - Inicio" style="width: 100%;">
</div>



<div id="titulo">
    <h1 style="margin-top: 8%;">Securimax - Plataforma Administrador</h1>
    <br>
    <h3 style="margin-bottom: 3%;">Por favor, escoja la opción a la que desea acceder</h3>
</div>

    <div class="contenedor_img_box col-s-12 col-l-12 col-12" style="margin: 10% 0%;">
    
        <div class="img_box col-s-12 col-l-4 col-4">
            <table style="text-align: center; width: 100%; margin: 3% 0%;">
                <caption style="font-weight: bold; width: 100%;"><h2>Actividades</h2></caption>
                <tr>
                    <td><a href="AgregarVisitaC">Agendar Visita</a></td>
                </tr>
                <tr>
                    <td><a href="ListarVisitaC">Visitas Agendadas</a></td>
                </tr>
             </table>
        </div>
        <div class="img_box col-s-12 col-l-4 col-4">
            <table style="text-align: center; width: 100%; margin: 3% 0%;">
                <caption style="font-weight: bold; width: 100%;"><h2>Accidentes</h2></caption>
                <tr>
                    <td><a href="AgregarAccidenteC">Ingreso Accidentes</a></td>
                </tr>
                <tr>
                    <td><a href="ListarAccidenteC">Listado de Accidentes</a></td>
                </tr>
             </table>
        </div>
    
        <div class="img_box col-s-12 col-l-4 col-4">
            <table style="text-align: center; width: 100%; margin: 3% 0%;">
                <caption style="font-weight: bold; width: 100%;"><h2>Asesorias</h2></caption>
                <tr>
                    <td><a href="AgregarAsesoriaC">Ingreso Asesoria</a></td>
                </tr>
                <tr>
                    <td><a href="ListarAsesoriaC">Listado de Asesorias</a></td>
                </tr>
             </table>
        </div>
        </div>
        
         <div class="contenedor_img_box col-s-12 col-l-12 col-12" style="margin: 10% 0%;">
        
        <div class="img_box col-s-12 col-l-4 col-4">
            <table style="text-align: center; width: 100%; margin: 3% 0%;">
                <caption style="font-weight: bold; width: 100%;"><h2>Capacitaciones</h2></caption>
                <tr>
                    <td><a href="AgregarCapacitacionesC">Ingreso Capacitacion</a></td>
                </tr>
                <tr>
                    <td><a href="ListarCapacitacionesC">Listado de Capacitaciones</a></td>
                </tr>
             </table>
        </div>
        
        <div class="img_box col-s-12 col-l-4 col-4">
            <table style="text-align: center; width: 100%; margin: 3% 0%;">
                <caption style="font-weight: bold; width: 100%;"><h2>Mejoras</h2></caption>
                <tr>
                    <td><a href="AgregarMejorasC">Ingreso Mejoras</a></td>
                </tr>
                <tr>
                    <td><a href="ListarMejorasC">Listado de Mejoras</a></td>
                </tr>
             </table>
        </div>
        
        <div class="img_box col-s-12 col-l-4 col-4">
            <table style="text-align: center; width: 100%; margin: 3% 0%;">
                <caption style="font-weight: bold; width: 100%;"><h2>Chek List</h2></caption>
                <tr>
                    <td><a href="AgregarChequeoC">Ingreso Chek List</a></td>
                </tr>
                <tr>
                    <td><a href="ListarChequeoC">Listado de Chek List</a></td>
                </tr>
             </table>
        </div>
      
        </div>
        
<footer>
    <p>Diseño - Talentosos Desarrolladores Jr - 2020</p>
</footer>
</body>
</html>