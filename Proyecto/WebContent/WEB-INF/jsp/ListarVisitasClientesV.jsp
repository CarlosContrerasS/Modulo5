<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" href="./css/stylesheet.css"/>
		<link rel="stylesheet" href="./css/menu.css"/>
		<link rel="stylesheet" href="./css/tabla.css"/>
		<link rel="stylesheet" href="./css/tablecss.css"/>
		<link rel="stylesheet" href="./css/fontello.css"/>
		<link rel="stylesheet" href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css"/>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500&display=swap" rel="stylesheet">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
		<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.css">
		<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.js"></script>
		<script src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script> 
		
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
            <li><a href="AccesoClienteC"> Acceso a Clientes</a>
            <li><a href="AccesoProfesionalC"> Acceso a Profesionales</a>
             <li><a href="AccesoAdministradorC"> Acceso a Administrador</a> 
              
            </ul>
        </nav>
    </header>
    <div id="header_img">  
        <img src="./img/img_header_profesional.png" title="Segurimax - Inicio" style="width: 100%;">
    </div>


<h1 id="titulo"><a href="./img/schedule.svg" style="width: 50%;">Mostrar Visita Agendada</a></h1>
<br><br><br><br>
<table id="example" class="row-border" style="width:50%">
	<tr>
		<th>Direccion</th>
		<th>Ciudad</th>
		<th>Fecha</th>
		<th>Resumen</th>
		<th>Observaciones</th>
		<th>Rut Cliente</th>
		<th>Rut Empleado</th>
		
	</tr>
	<c:forEach items="${listavis}" var="visitas">
	<tr>
		<td>${visitas.getDireccion()}</td>
		<td>${visitas.getCiudad()}</td>
		<td>${visitas.getFecha()}</td>
		<td>${visitas.getResumen()}</td>
		<td>${visitas.getObservaciones()}</td>
		<td>${visitas.getRut_Id()}</td>
		<td>${visitas.getEmpleado_RutEmpleado()}</td>
		
	</tr>
	</c:forEach>
</table>
<br/>
<a href="AgregarVisitaC">Agregar Visita</a>

<footer>
	<p>Dise�o - Talentosos Desarrolladores Jr - 2020</p>
</footer> 
<script>
	$(document).ready(function() {
		$('#example').DataTable();
	} );

	$('#example').DataTable( {
		language: {
			processing:     "Procesando...",
			search:         "Buscar:",
			lengthMenu:    "Mostrar _MENU_ registros",
			info:           "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
			infoEmpty:      "Mostrando registros del 0 al 0 de un total de 0 registros",
			infoFiltered:   "(filtrado de un total de _MAX_ registros)",
			infoPostFix:    "",
			loadingRecords: "Cargando...",
			zeroRecords:    "No se encontraron resultados",
			emptyTable:     "Ningun dato disponible en esta tabla",
			paginate: {
				first:      "Primero",
				previous:   "Anterior",
				next:       "Siguiente",
				last:       "ultimo"
			},
			aria: {
				sortAscending:  ": Activar para ordenar la columna de manera ascendente",
				sortDescending: ": Activar para ordenar la columna de manera descendente"
			}
		}
	} );
</script>

</body>
</html>