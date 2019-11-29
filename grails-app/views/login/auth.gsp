<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8" />
        <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
        <link rel="icon" type="image/png" href="../assets/img/favicon.png">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <title><g:message code="login.label" /></title>
        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
        <asset:stylesheet href="application.css" />
    </head>
    <body class="bg-gradient-primary">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-xl-10 col-lg-12 col-md-9">
                    <div class="card o-hidden border-0 shadow-lg my-5">
                        <div class="card-body p-0">
                            <div class="row">
                                <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
                                <div class="col-lg-6">
                                    <div class="p-5">
                                        <div class="text-center">
                                            <h1 class="h4 text-gray-900 mb-4"><g:message code="login.label" /></h1>
                                        </div>
                                        <form class="user" method="post" action="${createLink(controller:'login',action:'authenticate')}">
                                            <div class="form-group">
                                                <input type="text" class="form-control form-control-user" name="username" aria-describedby="emailHelp" placeholder="${message(code:'username.label')}">
                                            </div>
                                            <div class="form-group">
                                                <input type="password" class="form-control form-control-user" name="password" placeholder="${message(code:'password.label')}">
                                            </div>
                                            <div class="form-group">
                                                <div class="custom-control custom-checkbox small">
                                                    <input type="checkbox" class="custom-control-input" id="customCheck">
                                                    <label class="custom-control-label" for="customCheck"><g:message code="remember_me.label" /></label>
                                                </div>
                                            </div>
                                            <button class="btn btn-primary btn-user btn-block" type="submit" name="button">
                                                <g:message code="login.btn.label" />
                                            </button>
                                            <!-- <hr>
                                            <a href="index.html" class="btn btn-google btn-user btn-block">
                                                <i class="fab fa-google fa-fw"></i> Login with Google
                                            </a>
                                            <a href="index.html" class="btn btn-facebook btn-user btn-block">
                                                <i class="fab fa-facebook-f fa-fw"></i> Login with Facebook
                                            </a> -->
                                        </form>
                                        <hr>
                                        <div class="text-center">
                                            <a class="small" href="forgot-password.html"><g:message code="password.forget.label" /></a>
                                        </div>
                                        <div class="text-center">
                                            <a class="small" href="register.html">¡<g:message code="account.create.label" />!</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <asset:javascript src="application.js" />
    </body>
</html>
