/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package ejercicio1poo;

import ClaseEjercicio1.ClaseLibro;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Ejercicio1POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner reader = new Scanner(System.in);
        int isbn;
        String autor;
        String titulo;
        int numPaginas;
        int numLibros;
        //Se ingresa la cantidad de valores que requiere 
        System.out.println("Ingrese el numero de libros a registrar");
        numLibros = reader.nextInt();

        ClaseLibro libro[] = new ClaseLibro[numLibros];

        for (int i = 0; i < libro.length; i++) {
            System.out.println("\n Digite las caracteristicas del libro: " + (i + 1));
            System.out.println("Introduzca el ISBN: ");
            isbn = reader.nextInt();
            reader.nextLine();
            System.out.println("Introduzca el autor del libro: ");
            autor = reader.nextLine();
            System.out.println("Introduzca el titulo del libro: ");
            titulo = reader.nextLine();
            System.out.println("Introduzca el número de Paginas: ");
            numPaginas = reader.nextInt();

            libro[i] = new ClaseLibro(isbn, titulo, autor, numPaginas);
        }
        //Ciclo for para la impresion de la cantidad de libros ingresados
        for (int i = 0; i < libro.length; i++) {

            System.out.println(libro[i].getMostrarDatos());
        }
    }

}
