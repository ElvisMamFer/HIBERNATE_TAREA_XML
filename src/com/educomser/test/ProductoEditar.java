package com.educomser.test;

import com.educomser.entity.Producto;

import com.educomser.entity.dao.impl.ProductoDaoImpl;
import com.educomser.util.HibernateUtil;

import java.util.Scanner;


public class ProductoEditar {

   
    public static void main(String[] args) {
       
       
        
         Scanner in=new Scanner(System.in);
        
        System.out.println("-- EDITAR PRODCUTO --");
        System.out.print("Ingrese el Id del producto a Editar: ");
        int id=in.nextInt();
        
        //Instanciamos la clase de acceso a datos
        ProductoDaoImpl EmpDao=new ProductoDaoImpl();        
        Producto Emp=EmpDao.findById(id);
        
        if(Emp!=null)
        {
           
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
