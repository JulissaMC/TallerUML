package com.mycompany.talleruml;


public class Profesor extends PersonalAcademico{

    public Profesor(String usuario, String contrasena, String nombre, String apellido){
        super(usuario, contrasena, nombre, apellido);
    }

    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        System.out.println("Se cargó la actividad sumativa");
    }

    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa){
        System.out.println("Se calificó actividad sumativa");
    }

    public void aceptarInscripcion(Curso curso, String usuarioEstudiante){
        System.out.println("Se aceptó la inscripción");
    }

    public void crearNuevoForo(Foro foro){
        System.out.println("Se creó un nuevo foro");
    }
}
