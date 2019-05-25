package com.ulsa.hackathon

class Estudiantes {
    Usuario usuario
    String matricula
    static hasManyExamenes = [examenes: Examen]
    static hasManyMaterias = [materias: Materias]
    static constraints = {
    }
}
