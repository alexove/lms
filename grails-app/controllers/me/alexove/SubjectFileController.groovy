package me.alexove

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class SubjectFileController {

    SubjectFileService subjectFileService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond subjectFileService.list(params), model:[subjectFileCount: subjectFileService.count()]
    }

    def show(Long id) {
        respond subjectFileService.get(id)
    }

    def create() {
        respond new SubjectFile(params)
    }

    def save(SubjectFile subjectFile) {
        if (subjectFile == null) {
            notFound()
            return
        }

        try {
            subjectFileService.save(subjectFile)
        } catch (ValidationException e) {
            respond subjectFile.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'subjectFile.label', default: 'SubjectFile'), subjectFile.id])
                redirect subjectFile
            }
            '*' { respond subjectFile, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond subjectFileService.get(id)
    }

    def update(SubjectFile subjectFile) {
        if (subjectFile == null) {
            notFound()
            return
        }

        try {
            subjectFileService.save(subjectFile)
        } catch (ValidationException e) {
            respond subjectFile.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'subjectFile.label', default: 'SubjectFile'), subjectFile.id])
                redirect subjectFile
            }
            '*'{ respond subjectFile, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        subjectFileService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'subjectFile.label', default: 'SubjectFile'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'subjectFile.label', default: 'SubjectFile'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
