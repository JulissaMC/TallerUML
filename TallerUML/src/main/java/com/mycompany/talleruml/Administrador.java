package com.mycompany.talleruml;

public class Administrador extends Usuario{

    public Administrador(String usuario, String contrasena, String nombre, String apellido){
        super(usuario, contrasena, nombre, apellido);
    }

    public void crearUsuarioConRol(String usuario, String contrasena){
        System.out.println("Se creó el usuario con rol");
    }

    public void asignarPermiso(String usuario){
        System.out.println("Se asignó el permiso");
    }

    public void actualizarSoftware(){
        System.out.println("Se actuaizó el software");
    }

    public void asignarResponsable(Curso curso, Profesor responsable) {
        System.out.println("Se asignó un responsable");
    }
}
