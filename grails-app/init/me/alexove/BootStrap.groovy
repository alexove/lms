package me.alexove

import me.alexove.Course
import me.alexove.CourseEnrolment
import me.alexove.Subject

class BootStrap {

    def init = { servletContext ->
        try{
            def teacherRole = new Role(name:'teacher').save(flush:true)

            def teacher = new User(username:'alexove',password:'password',
                        dni:'43061569',role:teacherRole,email:'aa@bb.cc',
                        fullname:'Alex Oviedo').save(flush:true)

            def cursoLinux = new Course(name:'Curso de servidores con GNU/Linux',
            summary:'.',creationDate:new Date(),teacher:teacher).save(flush:true)

            cursoLinux.subjects.add(new Subject(name:'Introducción al Software Libre',
            summary:'..',content:'--'))
            cursoLinux.subjects.add(new Subject(name:'Introducción a GNU/Linux',
            summary:'..',content:'--'))

            cursoLinux.save(flush:true)

        }catch(Exception e){
            println "===========\n ${e.getMessage()}"
        }

    }
    def destroy = {
    }
}
