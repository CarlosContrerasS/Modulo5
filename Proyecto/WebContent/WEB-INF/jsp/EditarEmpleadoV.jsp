    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <h1>Editar Profesional</h1>
            <h3 style="margin-bottom: 3%;">Por favor, ingrese el RUT sin puntos y guion</h3>
        </div>
          <form method="get" action="editEmpleadoC" style="margin-bottom: 3%;">
              Busqueda Cliente por Rut: <input type="search" name="RutEmpleado" placeholder="Coloque el RUT sin puntos ni guion.">
          
              <input type="submit" value="Buscar">
            </form>
            <div class="formulario">
            
         
                <form method="post" action="editsaveEmpleadoC" >
                   
                    <label for="nombre">Nombre </label><br/>
                    <input type="text" class="campo_formulario" name="NombreEmpleado" value="${ListaE.getNombreEmpleado()}"/><br/>
                    <label for="rubro">Especialidad </label><br/>
                    <input type="text" class="campo_formulario" name="Especialidad" value="${ListaE.getEspecialidad()}"/><br/>
                    <input type="hidden" name="RutEmpleado" value="${ListaE.getRutEmpleado()}" />
                    <input type="submit" value="Agregar Empleado"  />
                    
                </form>
              
        </div>
        <footer>
            <p>Diseño - Talentosos Desarrolladores Jr - 2020</p>
        </footer>
    </body>

</html>