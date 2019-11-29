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
            <div class="col-md-3 col-xs-12">
                <div class="card">
                    <img src="...." class="card-img-top">
                    <div class="card-body">
                        <h5 class="card-title">${course?.name}</h5>
                        <p>${course.summary}</p>
                    </div>
                    <div class="card-footer text-right">
                        <a class="btn btn-primary text-right" href="${createLink(controller:'course',action:'details',id:course.id)}"><g:message code='course.see_details.label' /> <i class="fas fa-arrow"></i></a>
                    </div>
                </div>
            </div>
            </g:each>
        </div>
        <!-- -->
    </body>
</html>
