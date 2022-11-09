/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseEjercicio2;

/**
 *
 * @author pc
 */
public class ClaseGeometria {
    private float radio;

    public ClaseGeometria() {
    }

    
    
    public ClaseGeometria(float radio) {
        this.radio = radio;
    }
    
    public float getPerimetro(){
        float perimetro = (float) (2 * Math.PI * radio);
        return perimetro;
    }
    
    public float getArea(){
    
        float area = (float) (Math.PI*(radio*radio));
        return area;
    }
}
