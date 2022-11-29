package Entidades;

import java.util.Scanner;

public class ClasesTiempo {

    static Scanner reader = new Scanner(System.in);
    private int hora;
    private int minutos;
    private int segundos;

    public ClasesTiempo() {
    }

    public ClasesTiempo(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }


    public void imprimirHoraCompleta() throws InterruptedException {

            System.out.println("Ingrese la hora: ");

            this.hora = reader.nextInt();



            System.out.println("Ingrese los minutos: ");
            this.minutos = reader.nextInt();



            System.out.println("Ingrese los segundos: ");
            this.segundos = reader.nextInt();

            while (true) {
            if (this.hora < 10) {
                System.out.print("0");

            }
            System.out.print(this.hora + ":");

            if (this.minutos < 10) {
                System.out.print("0");
            }

            System.out.print(this.minutos + ":");

            if (this.segundos < 10) {

                System.out.print("0");
            }

            System.out.println(this.segundos );

                this.segundos ++;

                if(this.segundos == 60){
                    this.segundos = 0;
                    this.minutos ++;
                }
                if(this.minutos == 60){
                    this.minutos = 0;
                    this.hora ++;
                }
                if(this.hora == 24){
                    this.hora = 0;

                }



            Thread.sleep(1000);
        }
    }


}
