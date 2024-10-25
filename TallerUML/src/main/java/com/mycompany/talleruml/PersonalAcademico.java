package com.mycompany.talleruml;

public class PersonalAcademico extends Usuario {

    public PersonalAcademico(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void reportarError(String email, String contenido) {
        System.out.println("Se reportó un error");
    }

    public void solicitarAsesoramientoDelSistema(String email, String contenido) {
        System.out.println("Se solicitó un asesoramiento del sistema");
    }

    public void comentarEnForo(Foro foro, String comentario) {
        System.out.println("Se realizó el comentario con éxito");
    }
}
