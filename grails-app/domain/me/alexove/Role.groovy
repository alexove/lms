package me.alexove

class Role {
    String name
    boolean active = true

    static hasMany = [permissions:Permission]
    
    static constraints = {
        name unique:true
    }
}
