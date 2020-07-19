<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
	<html lang="es">
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
	<body style="background-image: url(./img/fondo.svg); background-position: center center;">
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
        
        <img src="./img/img_header.png" title="Segurimax - Inicio" style="width: 100%;">
    </div>
            <div id="titulo">
            <h1>Reporte Global</h1>
            <h3 style="margin-bottom: 3%;">Informe del total de clientes</h3>
        </div>
        <div id="tasa_accidentes" style="text-align: center; margin-bottom: 3%;">
            La tasa de accidentabilidad del total de clientes es de:  <a style="font-size: 40px; color: #FA892C;">
            
            <c:forEach items="${listaAccidentabilidad}" var="accidentabilidad">
	<tr>
		<td>${accidentabilidad.getAccidentabilidad()}</td>
	</tr>
	</c:forEach></a>
        </div>
        <div class="tabla">
        
         <h3 id="titulo">Listado total de clientes</h3>
         
            <table id="example" class="row-border" style="width:50%">
            
              <thead>
                       
	<tr>
		<th>Rut Cliente</th>
		<th>Nombre Cliente</th>
		<th>Fecha de Visita</th>
		<th>ID Visita</th>
		<th>Fecha de Capacitacion</th>
		<th>Numero de Asistentes</th>
		<th>Fecha de Asesorias</th>
		<th>Gestion</th>
		<th>IDPago</th>		
		<th>Fecha de Pago</th>
		<th>Monto Regular</th>
		<th>Monto Adicional</th>
		<th>Accidentabilidad</th>

		<th>Suceso</th>
	</tr>
	</thead>
	<c:forEach items="${listaGlobal}" var="reporteglobal">
	<tr>
		<td>${rglo.getRut()}</td>
		<td>${rglo.getNombre()}</td>
		<td>${rglo.getIDPag()}</td>
		<td>${rglo.getFechaVisita()}</td>
		<td>${rglo.getIDVisita()}</td>
		<td>${rglo.getFechaCapacitacion()}</td>
		<td>${rglo.getNumAsistentes()}</td>
		<td>${rglo.getFechaAseosrias()}</td>
		<td>${rglo.getIDPago()}</td>
		<td>${rglo.getFechaPago()}</td>
		<td>${rglo.getMontoRegular()}</td>
		<td>${rglo.getMontoAdicional()}</td>
		<td>${rglo.getAccidentabilidad()}</td>
	</tr>
	</c:forEach>
</table>
 </div>
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
                $(document).ready(function() {
                    $('#example2').DataTable();
                } );
            
                $('#example2').DataTable( {
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