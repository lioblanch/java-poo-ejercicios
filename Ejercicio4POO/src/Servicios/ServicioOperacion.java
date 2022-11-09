/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CreadorClase;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ServicioOperacion {
    Scanner reader = new Scanner(System.in);
    public CreadorClase altaOperacion(){
        CreadorClase cc = new CreadorClase();
        System.out.println("Ingrese la base de su rectangulo: ");
        cc.setBase(reader.nextInt());

        System.out.println("Ingrese la altura de su rectangulo: ");
        cc.setAltura(reader.nextInt());

        return cc;

    }

public void crearRectangulo(CreadorClase cc){

        int i = 0;
        int j = 0;
        while (i<cc.getAltura()){
            while (j< cc.getBase()){
                System.out.print("*");
                j++;
            }
            System.out.println();
            j=0;
            i++;
        }
}
}
