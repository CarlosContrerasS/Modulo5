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
        
        <img src="./img/img_header.png" title="Segurimax - Inicio" style="width: 100%;">
    </div>
​
    <div id="titulo">
        <h1 style="margin-top: 8%;">Bienvenidos a Securimax</h1>
        <br>
        <h3 style="margin-bottom: 3%;">Por favor, escoja el perfil al que desea acceder</h3>
    </div>
​
​
            <div class="contenedor_img_box col-s-12 col-l-12 col-12">
​
                <div class="img_box col-s-12 col-l-4 col-4">
                    <a href="AccesoClienteC"><img src="./img/cliente.svg"></a> <br>
                    <h4><a href="AccesoClienteC">Clientes</a></h4><br>
                </div>
            
                <div class="img_box col-s-12 col-l-4 col-4">
                    <a href="AccesoProfesionalC"><img src="./img/profesional.svg"></a> <br>
                    <h4><a href="AccesoProfesionalC">Profesionales</a></h4><br>
                </div>
            
                <div class="img_box col-s-12 col-l-4 col-4">
                    <a href="AccesoAdministradorC"><img src="./img/administrador.svg"></a>
                    <h4><a href="AccesoAdministradorC">Administrador</a></h4><br>
                </div>
          
            </div>
            <div class="cont_aplicacion col-s-12 col-l-12 col-12">
                <div id="text_aplicacion" class="text_aplicacion">
                    <h2>Securimax, una aplicacion web para su empresa</h2>
                    <p>Es una solucion tecnologica que mejora la gestion, el control, la seguridad, y disponibilidad de informacion para la empresa y sus clientes.
                        Obtenga informe de los pagos realizados por sus clientes, administre las actividades de los profesionales de seguridad, asi como los informes de estos.
                        Tome las mejores decisiones e impulse el rendimiento de la empresa</p>
                </div>
            
            </div>
        <footer>
            <p>Diseño - Talentosos Desarrolladores Jr - 2020</p>
        </footer>
    </body>
</html>