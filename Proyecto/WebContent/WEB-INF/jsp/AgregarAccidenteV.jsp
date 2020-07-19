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
        
        <img src="./img/img_header_admin.png" title="Segurimax - Inicio" style="width: 100%;">
    </div>
<h1 id ="titulo">Agregar accidente</h1>
<c:if test="${camensaje != null}">
	<h3><c:out value="${camensaje}"></c:out></h3>
</c:if>
<div class="formulario">
<form method="post" action="AgregarAccidenteC">
	
	Fecha: <input type="text"  class="campo_formulario" name="Fecha" /><br/>
	Hora: <input type="text"  class="campo_formulario" name="Hora" /><br/>
	Suceso: <input type="text"  class="campo_formulario" name="Suceso" /><br/>
	Lugar: <input type="text"  class="campo_formulario"  name="Lugar" /><br/>
	Rut: <input type="text"  class="campo_formulario"  name="Rut_Id" /><br/>
	Dias perdidos: <input type="text"   class="campo_formulario" name="Dias_Perdidos" /><br/>
	Numero trabajadores: <input type="text"  class="campo_formulario" name="Num_Trab" /><br/>
	<input type="submit" value="Agregar accidente" />
</form>
</div>

  <footer>
            <p>Diseño - Talentosos Desarrolladores Jr - 2020</p>
        </footer>
</body>
</html>