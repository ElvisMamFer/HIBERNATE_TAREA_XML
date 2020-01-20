package com.educomser.entity;

import java.io.Serializable;
import java.util.Date;

public class Persona implements Serializable
{
    private int id;
    private String nombre;
    private double sueldo;
    private boolean contrato;
    private Date fechaNacimiento;

    public Persona() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isContrato() {
        return contrato;
    }

    public void setContrato(boolean contrato) {
        this.contrato = contrato;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + ", contrato=" + contrato + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
