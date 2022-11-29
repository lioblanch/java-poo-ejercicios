/*Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

 */





package ejercicio9poo;

import Entidades.ClaseMatematica;
import Servicios.ServicioMatematica;



public class Main {
    public static void main(String[] args){


        ServicioMatematica sm = new ServicioMatematica();
        ClaseMatematica cm = new ClaseMatematica();
        cm.setNumero1(Math.random()*11+1);
        cm.setNumero2(Math.random()*11+1);


        sm.devolverMayor(cm);
        sm.calcularPotencia(cm);
        sm.calcularRaiz(cm);

    }


}