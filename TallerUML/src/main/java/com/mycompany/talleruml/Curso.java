package com.mycompany.talleruml;

import java.util.List;

public class Curso{
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private List<ActividadSumativa> actividadesSumativas;

    public Curso(String id, String nombre, boolean estadoDisponible, List<ActividadSumativa> actividadesSumativas){
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
        this.actividadesSumativas = actividadesSumativas;
    }


    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public boolean isEstadoDisponible(){
        return estadoDisponible;
    }

    public void setEstadoDisponible(boolean estadoDisponible){
        this.estadoDisponible = estadoDisponible;
    }

    public List<ActividadSumativa> getActividadesSumativas(){
        return actividadesSumativas;
    }

    public void setActividadesSumativas(List<ActividadSumativa> actividadesSumativas){
        this.actividadesSumativas = actividadesSumativas;
    }
}
