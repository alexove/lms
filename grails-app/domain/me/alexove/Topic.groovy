package me.alexove
import me.alexove.Subject

class Topic {
    int topicOrder
    String name
    String summary
    String content
    String videoURL
    boolean active = true

    static belongsTo=[subject:Subject]

    static constraints = {
        videoURL nullable:true,blank:true
    }

    // TODO the content attribute should be a large text
}
