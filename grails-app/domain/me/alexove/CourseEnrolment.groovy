package me.alexove

class CourseEnrolment {
    boolean active = true
    Date beginDate
    Date expirationDate

    static belongsTo = [student:User,course:Course]

    static constraints = {
    }
}
