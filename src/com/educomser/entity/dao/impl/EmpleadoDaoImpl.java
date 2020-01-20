package com.educomser.entity.dao.impl;

import com.educomser.entity.Empleado;

import com.educomser.entity.dao.EmpleadoDao;
import com.educomser.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpleadoDaoImpl implements EmpleadoDao {

    private Session session;
    private Transaction tx;

    private void iniciarSession() {
        session = HibernateUtil.getSessionFactory().openSession(); //Llamanos a nuestra sesion y la abrimos
        tx = session.beginTransaction();
    }

    @Override
    public void create(Empleado empleado) {
        try {
            iniciarSession();
            session.save(empleado);
            tx.commit();
        } catch (HibernateException ex) //En caso de presentarse alguna excepcion
        {
            tx.rollback();
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, " | ERROR {0}", ex);
        } finally {
            session.close();
        }
    }

    @Override
    public void update(Empleado empleado) {

        try {
            iniciarSession();
            session.update(empleado);
            tx.commit();
        } catch (HibernateException ex) //En caso de presentarse alguna excepcion
        {
            tx.rollback();
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, " | ERROR {0}", ex);
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(Empleado empleado) {

        try {
            iniciarSession();
            session.delete(empleado);
            tx.commit();
        } catch (HibernateException ex) //En caso de presentarse alguna excepcion
        {
            tx.rollback();
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, " | ERROR {0}", ex);
        } finally {
            session.close();
        }
    }

    @Override
    public Empleado findById(int id) {

        Empleado empleado = null;
        try {
            iniciarSession();
            empleado = (Empleado) session.get(Empleado.class, id); //Esto busca un obj persona (select * from personawhere id=?)
            tx.commit();
        } catch (HibernateException ex) //En caso de presentarse alguna excepcion
        {
            tx.rollback();
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, " | ERROR {0}", ex);
        } finally {
            session.close();
        }

        return empleado;
    }

    @Override
    public List<Empleado> getAll() {

        List<Empleado> list = new ArrayList<Empleado>();

        try {
            iniciarSession();
            list = session.createQuery("from Empleado").list(); //SQL           

            tx.commit();
        } catch (HibernateException ex) //En caso de presentarse alguna excepcion
        {
            tx.rollback();
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, " | ERROR {0}", ex);
        } finally {
            session.close();
        }

        return list;

    }

}
