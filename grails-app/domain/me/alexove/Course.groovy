package me.alexove

class Course {
    String name
    String summary
    boolean active=true
    Date creationDate
    Date closeDate
    String banner
    String icon

    static hasMany = [subjects:Subject]
    static belongsTo = [teacher:User]

    static constraints = {
        name unique:true
        closeDate nullable:true, blank:true
        banner blank:true,nullable:true
        icon blank:true,nullable:true
    }
}
