package Servicios;

import Entidades.ClaseAhorcado;

import java.util.Scanner;

public class ServicioAhorcado {
    Scanner reader = new Scanner(System.in);
    public ClaseAhorcado altaAhorcado(){


        ClaseAhorcado ca = new ClaseAhorcado();


        System.out.println("Jugador 1 Ingrese la palabra: ");
        ca.setPalabra1(reader.nextLine());



        System.out.println("Cuantas oportunidades tiene: (Se sugieren 6 intentos)");
        ca.setJugadas(reader.nextInt());

        reader.nextLine();
        ca.setTamPalabra(ca.getPalabra1().length());
        String [] aux = new String[ca.getTamPalabra()];

        for (int i = 0; i < ca.getTamPalabra(); i++) {
            aux[i] = ca.getPalabra1().substring(i, i+1);
        }
        ca.setPalabra(aux);

        return ca;
    }



    public void buscarLetra(ClaseAhorcado ca) {

        String[] rayas = new String[ca.getTamPalabra()];

        for (int i = 0; i < ca.getTamPalabra(); i++) {

            rayas[i] = "_";
        }
        for (int i = 0; i < ca.getTamPalabra(); i++) {

            System.out.print(rayas[i]);
        }
        do {
            System.out.println("Ingrese una letra a buscar: ");
            ca.setLetra(reader.nextLine());
            int contador = 0;
            for (int i = 0; i < ca.getTamPalabra(); i++) {

                if (ca.getLetra().equalsIgnoreCase(ca.getPalabra1().substring(i, i + 1))) {
                    contador += 1;
                    rayas[i] = ca.getLetra();

                }
                System.out.print(rayas[i]);
            }
        } while(ca.getJugadas() != 6);
    }


    }

