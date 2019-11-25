package me.alexove

class Topic {
    int topicOrder
    String name
    String summary
    String content
    String videoURL
    boolean active = true

    static hasMany = [files:TopicFile]
    static belongsTo = [chapter:Chapter]

    static constraints = {
        videoURL nullable:true,blank:true
    }

    // TODO the content attribute should be a large text
}
