/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2poo;

import ClaseEjercicio2.ClaseGeometria;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Ejercicio2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ClaseGeometria g1;

        float radio;

        radio = Float.parseFloat(JOptionPane.showInputDialog("Digite el radio: "));
        g1 = new ClaseGeometria(radio);
        
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Su areá es: " + df.format(g1.getArea()));
        System.out.println("Su perimetro es: " + df.format(g1.getPerimetro()));
    }

}
