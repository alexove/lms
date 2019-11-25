package me.alexove

class Teacher extends User{
  String resume

  static hasMany=[courses:Course]
}
