package me.alexove

import me.alexove.Course
import me.alexove.CourseEnrolment
import me.alexove.Subject

class BootStrap {

    def init = { servletContext ->
        def teacherRole = new Role(name:'teacher').save(flush:true)

        def teacher = new User(username:'alexove',password:'password',
                    dni:'43061569',role:teacherRole,email:'aa@bb.cc',
                    fullname:'Alex Oviedo').save(flush:true)

        def cursoLinux = new Course(name:'Curso de servidores con GNU/Linux',
        summary:'.',creationDate:new Date(),teacher:teacher).save(flush:true)

        cursoLinux.addToSubjects(new Subject(name:'Introducción al Software Libre y a GNU/Linux',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'Instalación de Fedora 30',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'Uso del entorno GNOME',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'Introducción a la virtualización',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'Instalación del CentOS 7',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'Manejo del editor vi/vim',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'Comandos de GNU/Linux',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'Administración de conexiones de red',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'Introducción a SystemD',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'Gestión de FirewallD',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'Gestión de cuentas de usuario y permisos de archivos',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'Topicos de virtualización II',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'SSH',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'Instalación y configuración de firewall',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'NTP',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'DHCP',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'Proxy',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'OpenVPN',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'DNS',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'HTTPD',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'MySQL',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'HTTPD con HTTP,Python y Ruby',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'VSFTP',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'Servidor de correo electronico con Postfix, Dovecot y MySQL',
        summary:'..',content:'--'))
        cursoLinux.addToSubjects(new Subject(name:'Servidor de correo electronico con ZIMBRA',
        summary:'..',content:'--'))

        cursoLinux.save(flush:true)
    }
    def destroy = {
    }
}
