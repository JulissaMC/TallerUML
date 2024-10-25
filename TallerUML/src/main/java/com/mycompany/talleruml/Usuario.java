package com.mycompany.talleruml;

public class Usuario{
    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected String apellido;

    public Usuario(String usuario, String contrasena, String nombre, String apellido){
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public boolean login(){
        System.out.println("Inicio de sesión exitoso");
        return true;
    }

    public boolean logOut(){
        System.out.println("Cierre de sesión exitoso");
        return true;
    }

    public String getUsuario(){
        return usuario;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public String getContrasena(){
        return contrasena;
    }

    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

}
