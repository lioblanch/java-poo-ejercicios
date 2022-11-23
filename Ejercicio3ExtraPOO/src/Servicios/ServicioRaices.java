package Servicios;

import Entidades.ClaseRaices;

import java.util.Scanner;

public class ServicioRaices {

    public ClaseRaices crearValores(){

        Scanner reader = new Scanner(System.in);

        ClaseRaices cr = new ClaseRaices();

        System.out.println("Ingrese el valor 1");
        cr.setCoeficienteA(reader.nextInt());
        System.out.println("Ingrese el valor 2");
        cr.setCoeficienteB(reader.nextInt());
        System.out.println("Ingrese el valor 3");
        cr.setCoeficienteC(reader.nextInt());

        return  cr;
    }

    public void getDiscriminante(ClaseRaices cr){

        double valor = Math.pow(cr.getCoeficienteB(), 2);

        cr.setDiscriminate((valor)-4*cr.getCoeficienteA()*cr.getCoeficienteC());

        System.out.println("Valor Discriminante: ");
        System.out.println(cr.getDiscriminate());

    }

    public boolean tieneRaices(ClaseRaices cr){

        return cr.getDiscriminate()>0;
    }

    public boolean tieneRaiz(ClaseRaices cr){

        return cr.getDiscriminate()==0;
    }

    public void obtenerRaices(ClaseRaices cr){

        double x1 = (-cr.getCoeficienteB()+Math.sqrt(cr.getDiscriminate()))/(2*cr.getCoeficienteA());
        double x2 = (-cr.getCoeficienteB()-Math.sqrt(cr.getDiscriminate()))/(2*cr.getCoeficienteA());

        System.out.println("Solucion X1: ");
        System.out.println(x1);
        System.out.println("Solucion x2: ");
        System.out.println(x2);

    }

    public void obtenerRaiz(ClaseRaices cr){

        double x = (-cr.getCoeficienteB())/(2*cr.getCoeficienteA());
        System.out.println("Unica solucion");
        System.out.println(x);
    }

    public void calcular(ClaseRaices cr){

        if (tieneRaices(cr)){
            obtenerRaices(cr);

        }else if (tieneRaiz(cr)){
            obtenerRaiz(cr);
        }else {
            System.out.println("No tiene soluciones");
        }

    }
}
