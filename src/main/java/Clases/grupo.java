/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author isaac
 */
public class grupo {
    private String Codigo;
    private String Nombre;
    private Date FechaInicio;
    private Date FechaFin;
    private taller Tipo;
    private String CodigoEntrenador;
    private Integer Cupo;
    private Float Precio;


    public grupo(String codigo, String nombre, Date fechaInicio, Date fechaFin, taller tipo, String codigoEntrenador, Integer cupo, Float precio) {
        Codigo = codigo;
        Nombre = nombre;
        FechaInicio = fechaInicio;
        FechaFin = fechaFin;
        Tipo = tipo;
        CodigoEntrenador = codigoEntrenador;
        Cupo = cupo;
        Precio = precio;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        FechaFin = fechaFin;
    }

    public taller getTipo() {
        return Tipo;
    }

    public void setTipo(taller tipo) {
        Tipo = tipo;
    }

    public String getCodigoEntrenador() {
        return CodigoEntrenador;
    }

    public void setCodigoEntrenador(String codigoEntrenador) {
        CodigoEntrenador = codigoEntrenador;
    }

    public Integer getCupo() {
        return Cupo;
    }

    public void setCupo(Integer cupo) {
        Cupo = cupo;
    }

    public Float getPrecio() {
        return Precio;
    }

    public void setPrecio(Float precio) {
        Precio = precio;
    }
}
