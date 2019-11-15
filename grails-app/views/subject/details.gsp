<!DOCTYPE html>
<html lang="es">
    <head>
        <meta name="layout" content="main">
        <title>${subject.title}</title>
    </head>
    <body>
        <div class="row">
            <div class="col-lg-8">
                <div class="card">
                    <div class="card-header">
                        asdasdasd
                    </div>
                    <div class="card-body">
                        <table class="table">
                            <thead>
                                <th>Name</th>
                                    <th>Summary</th>
                                    <th>Action</th>
                            </thead>
                            <tbody>
                                <g:each var="topic" in="${subject?.topics}">
                                <tr>
                                    <td>${topic?.name}</td>
                                    <td>${topic?.summary}</td>
                                    <td>
                                        <a class="btn btn-primary" href="${createLink(controller:'topic',action:'details',id:topic.id)}"><i class="now-ui-icons arrows-1_minimal-right"></i></a>
                                    </td>
                                </tr>
                            </g:each>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>

        </div>
    </body>
</html>
