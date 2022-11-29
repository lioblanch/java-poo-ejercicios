package Servicios;

import Entidades.ClaseFracciones;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class ServiciosFracciones {
    Scanner reader = new Scanner(System.in);
    public ClaseFracciones altaFracciones(){


        ClaseFracciones cf = new ClaseFracciones();

        System.out.println("Ingrese el númerador del primer fraccionario: ");
        cf.setNumerador1(reader.nextInt());

        System.out.println("Ingrese el denominador del primer fraccionario: ");
        cf.setDenominador1(reader.nextInt());

        System.out.println("Ingrese el númerador del segundo fraccionario: ");
        cf.setNumerador2(reader.nextInt());

        System.out.println("Ingrese el denominador del segundo fraccionario: ");
        cf.setDenominador2(reader.nextInt());

        return cf;
    }

    public void operaciones(ClaseFracciones cf){

        System.out.println("_________________________________");
        System.out.println("MENÚ DE OPERACIONES FRACCIONARIOS");
        System.out.println("\n 1. sumar" + "\n 2. restar" + "\n 3. multiplicar "
        + "\n 4. dividir");
        System.out.println("Digite su opción");

        int opcion = reader.nextInt();

        int valor1 = 0;
        int valor2 = 0;
        int valor3 = 0;

        if (cf.getDenominador1()==cf.getDenominador2()){
             valor1 = cf.getDenominador1();
        }else {
            valor1 = cf.getDenominador1()*cf.getDenominador2();
            valor2 = cf.getNumerador1()*cf.getDenominador2();
            valor3 = cf.getNumerador2()*cf.getDenominador1();
        }

        if(opcion == 1){
            valor2 = valor2+valor3;
        }else if (opcion == 2){
            valor2 = valor2-valor3;
        }else if (opcion == 3){
            valor1 = cf.getDenominador1() * cf.getDenominador2();
            valor2 = cf.getNumerador1() * cf.getNumerador2();
        }else if(opcion == 4){
            valor1 = cf.getDenominador1() / cf.getDenominador2();
            valor2 = cf.getNumerador1() / cf.getNumerador2();
        }
            if (valor2%2 == 0){
                valor2 /=2;
            }else if(valor2%3 == 0){
                valor2 /=3;
            }else if(valor2%5 == 0){
                valor2 /=5;
            }else{
                valor2 /=1;
            }
            if (valor1%2 == 0){
                valor1 /=2;
            }else if(valor1%3 == 0){
                valor1 /=3;
            }else if(valor1%5 == 0){
                valor1 /=5;
            }else{
                valor1 /=1;
            }
        switch (opcion){

            case 1:
                    if (cf.getDenominador1()==cf.getDenominador2()) {
                        System.out.println("La suma del fraccionario " + cf.getNumerador1() + " / " + cf.getDenominador1()
                                + " + " + cf.getNumerador2() + " / " + cf.getDenominador2() + " = " + (cf.getNumerador1() + cf.getNumerador2()) + " / " + valor1);
                    }else{
                        System.out.println("La suma del fraccionario " + cf.getNumerador1() + " / " + cf.getDenominador1()
                                + " + " + cf.getNumerador2() + " / " + cf.getDenominador2() + " = " + valor2 + " / " + valor1);
                    }

                    break;
            case 2:
                if (cf.getDenominador1()==cf.getDenominador2()) {
                    System.out.println("La resta del fraccionario " + cf.getNumerador1() + " / " + cf.getDenominador1()
                            + " - " +  cf.getNumerador2() + " / " + cf.getDenominador2() + " = " + (cf.getNumerador1()-cf.getNumerador2()) + " / " + valor1 );
                }else{
                    System.out.println("La resta del fraccionario " + cf.getNumerador1() + " / " + cf.getDenominador1()
                            + " - " + cf.getNumerador2() + " / " + cf.getDenominador2() + " = " + valor2 + " / " + valor1);
                }

                    break;
            case 3:
                System.out.println("La multiplicacion del fraccionario: " + cf.getNumerador1() + " / " + cf.getDenominador1()
                        + " * " +  cf.getNumerador2() + " / " + cf.getDenominador2() + " = " + valor1 + " / " + valor2);
                break;

            case 4:
                System.out.println("La division del fraccionario: " + cf.getNumerador1() + " / " + cf.getDenominador1()
                        + " / " +  cf.getNumerador2() + " / " + cf.getDenominador2() + " = " + valor1 + " / " + valor2);
                break;

        }

    }


}
