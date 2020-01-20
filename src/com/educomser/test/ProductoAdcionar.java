/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educomser.test;

import com.educomser.entity.Producto;
import com.educomser.entity.dao.PersonaDao;
import com.educomser.entity.dao.ProductoDao;
import com.educomser.entity.dao.impl.PersonaDaoImpl;
import com.educomser.entity.dao.impl.ProductoDaoImpl;
import com.educomser.util.HibernateUtil;
import java.util.Date;

/**
 *
 * @author elvis
 */
public class ProductoAdcionar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos el objeto
        Producto p=new Producto();
        p.setNombre("Juan");
        p.setCosto(5000);
        p.setStock_max(12);
        p.setStock_min(100);
         
        System.out.println(p);
        //Creamos el Dao
        ProductoDao proDao=new ProductoDaoImpl();
        proDao.create(p);
        
        //Esta funcion solo usamos en aplicaciones de escritorio
        HibernateUtil.closeSessionFactory();
        
    }
    
}
