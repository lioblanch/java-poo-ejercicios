/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package ClaseEjercicio1;


public class ClaseLibro {
    private int isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    public ClaseLibro() {
    }

    public ClaseLibro(int isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    @Override
    public String toString() {
        return "ClaseLibro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + '}';
    }
    //En este metodo retornamos la informacion ingresada en el main.
    public String getMostrarDatos(){
        return "\nISBN: "+ isbn + "\n Autor: " + autor + "\n Titulo: " + titulo 
                + "\n Numero de paginas: " + numPaginas + "\n";
    }
}
