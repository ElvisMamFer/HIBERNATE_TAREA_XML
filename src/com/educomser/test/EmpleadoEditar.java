package com.educomser.test;

import com.educomser.entity.Empleado;
import com.educomser.entity.Persona;
import com.educomser.entity.dao.EmpleadoDao;
import com.educomser.entity.dao.PersonaDao;
import com.educomser.entity.dao.impl.EmpleadoDaoImpl;
import com.educomser.entity.dao.impl.PersonaDaoImpl;
import com.educomser.util.HibernateUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elvis
 */
public class EmpleadoEditar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        
         Scanner in=new Scanner(System.in);
        
        System.out.print("-- EDITAR PERSONA --");
        System.out.println("Ingrese el Id de la persona a Editar");
        int id=in.nextInt();
        
        //Instanciamos la clase de acceso a datos
        EmpleadoDaoImpl EmpDao=new EmpleadoDaoImpl();        
        Empleado Emp=EmpDao.findById(id);
        
        if(Emp!=null)
        {
            SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
            System.out.println(Emp);
            String resp=in.next().toUpperCase();
            if(resp.contains("S"))
            {                
                System.out.println("Ingrese el nuevo nombre:");
                Emp.setNombre(in.next());                
            }              
            
            EmpDao.update(Emp);
            System.out.println("Ha finalizado la edicion.");
        }
        else
        {
            System.out.println("El ID ingresado no existe.");
        }
        
        //Cerramos session
        HibernateUtil.closeSessionFactory();
        
        
    }
    
}
