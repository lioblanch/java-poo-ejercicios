package Servicios;

import Entidades.ClaseFrase;

import java.util.Scanner;

public class ServicioFrase {
    Scanner reader = new Scanner(System.in);
    public ClaseFrase crearFrase(ClaseFrase cf1){


        System.out.println("Ingrese una palabra o una frase");
        cf1.setFrase(reader.nextLine());

        cf1.setTamFrase(cf1.getFrase().length());

        return cf1;
    }

    public void mostrarVocales(ClaseFrase cf1){

        int contador = 0;

        for (int i = 0 ; i<cf1.getFrase().length(); i++) {
            if ((cf1.getFrase().substring(i, i+1).equalsIgnoreCase("a")) ||
                    (cf1.getFrase().substring(i, i+1).equalsIgnoreCase("e")) ||
                    (cf1.getFrase().substring(i, i+1).equalsIgnoreCase("i")) ||
                    (cf1.getFrase().substring(i, i+1).equalsIgnoreCase("o")) ||
                    (cf1.getFrase().substring(i, i+1).equalsIgnoreCase("u"))){
                contador ++;
            }

        }
        System.out.println("La cantidad de vocales " + " es " + contador);

    }

    public void invertirFrase(ClaseFrase cf1) {

        System.out.println("Su frase invertida es: ");
        for (int i = cf1.getTamFrase()-1; i >= 0; i--) {

            System.out.print(cf1.getFrase().substring(i, i+1));

        }
        System.out.println("");
    }

    public void vecesRepetido(ClaseFrase cf1){
            int rep = 0;
        System.out.println("Ingrese un caracter a buscar");
        String caracter = reader.next();

        for (int i = 0 ; i<cf1.getTamFrase(); i++){
            if (caracter.equalsIgnoreCase( cf1.getFrase().substring(i, i+1))){
                rep++;

                }

        }
        System.out.println("El caracter aparece " + rep + " veces en su frase");
    }

    public void compararLongitud(ClaseFrase cf1){

        System.out.println("Ingrese una nueva frase ");
        reader.nextLine();
        String frase1 = reader.nextLine();

        int tamFrase1 = frase1.length();

        if(tamFrase1 > cf1.getTamFrase()){

            System.out.println("La nueva frase es mas grande que la frase antigua" );
            System.out.println("Tamaño frase nueva " + tamFrase1);
            System.out.println("Tamaño frase vieja " + cf1.getTamFrase());
        }else if(tamFrase1 == cf1.getTamFrase()){
            System.out.println("Las frases tienen el mismo tamaño");
        }else {
            System.out.println("La nueva frase es mas pequeña que la frase antigua" );
            System.out.println("Tamaño frase nueva " + tamFrase1);
            System.out.println("Tamaño frase vieja " + cf1.getTamFrase());
        }


    }

    public void unirFrases(ClaseFrase cf1){
        System.out.println(" Ingrese una nueva frase");
        String fraseNueva = reader.nextLine();

        System.out.println("Su frase nueva es: " +  fraseNueva);
        System.out.println("Sus frases unidas son: " + "\n" + cf1.getFrase().concat(fraseNueva));
    }

    public void reemplazar(ClaseFrase cf1){

        System.out.println(" Ingrese el caracter por el que va a reemplazar la letra a, A");
        String cara1 = reader.next();

        String frase1 = cf1.getFrase().replace("a", cara1).replace("A", cara1);

        System.out.println(cf1.getFrase());
        System.out.println(frase1);

    }

    public void contiene(ClaseFrase cf1){
        boolean comprobador = true;
        int contador = 0;
        System.out.println(" Ingrese un caracter para buscarlo en la frase:  ");
        String car1 = reader.next();
        for (int i = 0; i< cf1.getTamFrase(); i++) {
            if (car1.equalsIgnoreCase(cf1.getFrase().substring(i, i + 1))){
                contador++;
            }

        }
        if (contador > 0){
            System.out.println(comprobador);
            System.out.println("Su caracter se encuentra en la frase");
        }else {
            System.out.println("Su caracter no se encuentra en la frase");
            System.out.println(comprobador);
        }
    }
}
