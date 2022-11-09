/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3poo.Servicios;

import ejercicio3poo.Entidades.ClaseOperacion;
import java.util.*;

/**
 *
 * @author pc
 */
public class ServicioOperacion {
    public ClaseOperacion altaOperacion() {
        Scanner reader = new Scanner(System.in);
        ClaseOperacion co1 = new ClaseOperacion();

        System.out.println("Ingrese el primer valor: ");
        co1.setNum1(reader.nextInt());

        System.out.println("Ingrese el segundo valor: ");
        co1.setNum2(reader.nextInt());

        return co1;

    }

    public void  operaciones(ClaseOperacion co1){

        float suma = co1.getNum1() + co1.getNum2();
        float resta = co1.getNum1() - co1.getNum2();
        float multiplicacion = co1.getNum1() * co1.getNum2();
        float division = co1.getNum1() / co1.getNum2();

        System.out.println("La suma de " + co1.getNum1() + " + " + co1.getNum2()
        + " = " + suma);
        System.out.println("La resta de " + co1.getNum1() + " - " + co1.getNum2()
                + " = " + resta);
        System.out.println("La multiplicacion de " + co1.getNum1() + " * " + co1.getNum2()
                + " = " + multiplicacion);
        System.out.println("La division de " + co1.getNum1() + " / " + co1.getNum2()
                + " = " + division);
    }
}
