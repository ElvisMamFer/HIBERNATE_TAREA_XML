package com.educomser.test;

import com.educomser.entity.Factura;

import com.educomser.entity.dao.impl.FacturaDaoImpl;
import com.educomser.util.HibernateUtil;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FacturaEditar {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("-- EDITAR PERSONA --");
        System.out.print("Ingrese el Id de la persona a Editar: ");
        int id = in.nextInt();

        //Instanciamos la clase de acceso a datos
        FacturaDaoImpl FacDao = new FacturaDaoImpl();
        Factura Fac = FacDao.findById(id);

        if (Fac != null) {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println(Fac);
            System.out.print("¿Desea Modificar?");
            String resp = in.next().toUpperCase();

            if (resp.contains("S")) {
                System.out.println("Ingrese el nuevo nit_ci:");
                Fac.setNit_ci(in.next());
            }

            FacDao.update(Fac);
            System.out.println("Ha finalizado la edicion.");
        } else {
            System.out.println("El ID ingresado no existe.");
        }

        //Cerramos session
        HibernateUtil.closeSessionFactory();

    }

}
