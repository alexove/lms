<%@ page import="me.alexove.Topic" %>
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
                        <a href="#">${topic?.chapter?.course?.name}</a>
                    </div>
                    <div class="card-body">
                        <div class="embed-responsive embed-responsive-16by9">
                            <iframe class="embed-responsive-item" src="https://www.youtube.com/embed/${topic?.videoURL}" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                        </div>
                        <hr>
                        <p>${topic.content}</p>
                    </div>
                    <div class="card-footer text-center">
                      <%
                      def prev=Topic.findByChapterAndTopicOrder(topic.chapter,topic.topicOrder-1)
                      def next=Topic.findByChapterAndTopicOrder(topic.chapter,topic.topicOrder+1)
                      %>
                      <g:if test="${prev}">
                      <a href="${createLink(controller:'topic',action:'details',id:prev.id)}" class="btn btn-primary"><i class="now-ui-icons arrows-1_minimal-left"></i> ${prev?.name}</a>
                      </g:if>
                      <a href="${createLink(controller:'course',action:'details',id:topic.chapter.course.id)}" class="btn btn-primary"><i class="now-ui-icons design_bullet-list-67"></i> Indice</a>
                      <g:if test="${next}">
                      <a href="${createLink(controller:'topic',action:'details',id:next.id)}" class="btn btn-primary">${next?.name} <i class="now-ui-icons arrows-1_minimal-right"></i></a>
                      </g:if>
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
                        <g:if test="${topic?.files}">
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
                        </g:if>
                        <g:else>
                          No hay archivos
                        </g:else>
                    </div>
                </div>
                <div class="card">
                  <div class="card-header">
                    <h6>Docente</h6>
                  </div>
                </div>
            </div>
        </div>
    </body>
</html>
