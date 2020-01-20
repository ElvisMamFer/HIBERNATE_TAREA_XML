package com.educomser.test;

import com.educomser.entity.Persona;
import com.educomser.entity.dao.PersonaDao;
import com.educomser.entity.dao.impl.PersonaDaoImpl;
import com.educomser.util.HibernateUtil;

public class PersonaListar {

    public static void main(String[] args) {
        
        System.out.println("-- LISTADO DE PERSONAS --");
        PersonaDao perDao = new PersonaDaoImpl();
        for (Persona per : perDao.getAll()) {
            System.out.println(per);
        }
        HibernateUtil.closeSessionFactory();
    }
}
