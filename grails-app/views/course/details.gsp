<!DOCTYPE html>
<html lang="es">
    <head>
        <meta name="layout" content="main">
        <title>${course?.name}</title>
    </head>
    <body>
        <div class="row">
            <div class="col-lg-8">
                <div class="card">
                    <div class="card-header">
                        <h5 class="title">Contenido</h5>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table">
                                <thead class=" text-primary">
                                    <th>Titulo</th>
                                    <th>Resumen</th>
                                    <th>Acciones</th>
                                </thead>
                                <tbody>
                                    <g:each var="topic" in="${course?.topics.sort{ it.topicOrder }}">
                                        <tr>
                                            <td>
                                                ${topic?.name}
                                            </td>
                                            <td>
                                                ${topic?.summary}
                                            </td>
                                            <td class="text-right">
                                                <a href="${createLink(controller:'topic',action:'details',id:topic.id)}" class="btn btn-primary"><i class="now-ui-icons arrows-1_minimal-right"></i></a>
                                            </td>
                                        </tr>
                                    </g:each>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-4">
                <div class="card card-user">
                    <div class="image">
                        <img src="${course?.banner}" alt="...">
                    </div>
                    <div class="card-body">
                        <div class="author">
                            <a href="#">
                                <img class="avatar border-gray" src="${course?.banner}" alt="...">
                                <h5 class="title">${course?.name}</h5>
                            </a>
                            <p class="description" style="color: black;">
                            ${course?.summary}
                            </p>
                            <p class="description" style="color: black;">
                            ${course?.teacher?.fullname}
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
