package com.educomser.test;

import com.educomser.entity.Factura;
import com.educomser.entity.dao.FacturaDao;
import com.educomser.entity.dao.impl.FacturaDaoImpl;
import com.educomser.util.HibernateUtil;
import java.util.Scanner;

public class FacturaEliminar {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        System.out.print("-- ELIMINAR FACTURA --");
        System.out.print("Ingrese el Id de la persona a eliminar: ");
        int id = in.nextInt();

        //Instanciamos la clase de acceso a datos
        FacturaDao perDao = new FacturaDaoImpl();
        Factura per = perDao.findById(id);

        if (per != null) {
            System.out.println("Factura encontrada");
            System.out.println(per);
         

            System.out.println("¿Desea eliminar?");
            String resp = in.next().toUpperCase();
            if (resp.contains("S")) {
                perDao.delete(per);
                System.out.println("Se ha eliminado correctamente.");
            }
        } else {
            System.out.println("El ID ingresado no existe.");
        }
        //Cerramos session
        HibernateUtil.closeSessionFactory();
    }

}
