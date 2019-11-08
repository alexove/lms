package me.alexove

import grails.gorm.services.Service

@Service(SubjectFile)
interface SubjectFileService {

    SubjectFile get(Serializable id)

    List<SubjectFile> list(Map args)

    Long count()

    void delete(Serializable id)

    SubjectFile save(SubjectFile subjectFile)

}