package me.alexove

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured

class ChapterController {

    ChapterService chapterService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    @Secured(['ROLE_ADMIN','ROLE_TEACHER','ROLE_STUDENT'])
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond chapterService.list(params), model:[chapterCount: chapterService.count()]
    }
    @Secured(['ROLE_ADMIN','ROLE_TEACHER','ROLE_STUDENT'])
    def details(Long id) {
        respond chapterService.get(id)
    }
    @Secured(['ROLE_ADMIN','ROLE_TEACHER'])
    def show(Long id) {
        respond chapterService.get(id)
    }

    @Secured(['ROLE_ADMIN','ROLE_TEACHER'])
    def create() {
        respond new Chapter(params)
    }

    @Secured(['ROLE_ADMIN','ROLE_TEACHER'])
    def save(Chapter chapter) {
        if (chapter == null) {
            notFound()
            return
        }

        try {
            chapterService.save(chapter)
        } catch (ValidationException e) {
            respond chapter.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'chapter.label', default: 'Chapter'), chapter.id])
                redirect chapter
            }
            '*' { respond chapter, [status: CREATED] }
        }
    }

    @Secured(['ROLE_ADMIN','ROLE_TEACHER'])
    def edit(Long id) {
        respond chapterService.get(id)
    }

    @Secured(['ROLE_ADMIN','ROLE_TEACHER'])
    def update(Chapter chapter) {
        if (chapter == null) {
            notFound()
            return
        }

        try {
            chapterService.save(chapter)
        } catch (ValidationException e) {
            respond chapter.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'chapter.label', default: 'Chapter'), chapter.id])
                redirect chapter
            }
            '*'{ respond chapter, [status: OK] }
        }
    }

    @Secured(['ROLE_ADMIN','ROLE_TEACHER'])
    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        chapterService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'chapter.label', default: 'Chapter'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'chapter.label', default: 'Chapter'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
