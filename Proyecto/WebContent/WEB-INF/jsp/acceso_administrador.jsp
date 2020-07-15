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
<li class="submenu"><a href="#">Clientes <i class="fa fa-caret-down"></i></a>
  <ul>
    <li><a href="AgregarClienteC">Crear Cliente</a></li>
    <li><a href="EditarClienteC">Editar Cliente</a></li>
    <li><a href="/EliminarClienteC">Borrar Cliente</a></li>
    <li><a href="/ListadoGlobal">Informe Cliente</a></li>
    <li><a href="ListarClienteC">Listado de Clientes</a></li>
  </ul>
</li>
<li class="submenu"><a href="#">Profesionales<i class="fa fa-caret-down"></i></a>
  <ul>
      <li><a href="#">Crear Profesional</a></li>
      <li><a href="/AgregarEmpleado">Ingresar Profesional</a></li>
    <li><a href="/EditarEmpleado.jsp">Editar Profesional</a></li>
    <li><a href="/EliminarEmpleado.jsp">Borrar Profesional</a></li>
    <li><a href="/ListadoEmpleados">Listado de Profesionales</a></li>
    <li><a href="/AgregarVisita">Agendar Visita</a></li>
    <li><a href="/ListarVisita">Vistas Agendas</a></li>
  </ul>
  
  
</li>
<li><a href="#">Accidentes</a>
    <ul>
        <li><a href="/AgregarAccidente">Ingreso Accidente</a></li>
        <li><a href="/ListadoAccidentes">Listado Accidentes</a></li>
    </ul></li>
     <li><a href="#">Visitas</a>
    <ul>
        <li><a href="./AgregarVisitaC">Agregar Visita</a></li>
    </ul></li>

<li><a href="#">Pagos</a>
    <ul>
        <li><a href="/AgregarPago.jsp">Ingreso Pago</a></li>
        <li><a href="/ListadoPagos">Informe Pagos</a></li>
        <li><a href="/ListarAtrasos.jsp">Pagos Atrasados</a></li>
    </ul></li>
    <li><a href="/Global">Informe Global</a>
       </li>
        
</ul>
    </nav>
</header>
<div id="header_img">
    
    <img src="./img/img_header_admin.png" title="Segurimax - Inicio" style="width: 100%;">
</div>



<div id="titulo">
    <h1 style="margin-top: 8%;">Securimax - Plataforma Administrador</h1>
    <br>
    <h3 style="margin-bottom: 3%;">Por favor, escoja la opci�n a la que desea acceder</h3>
</div>
<div class="contenedor_img_box col-s-12 col-l-12 col-12" style="margin: 10% 0%;">

    <div class="img_box col-s-12 col-l-4 col-4">
        <table style="text-align: center; width: 100%; margin: 3% 0%;">
            <caption style="font-weight: bold; width: 100%;"><h2>Informes</h2></caption>
            <tr>
                <td><a href="/Global">Informe Global</a></td>
            </tr>
            <tr>
                <td><a href="/ListadoGlobal">Informe Cliente</a></td>
            </tr>
            <tr>
                <td><a href="ListarPagoC">Informe Pagos</a></td>
            </tr>
         </table>
    </div>

    <div class="img_box col-s-12 col-l-4 col-4">
        <table style="text-align: center; width: 100%; margin: 3% 0%;">
            <caption style="font-weight: bold; width: 100%;"><h2>Informaci�n de Clientes</h2></caption>
            <tr>
                <td><a href="AgregarClienteC">Ingresar nuevo Cliente</a></td>
            </tr>
            <tr>
                <td><a href="EditarClienteV">Editar Cliente</a></td>
            </tr>
            <tr>
                <td><a href="EliminarClienteC">Borrar Cliente</a></td>
            </tr>
            <tr>
                <td><a href="ListarClienteC">Listado de Clientes</a></td>
            </tr>
         </table>
    </div>

    <div class="img_box col-s-12 col-l-4 col-4">
        <table style="text-align: center; width: 100%; margin: 3% 0%;">
            <caption style="font-weight: bold; width: 100%;"><h2>Informaci�n Profesionales</h2></caption>
            <tr>
                <td><a href="AgregarEmpleadoC">Ingresar nuevo Profesional</a></td>
            </tr>
            <tr>
                <td><a href="EditarEmpleadoV">Editar Profesional</a></td>
            </tr>
            <tr>
                <td><a href="EliminarEmpleadoC">Borrar Profesional</a></td>
            </tr>
            <tr>
                <td><a href="ListarEmpleadoC">Listado de Profesionales</a></td>
            </tr>
         </table>
    </div>
  
    </div>
    <div class="contenedor_img_box col-s-12 col-l-12 col-12" style="margin: 10% 0%;">

        <div class="img_box col-s-12 col-l-4 col-4">
            <table style="text-align: center; width: 100%; margin: 3% 0%;">
                <caption style="font-weight: bold; width: 100%;"><h2>Pagos</h2></caption>
                <tr>
                    <td><a href="AgregarPagoC">Ingresar nuevo Pago</a></td>
                </tr>
             </table>
        </div>
    
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
<footer>
    <p>Dise�o - Talentosos Desarrolladores Jr - 2020</p>
</footer>
</body>
</html>