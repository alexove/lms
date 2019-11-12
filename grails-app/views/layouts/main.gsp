<!doctype html>
<html lang="es">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" />
    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>

<body>
    <div class="wrapper ">
    <div class="sidebar" data-color="blue">
      <!--
        Tip 1: You can change the color of the sidebar using: data-color="blue | green | orange | red | yellow"
    -->
      <div class="logo">
        <a href="/" class="simple-text logo-mini">
          LMS
        </a>
        <a href="/" class="simple-text logo-normal">
          Capacitación
        </a>
      </div>
      <div class="sidebar-wrapper" id="sidebar-wrapper">
        <ul class="nav">
          <li>
            <a href="/">
              <i class="now-ui-icons design_app"></i>
              <p>Tablero</p>
            </a>
          </li>
          <li>
            <a href="${createLink(controller:'course',action:'index')}">
              <i class="now-ui-icons ui-1_zoom-bold"></i>
              <p>Explorar cursos</p>
            </a>
          </li>
          <li>
            <a href="./map.html">
              <i class="now-ui-icons education_paper"></i>
              <p>Mis cursos</p>
            </a>
          </li>
          <li>
            <a href="./notifications.html">
              <i class="now-ui-icons ui-2_chat-round"></i>
              <p>Mensajes</p>
            </a>
          </li>
        </ul>
      </div>
    </div>
    <div class="main-panel" id="main-panel">
      <!-- Navbar -->
      <nav class="navbar navbar-expand-lg navbar-transparent  bg-primary  navbar-absolute">
        <div class="container-fluid">
          <div class="navbar-wrapper">
            <div class="navbar-toggle">
              <button type="button" class="navbar-toggler">
                <span class="navbar-toggler-bar bar1"></span>
                <span class="navbar-toggler-bar bar2"></span>
                <span class="navbar-toggler-bar bar3"></span>
              </button>
            </div>
          </div>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-bar navbar-kebab"></span>
            <span class="navbar-toggler-bar navbar-kebab"></span>
            <span class="navbar-toggler-bar navbar-kebab"></span>
          </button>
          <div class="collapse navbar-collapse justify-content-end" id="navigation">
            <ul class="navbar-nav">
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <i class="now-ui-icons users_single-02"></i>
                  <p>
                    <span class="d-lg-none d-md-block">Mi cuenta</span>
                  </p>
                </a>
                <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                  <a class="dropdown-item" href="#">Modificar cuenta</a>
                  <a class="dropdown-item" href="#">Perfil publico</a>
                  <a class="dropdown-item" href="#">Salir</a>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </nav>
      <!-- End Navbar -->
      <div class="panel-header panel-header-sm">
      </div>
      <div class="content">
          <g:layoutBody/>
      </div>
      <footer class="footer">
        <div class="container-fluid">
          <nav>
            <ul>
              <li>
                <a href="https://www.andean.tech">
                  Andean Technologies SAC
                </a>
              </li>
              <li>
                <a href="https://www.alexove.me">
                  Ing. Alex Irmel Oviedo Solis
                </a>
              </li>
            </ul>
          </nav>
          <div class="copyright" id="copyright">
            &copy;
            <script>
              document.getElementById('copyright').appendChild(document.createTextNode(new Date().getFullYear()))
            </script>, Desarrollado por
            <a href="https://www.andean.tech" target="_blank">Andean Technologies SAC</a>.
          </div>
        </div>
      </footer>
    </div>
  </div>
<asset:javascript src="application.js"/>

</body>
</html>
