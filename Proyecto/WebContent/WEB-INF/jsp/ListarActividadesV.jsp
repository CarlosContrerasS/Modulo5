<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<body>

<header>
		<input type="checkbox" id="btn-menu" />
<label for="btn-menu"><i class="fa fa-bars"></i></label>
<nav class="menu" style="z-index: 4;">
	<div id="logo"><a href="./index.jsp"><img src="./img/logo.png" title="Logo Segurimax"></a>
	</div>
<ul>
<li><a href="./index.jsp">Inicio</a></li>
<li class="submenu"><a href="#">Clientes <i class="fa fa-caret-down"></i></a>
  <ul>
	<li><a href="${pageContext.request.contextPath}/AgregarCliente">Crear Cliente</a></li>
	<li><a href="${pageContext.request.contextPath}/EditarCliente.jsp">Editar Cliente</a></li>
	<li><a href="${pageContext.request.contextPath}/EliminarCliente.jsp">Borrar Cliente</a></li>
	<li><a href="${pageContext.request.contextPath}/ListadoGlobal">Informe Cliente</a></li>
	<li><a href="${pageContext.request.contextPath}/ListadoClientes">Listado de Clientes</a></li>
  </ul>
</li>
<li class="submenu"><a href="#">Profesionales<i class="fa fa-caret-down"></i></a>
  <ul>
	  <li><a href="#">Crear Profesional</a></li>
	  <li><a href="${pageContext.request.contextPath}/AgregarEmpleado">Ingresar Profesional</a></li>
	<li><a href="${pageContext.request.contextPath}/EditarEmpleado.jsp">Editar Profesional</a></li>
	<li><a href="${pageContext.request.contextPath}/EliminarEmpleado.jsp">Borrar Profesional</a></li>
	<li><a href="${pageContext.request.contextPath}/ListadoEmpleados">Listado de Profesionales</a></li>
	<li><a href="${pageContext.request.contextPath}/AgregarVisita">Agendar Visita</a></li>
	<li><a href="${pageContext.request.contextPath}/ListarVisita">Vistas Agendas</a></li>
  </ul>
  
  
</li>
<li><a href="#">Accidentes</a>
	<ul>
		<li><a href="${pageContext.request.contextPath}/AgregarAccidenteV">Ingreso Accidente</a></li>
		<li><a href="${pageContext.request.contextPath}/ListarAccidentesV">Listado Accidentes</a></li>
	</ul></li>

<li><a href="#">Pagos</a>
	<ul>
		<li><a href="${pageContext.request.contextPath}/AgregarPago.jsp">Ingreso Pago</a></li>
		<li><a href="${pageContext.request.contextPath}/ListadoPagos">Informe Pagos</a></li>
		<li><a href="${pageContext.request.contextPath}/ListarAtrasos.jsp">Pagos Atrasados</a></li>
	</ul></li>
	<li><a href="${pageContext.request.contextPath}/Global">Informe Global</a>
	   </li>
		
</ul>
	</nav>
</header>

	<header>
		<input type="checkbox" id="btn-menu" />
<label for="btn-menu"><i class="fa fa-bars"></i></label>
<nav class="menu" style="z-index: 4;">
	<div id="logo"><a href="./index.jsp"><img src="./img/logo.png" title="Logo Segurimax"></a>
	</div>
<ul>
<li><a href="./index.jsp">Inicio</a></li>
<li class="submenu"><a href="#">Clientes <i class="fa fa-caret-down"></i></a>
  <ul>
	<li><a href="${pageContext.request.contextPath}/AgregarCliente">Crear Cliente</a></li>
	<li><a href="${pageContext.request.contextPath}/EditarCliente.jsp">Editar Cliente</a></li>
	<li><a href="${pageContext.request.contextPath}/EliminarCliente.jsp">Borrar Cliente</a></li>
	<li><a href="${pageContext.request.contextPath}/ListadoGlobal">Informe Cliente</a></li>
	<li><a href="${pageContext.request.contextPath}/ListadoClientes">Listado de Clientes</a></li>
  </ul>
</li>
<li class="submenu"><a href="#">Profesionales<i class="fa fa-caret-down"></i></a>
  <ul>
	  <li><a href="#">Crear Profesional</a></li>
	  <li><a href="${pageContext.request.contextPath}/AgregarEmpleado">Ingresar Profesional</a></li>
	<li><a href="${pageContext.request.contextPath}/EditarEmpleado.jsp">Editar Profesional</a></li>
	<li><a href="${pageContext.request.contextPath}/EliminarEmpleado.jsp">Borrar Profesional</a></li>
	<li><a href="${pageContext.request.contextPath}/ListadoEmpleados">Listado de Profesionales</a></li>
	<li><a href="${pageContext.request.contextPath}/AgregarVisita">Agendar Visita</a></li>
	<li><a href="${pageContext.request.contextPath}/ListarVisita">Vistas Agendas</a></li>
  </ul>
  
  
</li>
<li><a href="#">Accidentes</a>
	<ul>
		<li><a href="${pageContext.request.contextPath}/AgregarAccidenteV">Ingreso Accidente</a></li>
		<li><a href="${pageContext.request.contextPath}/ListarAccidentesV">Listado Accidentes</a></li>
	</ul></li>

<li><a href="#">Pagos</a>
	<ul>
		<li><a href="${pageContext.request.contextPath}/AgregarPago.jsp">Ingreso Pago</a></li>
		<li><a href="${pageContext.request.contextPath}/ListadoPagos">Informe Pagos</a></li>
		<li><a href="${pageContext.request.contextPath}/ListarAtrasos.jsp">Pagos Atrasados</a></li>
	</ul></li>
	<li><a href="${pageContext.request.contextPath}/Global">Informe Global</a>
	   </li>
		
</ul>
	</nav>
</header>

<br><br><br>
<h1 id="titulo">Listado de actividades</h1>
<c:if test="${ccmensaje != null}">
	<h3><c:out value="${ccmensaje}"></c:out></h3>
</c:if>

<table id="example" class="row-border" style="width:50%">
	<thead>
	<tr>
		<th>Rut</th>
		<th>Fecha Visita</th>
		<th>ID Visitas</th>
		<th>Fecha Capacitaciones</th>
		<th>Num Asistentes</th>
		<th>Fecha Asesorias</th>
		<th>Gestion</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${listaact}" var="actividades">
	<tr>
		<td>${actividades.getRut()}</td>
		<td>${actividades.getFechaVisita()}</td>
		<td>${actividades.getIDVisitas()}</td>
		<td>${actividades.getFechaCapacitacion()}</td>
		<td>${actividades.getNumAsistentes()}</td>
		<td>${actividades.getFechaAsesoria()}</td>
		<td>${actividades.getGestion()}</td>
	</tr>
	</c:forEach>
</tbody>
</table>
<footer>
	<p>Diseño - Talentosos Desarrolladores Jr - 2020</p>
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