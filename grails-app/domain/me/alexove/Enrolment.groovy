package me.alexove

class Enrolment {
    boolean active = true
    Date beginDate
    Date expirationDate

    static belongsTo = [student:User,course:Course]

    static constraints = {
    }
}
