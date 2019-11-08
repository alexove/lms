package me.alexove

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class SubjectFileServiceSpec extends Specification {

    SubjectFileService subjectFileService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new SubjectFile(...).save(flush: true, failOnError: true)
        //new SubjectFile(...).save(flush: true, failOnError: true)
        //SubjectFile subjectFile = new SubjectFile(...).save(flush: true, failOnError: true)
        //new SubjectFile(...).save(flush: true, failOnError: true)
        //new SubjectFile(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //subjectFile.id
    }

    void "test get"() {
        setupData()

        expect:
        subjectFileService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<SubjectFile> subjectFileList = subjectFileService.list(max: 2, offset: 2)

        then:
        subjectFileList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        subjectFileService.count() == 5
    }

    void "test delete"() {
        Long subjectFileId = setupData()

        expect:
        subjectFileService.count() == 5

        when:
        subjectFileService.delete(subjectFileId)
        sessionFactory.currentSession.flush()

        then:
        subjectFileService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        SubjectFile subjectFile = new SubjectFile()
        subjectFileService.save(subjectFile)

        then:
        subjectFile.id != null
    }
}
