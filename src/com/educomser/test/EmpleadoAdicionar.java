/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educomser.test;

import com.educomser.entity.Empleado;

import com.educomser.entity.dao.impl.EmpleadoDaoImpl;

import com.educomser.util.HibernateUtil;
import java.util.Date;
/**
 *
 * @author elvis
 */
public class EmpleadoAdicionar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //Creamos el objeto
        Empleado p=new Empleado();
        p.setNombre("Juan");
        p.setAp_paterno("MAani");
        p.setAp_materno("Jssuan");
      
       p.setFecha_nac( new Date() );
        p.setDireccion("JssuDDDan");
    
        System.out.println(p);
        //Creamos el Dao
        EmpleadoDaoImpl empDao=new EmpleadoDaoImpl();
        empDao.create(p);
        
        //Esta funcion solo usamos en aplicaciones de escritorio
        HibernateUtil.closeSessionFactory();
    }
    
}
