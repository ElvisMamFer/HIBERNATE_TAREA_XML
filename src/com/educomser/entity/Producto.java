package com.educomser.entity;

import java.io.Serializable;

public class Producto implements Serializable {

    private int cod_producto;
    private String nombre;
    private double costo;
    private int stock_max;
    private int stock_min;

    public Producto() {
    }

    public int getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(int cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getStock_max() {
        return stock_max;
    }

    public void setStock_max(int stock_max) {
        this.stock_max = stock_max;
    }

    public int getStock_min() {
        return stock_min;
    }

    public void setStock_min(int stock_min) {
        this.stock_min = stock_min;
    }

    @Override
    public String toString() {
        return "Producto{" + "cod_producto=" + cod_producto + ", nombre=" + nombre + ", costo=" + costo + ", stock_max=" + stock_max + ", stock_min=" + stock_min + '}';
    }

}
