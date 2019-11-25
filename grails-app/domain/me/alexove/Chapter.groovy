package me.alexove

class Chapter {
    int chapterOrder
    String title
    String summary
    static hasMany = [topics:Topic]
    static belongsTo = [course:Course]

    static constraints = {
    }
}
