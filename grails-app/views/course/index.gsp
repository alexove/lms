<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'course.label', default: 'Course')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <!-- -->
        <div class="row">
            <g:each var="course" in="${courseList}" >
                <div class="col-lg-4">
                    <div class="card">
                        <div class="card-header">
                            <h4 class="card-title">${course?.name}</h4>
                        </div>
                        <div class="card-body">
                            ${course?.summary}
                        </div>
                        <div class="card-footer text-right">
                            <a href="${createLink(id:course.id,controller:'course',action:'details')}">
                                <i class="now-ui-icons arrows-1_minimal-right"></i> Ingresar
                            </a>
                        </div>
                    </div>
                </div>
            </g:each>
        </div>
        <!-- -->
    </body>
</html>
