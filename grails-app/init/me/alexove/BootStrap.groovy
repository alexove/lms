package me.alexove

import me.alexove.Course
import me.alexove.CourseEnrolment
import me.alexove.Topic

class BootStrap {

    def init = { servletContext ->
        def teacherRole = new Role(name:'teacher').save(flush:true)

        def teacher = new Teacher(username:'alexove',password:'password',
                    dni:'43061569',role:teacherRole,email:'aa@bb.cc',
                    fullname:'Alex Oviedo',resume:'esta es una Descripción de la vida del profesor').save(flush:true)

        //--------
        def cursoLinux = new Course(name:'Curso de servidores con GNU/Linux',
        summary:'.',creationDate:new Date(),teacher:teacher).save(flush:true)

        cursoLinux.addToTopics(new Topic(topicOrder:1,name:'Introducción a la creación de software y software libre',summary:'hola mundo',content:'ssss',videoURL:'wYmAGvAJKsc'))
        cursoLinux.addToTopics(new Topic(topicOrder:2,name:'Contexto historico',summary:'hola mundo',content:'ssss'))
        cursoLinux.addToTopics(new Topic(topicOrder:3,name:'Contexto legal',summary:'hola mundo',content:'ssss'))
        cursoLinux.addToTopics(new Topic(topicOrder:4,name:'Estudio de casos',summary:'hola mundo',content:'ssss'))
        cursoLinux.addToTopics(new Topic(topicOrder:5,name:'Revisión de conceptos basicos',summary:'hola mundo',content:'ssss'))
        cursoLinux.addToTopics(new Topic(topicOrder:6,name:'Preparativos e Instalación del Sistema',summary:'hola mundo',content:'ssss'))
        cursoLinux.addToTopics(new Topic(topicOrder:7,name:'Instalación de Fedora Workstation',summary:'hola mundo',content:'ssss'))
        cursoLinux.addToTopics(new Topic(topicOrder:8,name:'Instalación de software adicional y configuración extra',summary:'hola mundo',content:'ssss'))
        cursoLinux.addToTopics(new Topic(topicOrder:9,name:'Novedades de GNOME',summary:'***',content:'****'))
        cursoLinux.addToTopics(new Topic(topicOrder:10,name:'Descripción general',summary:'***',content:'****'))
        cursoLinux.addToTopics(new Topic(topicOrder:11,name:'El escritorio y barra de tareas',summary:'***',content:'****'))
        cursoLinux.addToTopics(new Topic(topicOrder:12,name:'Explorador de archivos',summary:'***',content:'****'))
        cursoLinux.addToTopics(new Topic(topicOrder:13,name:'Aplicaciones incluidas',summary:'***',content:'****'))
        cursoLinux.addToTopics(new Topic(topicOrder:14,name:'Gestión de impresión',summary:'***',content:'****'))
        cursoLinux.addToTopics(new Topic(topicOrder:15,name:'Personalización del entorno',summary:'***',content:'****'))
        cursoLinux.addToTopics(new Topic(topicOrder:16,name:'Herramientas del sistema',summary:'***',content:'****'))

        cursoLinux.save(flush:true)

        //-----
        def cursoGrails = new Course(name:'Curso de Grails',summary:'Aprendemos a programar aplicaciones web',creationDate:new Date(),teacher:teacher).save(flush:true)
        cursoGrails.addToTopics(new Topic(topicOrder:1,name:'Algo de historia',summary:'hola mundo',content:'ssss'))
        cursoGrails.addToTopics(new Topic(topicOrder:2,name:'Arquitectura de una aplicación en Grails',summary:'hola mundo',content:'ssss'))
        cursoGrails.addToTopics(new Topic(topicOrder:3,name:'Nuevas tecnologias dentro de Grails',summary:'hola mundo',content:'ssss'))
        cursoGrails.addToTopics(new Topic(topicOrder:4,name:'Aspectos de modularidad de Grails',summary:'hola mundo',content:'ssss'))

        cursoGrails.save(flush:true)
    }
    def destroy = {
    }
}
