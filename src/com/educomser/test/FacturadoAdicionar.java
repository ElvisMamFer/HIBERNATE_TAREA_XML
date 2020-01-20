package com.educomser.test;

import com.educomser.entity.Factura;
import com.educomser.entity.dao.FacturaDao;

import com.educomser.entity.dao.impl.FacturaDaoImpl;

import com.educomser.util.HibernateUtil;
import java.util.Date;

public class FacturadoAdicionar {

    public static void main(String[] args) {
          Factura f=new Factura();
        f.setNit_ci("123");
        f.setFecha_factura(new Date());
        f.setCantidad_total(123);
       
         
        System.out.println(f);
        //Creamos el Dao
        FacturaDao perDao=new FacturaDaoImpl();
        perDao.create(f);
        
        //Esta funcion solo usamos en aplicaciones de escritorio
        HibernateUtil.closeSessionFactory();
    }
    
}
