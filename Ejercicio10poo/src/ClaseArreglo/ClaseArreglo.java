package ClaseArreglo;


import java.text.DecimalFormat;
import java.util.Arrays;

public class ClaseArreglo {

    private double []arreglo1 = new double[50];
    private double arreglo2[] = new double[20];

    public ClaseArreglo() {
    }

    public ClaseArreglo(double[] arreglo1, double[] arreglo2) {
        this.arreglo1 = arreglo1;
        this.arreglo2 = arreglo2;
    }

    public void llenarArreglos(){


        DecimalFormat df = new DecimalFormat("###.##");
        for (int i = 0; i<arreglo1.length; i++){

            arreglo1[i]= (Math.random()*(50-5)) + 5;

        }

        Arrays.sort(arreglo1);
        for(double i: arreglo1){
            System.out.println(df.format(i));
        }


        for (int i=0 ; i<arreglo2.length; i++) {


            arreglo2[i] = arreglo1[i];
        }

        for (int i= 0; i<10; i++){

            Arrays.fill(arreglo2, 10, 20, 0.5);
        }

        System.out.println("");
        System.out.println("");

        for (double i: arreglo2){
            System.out.println(df.format(i));
        }
        }
}



