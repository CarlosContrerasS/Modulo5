    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/stylesheet.css"/>
    <link rel="stylesheet" href="./css/menu.css"/>
    <link rel="stylesheet" href="./css/fontello.css.css"/>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
<body style="background-image: url(./img/fondo.svg); background-position: center center; margin: 0%;">
    <header>
        <input type="checkbox" id="btn-menu" />
<label for="btn-menu"><i class="fa fa-bars"></i></label>
 <nav class="menu" style="z-index: 4;">
        <ul>
            <li><a href="./index.jsp">Inicio</a></li>
            <li class="submenu"><a href="#">Clientes <i class="fa fa-caret-down"></i></a>
              <ul>
                <li><a href="AgregarClienteC">Crear Cliente</a></li>
                <li><a href="EditarClienteV">Editar Cliente</a></li>
                <li><a href="EliminarClienteC">Borrar Cliente</a></li>
                <li><a href="ListarClienteC">Listado de Clientes</a></li>
              </ul>
            </li>
            <li class="submenu"><a href="#">Profesionales<i class="fa fa-caret-down"></i></a>
              <ul>
                  <li><a href="AgregarEmpleadoC">Ingresar Profesional</a></li>
                <li><a href="EditarEmpleadoV">Editar Profesional</a></li>
                <li><a href="EliminarEmpleadoC">Borrar Profesional</a></li>
                <li><a href="ListarEmpleadoC">Listado de Profesionales</a></li>
                <li><a href="AgregarVisitaC">Agendar Visita</a></li>
                <li><a href="ListarVisitaC">Vistas Agendas</a></li>
              </ul>
              
              
            </li>
            <li><a href="#">Accidentes</a>
                <ul>
                    <li><a href="AgregarAccidenteC">Ingreso Accidente</a></li>
                    <li><a href="ListarAccidenteC">Listado Accidentes</a></li>
                </ul></li>
                 <li><a href="#">Visitas</a>
                <ul>
                    <li><a href="AgregarVisitaC">Agregar Visita</a></li>
                    <li><a href="ListarVisitaC">Listar Visitas</a></li>
                </ul></li>
            
            <li><a href="#">Pagos</a>
                <ul>
                    <li><a href="AgregarPagoC">Ingreso Pago</a></li>
                    <li><a href="ListarPagoC">Informe Pagos</a></li>
                    <li><a href="ListarAtrasosC">Pagos Atrasados</a></li>
                </ul></li>
                
                <li><a href="#">Asesorias</a>
                <ul>
                    <li><a href="AgregarAsesoriaC">Ingreso Asesoria</a></li>
                    <li><a href="ListarAsesoriaC">Listado de Asesorias</a></li>
                </ul></li>
                <li><a href="ListarGlobalC">Informe Global</a></li>
                <li><a href="ListarActividadesC">Reporte de Actividades</a></li>
                    
            </ul>
        </nav>
</header>
<div id="header_img">  
    <img src="./img/img_header_profesional.png" title="Segurimax - Inicio" style="width: 100%;">
</div>
<h1 id="titulo">Agregar Visita</h1>
<c:if test="${ccmensaje != null}">
	<h3><c:out value="${ccmensaje}"></c:out></h3>
</c:if>
 <div class="formulario">
 
<form method="post" action="AgregarVisitaC">
	Rut Cliente: <input type="text"  class="campo_formulario"  name="Rut_Id" /><br/><br/>
	Rut Empleado: <input type="text" class="campo_formulario"   name="Empleado_RutEmpleado" /><br/><br/>
	Direccion: <input type="text" class="campo_formulario" name="Direccion" /><br/><br/>
	Ciudad: <input type="text" class="campo_formulario" name="Ciudad" /><br/><br/>
	fecha: <input type="text" class="campo_formulario"  name="Fecha" /><br/><br/>
	Resumen: <input type="text" class="campo_formulario"  name="Resumen" /><br/><br/>
	Observaciones: <input type="text" class="campo_formulario" name="Observaciones" /><br/><br/>
	<input type="submit" value="Ingresar" />
</form>
</div>
<footer>
            <p>Diseño - Talentosos Desarrolladores Jr - 2020</p>
        </footer>
</body>
</html>