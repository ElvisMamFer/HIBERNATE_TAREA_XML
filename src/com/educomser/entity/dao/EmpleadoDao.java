
package com.educomser.entity.dao;

import com.educomser.entity.Empleado;
import java.util.List;


public interface EmpleadoDao {
      public void create(Empleado empleado);
    public void update(Empleado empleado);
    public void delete(Empleado empleado);
    public Empleado findById(int id);
    public List<Empleado> getAll();
}
