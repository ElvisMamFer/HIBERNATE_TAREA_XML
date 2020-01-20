package com.educomser.entity.dao;

import com.educomser.entity.Factura;
import com.educomser.entity.Persona;
import java.util.List;

public interface FacturaDao  {
   
    public void create(Factura factura);
    public void update(Factura factura);
    public void delete(Factura factura);
    public Factura findById(int id);
    public List<Factura> getAll();
}
