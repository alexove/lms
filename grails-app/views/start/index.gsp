<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="/docs/4.0/assets/img/favicons/favicon.ico">
        <title>Inicio</title>
        <asset:stylesheet href="application.css" />
        <link href="album.css" rel="stylesheet">
    </head>
    <body>
        <header>
            <div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom box-shadow">
                <h5 class="my-0 mr-md-auto font-weight-normal">Company name</h5>
                <nav class="my-2 my-md-0 mr-md-3">
                    <a class="p-2 text-dark" href="#">Features</a>
                    <a class="p-2 text-dark" href="#">Enterprise</a>
                    <a class="p-2 text-dark" href="#">Support</a>
                    <a class="p-2 text-dark" href="#">Pricing</a>
                </nav>
                <a class="btn btn-outline-primary" href="#">Sign up</a>
            </div>
        </header>

    <main role="main">

      <section class="jumbotron text-center">
        <div class="container">
          <h1 class="jumbotron-heading">Album example</h1>
          <p class="lead text-muted">Something short and leading about the collection below—its contents, the creator, etc. Make it short and sweet, but not too short so folks don't simply skip over it entirely.</p>
          <p>
            <a href="#" class="btn btn-primary my-2">Main call to action</a>
            <a href="#" class="btn btn-secondary my-2">Secondary action</a>
          </p>
        </div>
      </section>

      <div class="album py-5 bg-light">
        <div class="container">
          <div class="row">
              <g:each var="course" in="${courseList}">
              <div class="col-md-4">
                  <div class="card mb-4 box-shadow">
                      <img class="card-img-top" data-src="holder.js/100px225?theme=thumb&bg=55595c&fg=eceeef&text=Thumbnail" alt="Card image cap">
                      <div class="card-header">
                          <h6>${course?.name}</h6>
                      </div>
                      <div class="card-body">
                          <p class="card-text">${course?.summary}</p>
                          <div class="d-flex justify-content-between align-items-center">
                              <div class="btn-group">
                                  <a href="${createLink(controller:'course',action:'details',id:course.id)}" class="btn btn-sm btn-outline-secondary"><g:message code="view.label"/></a>
                                  <a href="${createLink(controller:'course',action:'details',id:course.id)}" class="btn btn-sm btn-outline-secondary"><g:message code="enroll.label"/></a>
                              </div>
                              <small class="text-muted">¿COSTO?</small>
                          </div>
                      </div>
                  </div>
              </div>
              </g:each>

          </div>
        </div>
      </div>

    </main>

    <footer class="text-muted">
      <div class="container">
        <p class="float-right">
          <a href="#">Back to top</a>
        </p>
        <p>Album example is &copy; Bootstrap, but please download and customize it for yourself!</p>
        <p>New to Bootstrap? <a href="../../">Visit the homepage</a> or read our <a href="../../getting-started/">getting started guide</a>.</p>
      </div>
    </footer>

    <asset:javascript src="application.js" />
    <script src="../../assets/js/vendor/holder.min.js"></script>
  </body>
</html>
