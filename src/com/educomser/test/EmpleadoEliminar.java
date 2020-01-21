package com.educomser.test;

import com.educomser.entity.Empleado;
import com.educomser.entity.dao.EmpleadoDao;
import com.educomser.entity.dao.impl.EmpleadoDaoImpl;
import com.educomser.util.HibernateUtil;
import java.util.Scanner;

public class EmpleadoEliminar {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        System.out.print("-- ELIMINAR EMPLEADO --");
        System.out.print("Ingrese el Id de la persona a eliminar: ");
        int id = in.nextInt();

        //Instanciamos la clase de acceso a datos
        EmpleadoDao perDao = new EmpleadoDaoImpl();
        Empleado per = perDao.findById(id);

        if (per != null) {
            System.out.println("Empleado encontrada");
            System.out.println("COD EMPLEADO:" + per.getCod_empleado());
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
