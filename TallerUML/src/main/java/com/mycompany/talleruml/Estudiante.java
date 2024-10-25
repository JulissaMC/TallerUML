package com.mycompany.talleruml;


public class Estudiante extends PersonalAcademico{

    public Estudiante(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void solicitarInscripcionCurso(Curso curso){
        System.out.println("Se solicitó la inscripción al curso");
    }

    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        System.out.println("Se realizó la actividad sumativa");
    }
}
