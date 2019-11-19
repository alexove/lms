package me.alexove

import grails.gorm.services.Service

@Service(TopicFile)
interface TopicFileService {

    TopicFile get(Serializable id)

    List<TopicFile> list(Map args)

    Long count()

    void delete(Serializable id)

    TopicFile save(TopicFile topicFile)

}