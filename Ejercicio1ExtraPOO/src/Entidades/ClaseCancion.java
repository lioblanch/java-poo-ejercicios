package Entidades;

public class ClaseCancion {
    private String titulo;
    private String autor;

    public ClaseCancion() {
    }

    public ClaseCancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "ClaseCancion{" +
                "titulo='" + this.titulo + '\'' +
                ", autor='" + this.autor + '\'' +
                '}';
    }
}
