package com.educomser.test;

import com.educomser.entity.Empleado;
import com.educomser.entity.dao.EmpleadoDao;
import com.educomser.entity.dao.impl.EmpleadoDaoImpl;
import com.educomser.util.HibernateUtil;

public class EmpleadoListar {

    public static void main(String[] args) {
        
        System.out.println("-- LISTADO DE PERSONAS --");
        EmpleadoDao perDao = new EmpleadoDaoImpl();
        for (Empleado per : perDao.getAll()) {
            System.out.println(per);
        }
        HibernateUtil.closeSessionFactory();
    }
}
