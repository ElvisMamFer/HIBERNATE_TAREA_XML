package com.educomser.entity.dao.impl;

import com.educomser.entity.Producto;
import com.educomser.entity.dao.ProductoDao;
import com.educomser.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProductoDaoImpl implements ProductoDao {

    private Session session;
    private Transaction tx;

    private void iniciarSession() {
        session = HibernateUtil.getSessionFactory().openSession(); //Llamanos a nuestra sesion y la abrimos
        tx = session.beginTransaction();
    }

    @Override
    public void create(Producto producto) {
        try {
            iniciarSession();
            session.save(producto);
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
    public void update(Producto producto) {
        try {
            iniciarSession();
            session.update(producto);
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
    public void delete(Producto producto) {
        try {
            iniciarSession();
            session.delete(producto);
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
    public Producto findById(int id) {
        Producto producto = null;
        try {
            iniciarSession();
            producto = (Producto) session.get(Producto.class, id); //Esto busca un obj persona (select * from personawhere id=?)
            tx.commit();
        } catch (HibernateException ex) //En caso de presentarse alguna excepcion
        {
            tx.rollback();
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, " | ERROR {0}", ex);
        } finally {
            session.close();
        }

        return producto;
    }

    @Override
    public List<Producto> getAll() {
        List<Producto> list = new ArrayList<Producto>();

        try {
            iniciarSession();
            list = session.createQuery("from Producto").list(); //SQL           

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
