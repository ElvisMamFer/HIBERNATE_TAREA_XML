/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educomser.test;

import com.educomser.entity.Persona;
import com.educomser.entity.dao.PersonaDao;
import com.educomser.entity.dao.impl.PersonaDaoImpl;
import com.educomser.util.HibernateUtil;
import java.util.Date;

/**
 *
 * @author pc
 */
public class PersonaAdicionar {

    public static void main(String[] args) {

        //Creamos el objeto
        Persona p=new Persona();
        p.setNombre("Santos");
        p.setSueldo(5000);
        p.setContrato(true);
        p.setFechaNacimiento(new Date());
         
        System.out.println(p);
        //Creamos el Dao
        PersonaDao perDao=new PersonaDaoImpl();
        perDao.create(p);
        
        //Esta funcion solo usamos en aplicaciones de escritorio
        HibernateUtil.closeSessionFactory();
        
        
        
    }
    
}
