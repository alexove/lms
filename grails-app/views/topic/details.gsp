<!DOCTYPE html>
<html lang="es">
    <head>
        <meta name="layout" content="main">
        <title>${topic.name}</title>
    </head>
    <body>
        <div class="row">
            <div class="col-lg-8">
                <div class="card">
                    <div class="card-header">
                        <h2>${topic.name}</h2>
                    </div>
                    <div class="card-body">
                        <div class="embed-responsive embed-responsive-16by9">
                            <iframe class="embed-responsive-item" src="https://www.youtube.com/embed/${topic?.videoURL}" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                        </div>
                        <hr>
                        <p>${topic.content}</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-4">
                <div class="card">
                    <div class="card-header">
                    </div>
                    <div class="card-body">
                        <h6>Resumen</h6>
                        ${topic?.summary}
                        <h6>Archivos</h6>

                        <table>
                            <thead>
                                <th>Titulo</th>
                                <th></th>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Nombre del archivo</td>
                                    <td><a href="#" class="btn btn-primary btn-md">G</a></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
