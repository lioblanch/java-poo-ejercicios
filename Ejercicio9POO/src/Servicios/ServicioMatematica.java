package Servicios;

import Entidades.ClaseMatematica;

public class ServicioMatematica {

    public void  devolverMayor(ClaseMatematica cm){
        double  mayor;
        double menor;



        mayor = Math.max(cm.getNumero1(), cm.getNumero2());
        menor = Math.min(cm.getNumero1(), cm.getNumero2());

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("");

        System.out.println("El numero menor es: " + menor);
        System.out.println("");

        cm.mayor = mayor;
        cm.menor = menor;

    }

    public void calcularPotencia(ClaseMatematica cm){
        int mayor = (int) Math.round(cm.mayor);
        int menor = (int) Math.round(cm.menor);

        System.out.println("La potencia del numero mayor sobre el numero menor es: [" + Math.pow(mayor, menor) + "]");
        System.out.println("");
    }

    public void calcularRaiz(ClaseMatematica cm){

        double num = Math.abs(cm.menor);

        System.out.println("La raiz cuadrada del numero menor es: " + Math.sqrt(num));
        System.out.println("");
    }
}
