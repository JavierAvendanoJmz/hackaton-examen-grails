package com.ulsa.hackathon

class Examen {

    String nombre
    Materias Materia
    Date fechaInicio
    Date fechaFin
    Integer tiempo
    Integer noPreguntas
    static hasMany = [estudiantes: Estudiantes]

    static constraints = {
    }
}
