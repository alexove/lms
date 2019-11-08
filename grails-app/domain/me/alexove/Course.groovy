package me.alexove

class Course {
    String name
    String summary
    boolean active=true
    Date creationDate
    Date closeDate

    static hasMany = [subject:Subject]
    static belongsTo = [teacher:User]

    static constraints = {
        name unique:true
    }
}
