<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html lang="es">

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
            <div id="titulo">
            <h1>Creacion de Clientes</h1>
            <h3>Por favor, llene todos los campos del formulario</h3>
        </div>
            <div class="formulario">
                <form method="post" action="AgregarClienteC">
                    <label for="rut">RUT </label><br/>
                    <input type="number" class="campo_formulario" name="rut"/><br/>
                    <label for="nombre">Nombre </label><br/>
                    <input type="text" class="campo_formulario" name="nombre"/><br/>
                    <label for="telefono">Telefono </label><br/>
                    <input type="tel" class="campo_formulario" name="telefono" /><br/>
                    <label for="correo">Correo electronico </label><br/>
                    <input type="email" class="campo_formulario" name="mail" /><br/>
                    <label for="rubro">Rubro </label><br/>
                    <input type="text" class="campo_formulario" name="rubro" /><br/>
                    <label for="direccion">Direccion </label><br/>
                    <input type="text" class="campo_formulario" name="direccion" /><br/>
                    <input type="submit" value="Agregar cliente" />
                </form>
        </div>
        <footer>
            <p>Dise�o - Talentosos Desarrolladores Jr - 2020</p>
        </footer>
    </body>

</html>