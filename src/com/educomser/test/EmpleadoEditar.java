package com.educomser.test;

import com.educomser.entity.Empleado;

import com.educomser.entity.dao.impl.EmpleadoDaoImpl;
import com.educomser.util.HibernateUtil;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class EmpleadoEditar {

   
    public static void main(String[] args) {
       
       
        
         Scanner in=new Scanner(System.in);
        
        System.out.println("-- EDITAR PERSONA --");
        System.out.print("Ingrese el Id de la persona a Editar: ");
        int id=in.nextInt();
        
        //Instanciamos la clase de acceso a datos
        EmpleadoDaoImpl EmpDao=new EmpleadoDaoImpl();        
        Empleado Emp=EmpDao.findById(id);
        
        if(Emp!=null)
        {
            SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
            System.out.println(Emp);
              System.out.print("¿Desea Modificar?");
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
