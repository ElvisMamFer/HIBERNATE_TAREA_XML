package com.educomser.entity.dao.impl;



import com.educomser.entity.Factura;
import com.educomser.entity.dao.FacturaDao;
import com.educomser.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FacturaDaoImpl implements FacturaDao {

    private Session session;
    private Transaction tx;

    private void iniciarSession() {
        session = HibernateUtil.getSessionFactory().openSession(); //Llamanos a nuestra sesion y la abrimos
        tx = session.beginTransaction();
    }

    @Override
    public void create(Factura factura) {

        try {
            iniciarSession();
            session.save(factura);
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
    public void update(Factura factura) {

        try {
            iniciarSession();
            session.update(factura);
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
    public void delete(Factura factura) {

        try {
            iniciarSession();
            session.delete(factura);
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
    public Factura findById(int id) {
       
        Factura factura = null;
        try {
            iniciarSession();
            factura = (Factura) session.get(Factura.class, id); //Esto busca un obj persona (select * from personawhere id=?)
            tx.commit();
        } catch (HibernateException ex) //En caso de presentarse alguna excepcion
        {
            tx.rollback();
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, " | ERROR {0}", ex);
        } finally {
            session.close();
        }

        return factura;
    }

    @Override
    public List<Factura> getAll() {
       
         List<Factura> list = new ArrayList<Factura>();

        try {
            iniciarSession();
            list = session.createQuery("from Factura").list(); //SQL           

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
