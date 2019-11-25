package me.alexove

class User {
    String dni
    String fullname
    String email
    String password
    boolean active = true

    static belongsTo = [role:Role]

    static constraints = {
        email email:true
        password password:true
    }
}
