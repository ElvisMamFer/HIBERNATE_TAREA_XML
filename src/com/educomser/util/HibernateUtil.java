package com.educomser.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static SessionFactory sessionFactory;//UNICA CONEXION CON LA BASE DE DATOS
    private static ServiceRegistry serviceRegistry;

    //Funcion anonima
    static {
        try {
            Configuration cfg = new Configuration();
            cfg.configure();
            serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
            sessionFactory = cfg.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            String  s1="==========================ERROR: com.educomser.util HibernateUtil =============";
            String  s2="===============================================================================";
            System.err.println(s1+"\n> La creación inicial de SessionFactory falló:\n" + ex +"   \n"+s2);
           
            throw new ExceptionInInitializerError(ex);
            
        }

    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    //Para cerra el sessionFactory
    public static void closeSessionFactory() {
        if (sessionFactory != null && !sessionFactory.isClosed()) {
            sessionFactory.close();
            StandardServiceRegistryBuilder.destroy(serviceRegistry);
        }
    }

}
