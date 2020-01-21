package com.educomser.test;

import com.educomser.entity.Factura;
import com.educomser.entity.dao.FacturaDao;
import com.educomser.entity.dao.impl.FacturaDaoImpl;
import com.educomser.util.HibernateUtil;

public class FacturaListar {

    public static void main(String[] args) {
        
        System.out.println("-- LISTADO DE PERSONAS --");
        FacturaDao perDao = new FacturaDaoImpl();
        for (Factura per : perDao.getAll()) {
            System.out.println(per);
        }
        HibernateUtil.closeSessionFactory();
    }
}
