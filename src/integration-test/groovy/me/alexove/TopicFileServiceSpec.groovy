package me.alexove

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TopicFileServiceSpec extends Specification {

    TopicFileService topicFileService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TopicFile(...).save(flush: true, failOnError: true)
        //new TopicFile(...).save(flush: true, failOnError: true)
        //TopicFile topicFile = new TopicFile(...).save(flush: true, failOnError: true)
        //new TopicFile(...).save(flush: true, failOnError: true)
        //new TopicFile(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //topicFile.id
    }

    void "test get"() {
        setupData()

        expect:
        topicFileService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TopicFile> topicFileList = topicFileService.list(max: 2, offset: 2)

        then:
        topicFileList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        topicFileService.count() == 5
    }

    void "test delete"() {
        Long topicFileId = setupData()

        expect:
        topicFileService.count() == 5

        when:
        topicFileService.delete(topicFileId)
        sessionFactory.currentSession.flush()

        then:
        topicFileService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TopicFile topicFile = new TopicFile()
        topicFileService.save(topicFile)

        then:
        topicFile.id != null
    }
}
