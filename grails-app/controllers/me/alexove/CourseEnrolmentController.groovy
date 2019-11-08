package me.alexove

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class CourseEnrolmentController {

    CourseEnrolmentService courseEnrolmentService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond courseEnrolmentService.list(params), model:[courseEnrolmentCount: courseEnrolmentService.count()]
    }

    def show(Long id) {
        respond courseEnrolmentService.get(id)
    }

    def create() {
        respond new CourseEnrolment(params)
    }

    def save(CourseEnrolment courseEnrolment) {
        if (courseEnrolment == null) {
            notFound()
            return
        }

        try {
            courseEnrolmentService.save(courseEnrolment)
        } catch (ValidationException e) {
            respond courseEnrolment.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'courseEnrolment.label', default: 'CourseEnrolment'), courseEnrolment.id])
                redirect courseEnrolment
            }
            '*' { respond courseEnrolment, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond courseEnrolmentService.get(id)
    }

    def update(CourseEnrolment courseEnrolment) {
        if (courseEnrolment == null) {
            notFound()
            return
        }

        try {
            courseEnrolmentService.save(courseEnrolment)
        } catch (ValidationException e) {
            respond courseEnrolment.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'courseEnrolment.label', default: 'CourseEnrolment'), courseEnrolment.id])
                redirect courseEnrolment
            }
            '*'{ respond courseEnrolment, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        courseEnrolmentService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'courseEnrolment.label', default: 'CourseEnrolment'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'courseEnrolment.label', default: 'CourseEnrolment'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
