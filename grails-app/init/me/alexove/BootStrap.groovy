package me.alexove

import me.alexove.Course
import me.alexove.Topic
import me.alexove.Chapter

class BootStrap {

    def init = { servletContext ->
        def teacherRole = new Role(authority:'teacher').save(flush:true)

        def teacher = new User(username:'alexove',password:'password',
                    dni:'43061569',role:teacherRole,email:'aa@bb.cc',
                    fullname:'Alex Oviedo').save(flush:true)

        //--------
        def cursoLinux = new Course(name:'Curso de servidores con GNU/Linux',
        summary:'.',creationDate:new Date(),teacher:teacher).save(flush:true)

        def clCh01 = new Chapter(chapterOrder:1,title:'Linux Basico',summary:'Aprende a manejar Linux desde cero',course:cursoLinux).save(flush:true)

        clCh01.addToTopics(new Topic(topicOrder:1,name:'Introducción a la creación de software y software libre',summary:'hola mundo',content:'ssss',videoURL:'wYmAGvAJKsc'))
        clCh01.addToTopics(new Topic(topicOrder:2,name:'Contexto historico',summary:'hola mundo',content:'ssss'))
        clCh01.addToTopics(new Topic(topicOrder:3,name:'Contexto legal',summary:'hola mundo',content:'ssss'))
        clCh01.addToTopics(new Topic(topicOrder:4,name:'Estudio de casos',summary:'hola mundo',content:'ssss'))
        clCh01.addToTopics(new Topic(topicOrder:5,name:'Revisión de conceptos basicos',summary:'hola mundo',content:'ssss'))
        clCh01.addToTopics(new Topic(topicOrder:6,name:'Preparativos e Instalación del Sistema',summary:'hola mundo',content:'ssss'))
        clCh01.addToTopics(new Topic(topicOrder:7,name:'Instalación de Fedora Workstation',summary:'hola mundo',content:'ssss'))
        clCh01.addToTopics(new Topic(topicOrder:8,name:'Instalación de software adicional y configuración extra',summary:'hola mundo',content:'ssss'))

        clCh01.save(flush:true)

        def clCh02 = new Chapter(chapterOrder:2,title:'Linux e interfaz grafica',summary:'Aprende a manejar GNOME',course:cursoLinux).save(flush:true)

        clCh02.addToTopics(new Topic(topicOrder:1,name:'Novedades de GNOME',summary:'***',content:'****'))
        clCh02.addToTopics(new Topic(topicOrder:2,name:'Descripción general',summary:'***',content:'****'))
        clCh02.addToTopics(new Topic(topicOrder:3,name:'El escritorio y barra de tareas',summary:'***',content:'****'))
        clCh02.addToTopics(new Topic(topicOrder:4,name:'Explorador de archivos',summary:'***',content:'****'))
        clCh02.addToTopics(new Topic(topicOrder:5,name:'Aplicaciones incluidas',summary:'***',content:'****'))
        clCh02.addToTopics(new Topic(topicOrder:6,name:'Gestión de impresión',summary:'***',content:'****'))
        clCh02.addToTopics(new Topic(topicOrder:7,name:'Personalización del entorno',summary:'***',content:'****'))
        clCh02.addToTopics(new Topic(topicOrder:8,name:'Herramientas del sistema',summary:'***',content:'****'))
        clCh02.save(flush:true)

        // cursoLinux.save(flush:true)

        //-----
        // def cursoGrails = new Course(name:'Curso de Grails',summary:'Aprendemos a programar aplicaciones web',creationDate:new Date(),teacher:teacher).save(flush:true)
        // cursoGrails.addToTopics(new Topic(topicOrder:1,name:'Algo de historia',summary:'hola mundo',content:'ssss'))
        // cursoGrails.addToTopics(new Topic(topicOrder:2,name:'Arquitectura de una aplicación en Grails',summary:'hola mundo',content:'ssss'))
        // cursoGrails.addToTopics(new Topic(topicOrder:3,name:'Nuevas tecnologias dentro de Grails',summary:'hola mundo',content:'ssss'))
        // cursoGrails.addToTopics(new Topic(topicOrder:4,name:'Aspectos de modularidad de Grails',summary:'hola mundo',content:'ssss'))
        //
        // cursoGrails.save(flush:true)
    }
    def destroy = {
    }
}
