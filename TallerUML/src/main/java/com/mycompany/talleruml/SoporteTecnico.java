package com.mycompany.talleruml;

public class SoporteTecnico extends Usuario {

    public SoporteTecnico(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void brindarAsistencia(Usuario usuario) {
        System.out.println("Se brindó la atención con exitóso ");
    }

    public void resolverProblemaTecnico(Usuario usuario) {
        System.out.println("Se resolvió el problema técnico");
    }

    public void derivarProblemaDeGestion(Administrador administrador) {
        System.out.println("Se derivó el problema de gestión");
    }
}
