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

        //--------
        def cursoLinux = new Course(name:'Curso de servidores con GNU/Linux',
        summary:'.',creationDate:new Date(),teacher:teacher).save(flush:true)

        def s1=new Subject(subjectOrder:1,title:'Introducción al Software Libre y GNU/Linux',summary:'Aqui aprenderas sobre ....')
        s1.addToTopics(new Topic(topicOrder:1,name:'Introducción a la creación de software y software libre',summary:'hola mundo',content:'ssss',videoURL:'wYmAGvAJKsc'))
        s1.addToTopics(new Topic(topicOrder:2,name:'Contexto historico',summary:'hola mundo',content:'ssss'))
        s1.addToTopics(new Topic(topicOrder:3,name:'Contexto legal',summary:'hola mundo',content:'ssss'))
        s1.addToTopics(new Topic(topicOrder:4,name:'Estudio de casos',summary:'hola mundo',content:'ssss'))

        def s2=new Subject(subjectOrder:2,title:'Instalación del Sistema Operativo',summary:'Aqui aprenderas sobre ....')
        s2.addToTopics(new Topic(topicOrder:1,name:'Revisión de conceptos basicos',summary:'hola mundo',content:'ssss'))
        s2.addToTopics(new Topic(topicOrder:2,name:'Preparativos e Instalación del Sistema',summary:'hola mundo',content:'ssss'))
        s2.addToTopics(new Topic(topicOrder:3,name:'Instalación de Fedora Workstation',summary:'hola mundo',content:'ssss'))
        s2.addToTopics(new Topic(topicOrder:4,name:'Instalación de software adicional y configuración extra',summary:'hola mundo',content:'ssss'))

        def s3 = new Subject(subjectOrder:3,title:'Uso del entorno GNOME', summary:'..',content:'--')
        s3.addToTopics(new Topic(topicOrder:1,name:'Novedades de GNOME',summary:'***',content:'****'))
        s3.addToTopics(new Topic(topicOrder:2,name:'Descripción general',summary:'***',content:'****'))
        s3.addToTopics(new Topic(topicOrder:3,name:'El escritorio y barra de tareas',summary:'***',content:'****'))
        s3.addToTopics(new Topic(topicOrder:4,name:'Explorador de archivos',summary:'***',content:'****'))
        s3.addToTopics(new Topic(topicOrder:5,name:'Aplicaciones incluidas',summary:'***',content:'****'))
        s3.addToTopics(new Topic(topicOrder:6,name:'Gestión de impresión',summary:'***',content:'****'))
        s3.addToTopics(new Topic(topicOrder:7,name:'Personalización del entorno',summary:'***',content:'****'))
        s3.addToTopics(new Topic(topicOrder:8,name:'Herramientas del sistema',summary:'***',content:'****'))

        cursoLinux.addToSubjects(s1)
        cursoLinux.addToSubjects(s2)
        cursoLinux.addToSubjects(s3)

        cursoLinux.save(flush:true)

        //-----
        def cursoGrails = new Course(name:'Curso de Grails',summary:'Aprendemos a programar aplicaciones web',creationDate:new Date(),teacher:teacher).save(flush:true)
        def sg1=new Subject(subjectOrder:1,title:'Introducción a Grails',summary:'Aqui aprenderas sobre ....')
        sg1.addToTopics(new Topic(topicOrder:1,name:'Algo de historia',summary:'hola mundo',content:'ssss'))
        sg1.addToTopics(new Topic(topicOrder:2,name:'Arquitectura de una aplicación en Grails',summary:'hola mundo',content:'ssss'))
        sg1.addToTopics(new Topic(topicOrder:3,name:'Nuevas tecnologias dentro de Grails',summary:'hola mundo',content:'ssss'))
        sg1.addToTopics(new Topic(topicOrder:4,name:'Aspectos de modularidad de Grails',summary:'hola mundo',content:'ssss'))

        cursoGrails.addToSubjects(sg1)
        cursoGrails.save(flush:true)
    }
    def destroy = {
    }
}
