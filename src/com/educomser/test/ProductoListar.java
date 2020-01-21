package com.educomser.test;

import com.educomser.entity.Producto;
import com.educomser.entity.dao.ProductoDao;
import com.educomser.entity.dao.impl.ProductoDaoImpl;
import com.educomser.util.HibernateUtil;

public class ProductoListar {

    public static void main(String[] args) {
        
        System.out.println("-- LISTADO DE PRODUCTO --");
        ProductoDao perDao = new ProductoDaoImpl();
        for (Producto per : perDao.getAll()) {
            System.out.println(per);
        }
        HibernateUtil.closeSessionFactory();
    }
}
