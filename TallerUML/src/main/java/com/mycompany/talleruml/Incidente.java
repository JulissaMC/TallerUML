package com.mycompany.talleruml;

import java.util.List;
import java.util.Date;

public class Incidente {
    protected int id;
    protected Date fechaReportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List<String> logActualizaciones;
    protected Date fechaCerrado;
    protected String tipo;


    public Incidente(int id, Date fechaReportado, String estado, String titulo, String descripcion, List<String> logActualizaciones, Date fechaCerrado, String tipo) {
        this.id = id;
        this.fechaReportado = fechaReportado;
        this.estado = estado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.logActualizaciones = logActualizaciones;
        this.fechaCerrado = fechaCerrado;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaReportado() {
        return fechaReportado;
    }

    public void setFechaReportado(Date fechaReportado) {
        this.fechaReportado = fechaReportado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getLogActualizaciones() {
        return logActualizaciones;
    }

    public void setLogActualizaciones(List<String> logActualizaciones) {
        this.logActualizaciones = logActualizaciones;
    }

    public Date getFechaCerrado() {
        return fechaCerrado;
    }

    public void setFechaCerrado(Date fechaCerrado) {
        this.fechaCerrado = fechaCerrado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
