package com.ulsa.hackathon

class Materias {

    String nombre
    Maestros maestro
    static hasMany = [estudiantes: Estudiantes]
    static constraints = {
    }
}
