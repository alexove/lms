package me.alexove

class Student extends User{
  static hasMany = [enrolments:CourseEnrolment]
}
