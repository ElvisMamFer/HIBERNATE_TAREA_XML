/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educomser.test;

import com.educomser.entity.dao.PersonaDao;
import com.educomser.entity.dao.impl.PersonaDaoImpl;

/**
 *
 * @author usuario
 */
public class PersonaEliminar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" LISTADO DE PERSONAS");
        PersonaDao perDao=new PersonaDaoImpl();
        for (Object object : perDao.getAll()) {
            
        }
    }
    
}
