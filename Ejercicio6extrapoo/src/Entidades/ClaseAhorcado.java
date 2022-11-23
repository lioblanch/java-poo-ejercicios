package Entidades;

public class ClaseAhorcado {


    private String [] palabra;

    private String palabra1;

    private String letra;
    private int tamPalabra;
    private int letrasEncontradas = 0;
    private int jugadas;

    public ClaseAhorcado() {
    }

    public ClaseAhorcado(String[] palabra, String palabra1, String letra, int tamPalabra, int letrasEncontradas, int jugadas) {
        this.palabra = palabra;
        this.palabra1 = palabra1;
        this.letra = letra;
        this.tamPalabra = tamPalabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadas = jugadas;
    }

    public String getPalabra1() {
        return palabra1;
    }

    public void setPalabra1(String palabra1) {
        this.palabra1 = palabra1;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }


    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getTamPalabra() {
        return tamPalabra;
    }

    public void setTamPalabra(int tamPalabra) {
        this.tamPalabra = tamPalabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }


}

