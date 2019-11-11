package me.alexove
import me.alexove.Subject

class Topic {
    String title
    String summary
    String content
    boolean active = true

    static belongsTo=[subject:Subject]

    static constraints = {
    }
}
