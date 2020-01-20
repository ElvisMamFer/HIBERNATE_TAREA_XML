
package com.educomser.entity;

import java.io.Serializable;
import java.util.Date;


public class Factura implements Serializable {
    
     private int  cod_factura;
     private  String nit_ci;
     private  Date fecha_factura;
     private  int cantidad_total;

    public Factura() {
    }

    public int getCod_factura() {
        return cod_factura;
    }

    public void setCod_factura(int cod_factura) {
        this.cod_factura = cod_factura;
    }

    public String getNit_ci() {
        return nit_ci;
    }

    public void setNit_ci(String nit_ci) {
        this.nit_ci = nit_ci;
    }

    public Date getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(Date fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

    public int getCantidad_total() {
        return cantidad_total;
    }

    public void setCantidad_total(int cantidad_total) {
        this.cantidad_total = cantidad_total;
    }

    @Override
    public String toString() {
        return "Factura{" + "cod_factura=" + cod_factura + ", nit_ci=" + nit_ci + ", fecha_factura=" + fecha_factura + ", cantidad_total=" + cantidad_total + '}';
    }
     
     
}
