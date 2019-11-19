package me.alexove

class TopicFile {
    String name
    String summary
    Date creationDate = new Date()
    boolean active = true
    String url

    static belongsTo = [course:Course]

    static constraints = {
        url url:true
    }
}
