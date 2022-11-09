/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
*/



package ejercicio6poo;

import Entidades.ClaseCafetera;
import Servicios.ServicioCafetera;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ServicioCafetera c1 = new ServicioCafetera();
        ClaseCafetera cas1 = c1.llenarCafetera();


        int op;

        do {
                c1.menu(cas1);
                op = reader.nextInt();

                switch (op){

                    case 1:
                        c1.servirTaza(cas1);
                        break;
                    case 2:
                        c1.vaciarCafetera(cas1);
                        break;
                    case 3:
                        c1.agregarCafe(cas1);
                        break;
                    case 4:
                        c1.cantidadDeCafe(cas1);
                        break;
                    case 5:
                        System.out.println("Saliendo del menu de la cafetera");
                        c1.salto();
                        System.out.println("FIN PROCESO");
                        System.out.println("");
                        System.out.println("");

                }
        }while(op!=5);
    }
}