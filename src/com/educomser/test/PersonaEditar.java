/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educomser.test;

import com.educomser.entity.Persona;
import com.educomser.entity.dao.PersonaDao;
import com.educomser.entity.dao.impl.PersonaDaoImpl;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class PersonaEditar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
         Scanner in =new Scanner(System.in);
        System.out.println("editar");
        System.out.println("editar");
        int id =in.nextInt();
        PersonaDao perDao=new PersonaDaoImpl();
        Persona per=perDao.findById(id);
        if (per!=null) {
            SimpleDateFormat df =new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("ID:"+per.getId());
            System.out.println("ID:"+per.getNombre());
            System.out.println("ID:"+per.getSueldo());
            System.out.println("ID:"+(per.isContrato()?"SI":"NO"));
            System.out.println("fecha nac" +df.format(per.getFechaNacimiento()));
            
            System.out.println("desea modificar el nombre ? s/n:");
            String ressp=in.next();
            if (ressp.equals("s")) {
                System.out.println("iNGREASA EL NUEVO NOMBRE");
                
                //per.setNombre(in.next());
            } else {
            }
        } else {
        }
        
    }
    
}
