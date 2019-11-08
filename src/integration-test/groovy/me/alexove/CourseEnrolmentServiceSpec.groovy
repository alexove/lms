package me.alexove

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class CourseEnrolmentServiceSpec extends Specification {

    CourseEnrolmentService courseEnrolmentService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new CourseEnrolment(...).save(flush: true, failOnError: true)
        //new CourseEnrolment(...).save(flush: true, failOnError: true)
        //CourseEnrolment courseEnrolment = new CourseEnrolment(...).save(flush: true, failOnError: true)
        //new CourseEnrolment(...).save(flush: true, failOnError: true)
        //new CourseEnrolment(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //courseEnrolment.id
    }

    void "test get"() {
        setupData()

        expect:
        courseEnrolmentService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<CourseEnrolment> courseEnrolmentList = courseEnrolmentService.list(max: 2, offset: 2)

        then:
        courseEnrolmentList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        courseEnrolmentService.count() == 5
    }

    void "test delete"() {
        Long courseEnrolmentId = setupData()

        expect:
        courseEnrolmentService.count() == 5

        when:
        courseEnrolmentService.delete(courseEnrolmentId)
        sessionFactory.currentSession.flush()

        then:
        courseEnrolmentService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        CourseEnrolment courseEnrolment = new CourseEnrolment()
        courseEnrolmentService.save(courseEnrolment)

        then:
        courseEnrolment.id != null
    }
}
