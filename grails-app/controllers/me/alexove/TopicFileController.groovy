package me.alexove

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class TopicFileController {

    TopicFileService topicFileService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond topicFileService.list(params), model:[topicFileCount: topicFileService.count()]
    }

    def show(Long id) {
        respond topicFileService.get(id)
    }

    def create() {
        respond new TopicFile(params)
    }

    def save(TopicFile topicFile) {
        if (topicFile == null) {
            notFound()
            return
        }

        try {
            topicFileService.save(topicFile)
        } catch (ValidationException e) {
            respond topicFile.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'topicFile.label', default: 'TopicFile'), topicFile.id])
                redirect topicFile
            }
            '*' { respond topicFile, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond topicFileService.get(id)
    }

    def update(TopicFile topicFile) {
        if (topicFile == null) {
            notFound()
            return
        }

        try {
            topicFileService.save(topicFile)
        } catch (ValidationException e) {
            respond topicFile.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'topicFile.label', default: 'TopicFile'), topicFile.id])
                redirect topicFile
            }
            '*'{ respond topicFile, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        topicFileService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'topicFile.label', default: 'TopicFile'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'topicFile.label', default: 'TopicFile'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
