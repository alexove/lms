package me.alexove

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured

class StartController {
    CourseService courseService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    @Secured(['ROLE_TEACHER','ROLE_ADMIN'])
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond courseService.list(params), model:[courseCount: courseService.count()]
    }
}
