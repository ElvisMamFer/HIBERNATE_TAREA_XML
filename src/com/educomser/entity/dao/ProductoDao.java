
package com.educomser.entity.dao;

import com.educomser.entity.Factura;
import com.educomser.entity.Persona;
import com.educomser.entity.Producto;
import java.util.List;


public interface ProductoDao {
    
    public void create(Producto producto);
    public void update(Producto producto);
    public void delete(Producto producto);
    public Producto findById(int id);
    public List<Producto> getAll();
    
}
