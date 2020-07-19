<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
            <h1>Editar Cliente</h1>
            <h3 style="margin-bottom: 3%;">Por favor, ingrese el RUT sin puntos y guion</h3>
        </div>
          <form method="get" action="editClienteC" style="margin-bottom: 3%;">
              Busqueda Cliente por Rut: <input type="search" name="Rut" placeholder="Coloque el RUT sin puntos ni guion.">
              
          
              <input type="submit" value="Buscar">
            </form>
            <div class="formulario" >
                <form method="post" action="editsaveClienteC">
                
                	<label for="rut">Rut </label><br/>
                    <input type="text" class="campo_formulario" name="Rut" value="${listaCliente.getRut()}"/><br/>
                    
                    <label for="nombre">Nombre </label><br/>
                    <input type="text" class="campo_formulario" name="Nombre" value="${listaCliente.getNombre()}"/><br/>
                    <label for="telefono">Telefono </label><br/>
                    <input type="tel" class="campo_formulario" name="Telefono" value="${listaCliente.getTelefono()}" /><br/>
                    <label for="mail">Mail </label><br/>
                    <input type="email" class="campo_formulario" name="Mail" value="${listaCliente.getMail()}"/><br/>
                    <label for="rubro">Rubro </label><br/>
                    <input type="text" class="campo_formulario" name="Rubro" value="${listaCliente.getRubro()}"/><br/>
                      <label for="direccion">Direccion </label><br/>
                    <input type="text" class="campo_formulario" name="Direccion" value="${listaCliente.getDireccion()}"/><br/>
                     <input type="hidden" name="Rut" value="${ListaCliente.getRut()}" />
                    <input type="submit" value="Agregar cliente" />
                </form>
                
        </div>
        <footer>
            <p>Diseño - Talentosos Desarrolladores Jr - 2020</p>
        </footer>
    </body>

</html>