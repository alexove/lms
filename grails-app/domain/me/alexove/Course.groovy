package me.alexove

class Course {
    String name
    String summary
    boolean active=true
    Date creationDate
    Date closeDate

    static hasMany = [subjects:Subject]
    static belongsTo = [teacher:User]

    static constraints = {
        name unique:true
        closeDate nullable:true, blank:true
    }
}
