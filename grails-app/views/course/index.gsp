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
        <a href="#list-course" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
        <div id="list-course" class="content scaffold-list" role="main">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${courseList}" order="name,summary,creationDate" />

            <div class="pagination">
                <g:paginate total="${courseCount ?: 0}" />
            </div>
        </div>
    </body>
</html>
