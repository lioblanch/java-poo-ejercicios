package Entidades;

public class ClaseNIF {

    private int dni;
    private char letra;

    public ClaseNIF() {
    }

    public ClaseNIF(int dni, char letra) {


        this.letra = letra;

        while (dni != 8){
            System.out.println("Ingrese un numero valido");
        }
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
}
