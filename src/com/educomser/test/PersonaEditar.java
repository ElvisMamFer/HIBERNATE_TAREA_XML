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

        Scanner in = new Scanner(System.in);

        System.out.println("==== EDITAR ===");
        System.out.print("Cod: Persona");
        int id = in.nextInt();

        PersonaDao perDao = new PersonaDaoImpl();
        Persona p = perDao.findById(id);

        if (p != null) {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println("ID: " + p.getId());
            System.out.println("NOMBRE: " + p.getNombre());
            System.out.println("SUELDO: " + p.getSueldo());
            System.out.println("CONTRATO : " + (p.isContrato() ? "SI" : "NO"));

            System.out.println("Desea modificar el nombre ? s/n: ");
            String resp = in.next();
            if (resp.equals("s")) {
                
                System.out.print("INGRESE EL NUEVO NOMBRE :");
                p.setNombre(in.next());
            }
            perDao.update(p);

            System.out.println("Ha finalizado la edicion.");
        } else {
            System.out.println("EL ID no existe.");
        }

    }

}
