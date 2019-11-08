package me.alexove

class SubjectFile {
    String name
    String summary
    Date creationDate
    boolean active = true
    String url

    static belongsTo = [subject:Subject]
    static constraints = {
        url url:true
    }
}
