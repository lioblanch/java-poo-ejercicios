/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.text.DecimalFormat;

/**
 *
 * @author pc
 */
public class CreadorClase {

    private int base;
    private int altura;

    public CreadorClase() {
    }

    public CreadorClase(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void hacerRectangulo(int base, int altura){

        int perimetro = (base + altura)*2;
        float superficie = (base * altura) / perimetro;

        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("\n Los valores de su rectangulo son: " + "\n base:" + base
        + "\n altura: " + altura + "\n perimetro: " + perimetro +  "\n superficie: " + df.format(superficie));

    }
}
