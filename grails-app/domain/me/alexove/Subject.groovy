package me.alexove

class Subject {
    int subjectOrder
    String title
    String summary
    boolean active = true

    static hasMany = [files:SubjectFile,topics:Topic]
    static belongsTo = [course:Course]

    static constraints = {
    }
}
