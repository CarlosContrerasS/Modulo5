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
            <li><a href="AccesoClienteC"> Acceso a Clientes</a>
            <li><a href="AccesoProfesionalC"> Acceso a Profesionales</a>
             <li><a href="AccesoAdministradorC"> Acceso a Administrador</a> 
              
            </ul>
        </nav>
</header>
<div id="header_img">  
    <img src="./img/img_header_profesional.png" title="Segurimax - Inicio" style="width: 100%;">
</div>
<h1 id="titulo">Agregar Mejoras</h1>
<c:if test="${ccmensaje != null}">
	<h3><c:out value="${ccmensaje}"></c:out></h3>
</c:if>
 <div class="formulario">
 
<form method="post" action="AgregarMejorasP">
			
			<label for="fecha">Fecha </label><br /> 
			<input type="text" class="campo_formulario" name="fecha" /><br /> 
			<label for="motivo">Motivo </label><br /> 
			<input type="text" class="campo_formulario" name="motivo" /><br /> 
			<label for="actividades">Actividades</label><br /> 
			<input type="text" class="campo_formulario" name="actividades" /><br /> 
			<label for="estado">Estado</label><br /> 
			<input type="text" class="campo_formulario" name="estado" /><br /> 
			<label for="Rut_ID">Rut del cliente</label><br /> 
			<input type="number" class="campo_formulario" name="Rut_ID" /><br /> 
			<input type="submit" value="Agregar" />
		</form>
</div>
<footer>
            <p>Diseño - Talentosos Desarrolladores Jr - 2020</p>
        </footer>
</body>
</html>