package com.educomser.test;

import com.educomser.entity.Producto;
import com.educomser.entity.dao.ProductoDao;
import com.educomser.entity.dao.impl.ProductoDaoImpl;
import com.educomser.util.HibernateUtil;
import java.util.Scanner;

public class ProductoEliminar {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        System.out.print("-- ELIMINAR PRODUCTO --");
        System.out.print("Ingrese el Id de la producto a eliminar: ");
        int id = in.nextInt();

        //Instanciamos la clase de acceso a datos
        ProductoDao perDao = new ProductoDaoImpl();
        Producto per = perDao.findById(id);

        if (per != null) {
            System.out.println("Producto encontrada");
            System.out.println("NOMBRE:" + per.getNombre());

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
