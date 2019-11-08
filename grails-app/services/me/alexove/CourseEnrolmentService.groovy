package me.alexove

import grails.gorm.services.Service

@Service(CourseEnrolment)
interface CourseEnrolmentService {

    CourseEnrolment get(Serializable id)

    List<CourseEnrolment> list(Map args)

    Long count()

    void delete(Serializable id)

    CourseEnrolment save(CourseEnrolment courseEnrolment)

}