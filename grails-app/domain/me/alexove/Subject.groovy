package me.alexove

class Subject {
    String name
    String summary
    String content // This attribute should be a large text
    boolean active = true

    static hasMany = [files:SubjectFile,topics:Topic]
    static belongsTo = [course:Course]

    static constraints = {
    }
}
