/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3poo.Entidades;

/**
 *
 * @author pc
 */
public class ClaseOperacion {

    private float num1;
    private float num2;

    public ClaseOperacion(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public ClaseOperacion() {
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
}
