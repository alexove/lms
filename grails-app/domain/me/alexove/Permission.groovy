package me.alexove

class Permission {
    String name
    String permString
    boolean active = true

    static constraints = {
        name unique:true
        permString unique: true
    }
}
