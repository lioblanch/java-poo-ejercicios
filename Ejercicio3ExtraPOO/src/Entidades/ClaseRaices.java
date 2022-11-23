package Entidades;

public class ClaseRaices {
    private double coeficienteA;
    private double coeficienteB;
    private double coeficienteC;

    public double discriminate;

    public ClaseRaices() {
    }

    public ClaseRaices(double coeficienteA, double coeficienteB, double coeficienteC, double discriminate) {
        this.coeficienteA = coeficienteA;
        this.coeficienteB = coeficienteB;
        this.coeficienteC = coeficienteC;
        this.discriminate = discriminate;
    }

    public double getCoeficienteA() {
        return coeficienteA;
    }

    public void setCoeficienteA(double coeficienteA) {
        this.coeficienteA = coeficienteA;
    }

    public double getCoeficienteB() {
        return coeficienteB;
    }

    public void setCoeficienteB(double coeficienteB) {
        this.coeficienteB = coeficienteB;
    }

    public double getCoeficienteC() {
        return coeficienteC;
    }

    public void setCoeficienteC(double coeficienteC) {
        this.coeficienteC = coeficienteC;
    }

    public double getDiscriminate() {
        return discriminate;
    }

    public void setDiscriminate(double discriminate) {
        this.discriminate = discriminate;
    }
}
