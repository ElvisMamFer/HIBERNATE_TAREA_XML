
package com.educomser.test;

import com.educomser.entity.Producto;
import com.educomser.entity.dao.ProductoDao;
import com.educomser.entity.dao.impl.ProductoDaoImpl;
import com.educomser.util.HibernateUtil;


public class ProductoAdcionar {


    public static void main(String[] args) {

        //Creamos el objeto
        Producto p = new Producto();
        p.setNombre("Prod3");
        p.setCosto(5000);
        p.setStock_max(12);
        p.setStock_min(100);

        System.out.println(p);
        //Creamos el Dao
        ProductoDao proDao = new ProductoDaoImpl();
        proDao.create(p);

        //Esta funcion solo usamos en aplicaciones de escritorio
        HibernateUtil.closeSessionFactory();

    }

}
