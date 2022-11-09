package Entidades;

public class Cuenta {

    private int numeroCuenta;
    private long dni;
    private int saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", dni=" + dni +
                ", saldoActual=" + saldoActual +
                '}';
    }

    public int ingresar(int sumar){

        saldoActual += sumar;
        return saldoActual;
    }

    public int retirar(int restar){

        if (saldoActual>restar){

            saldoActual -=restar;
        }else if((saldoActual < restar) && (saldoActual != 0)){
            System.out.println("El retiro es demasiado grande, saldo insuficiente");
            saldoActual = 0;
        }
        return saldoActual;
    }

    public int retiroRapido(int retiro){

        int aux;

        aux = (saldoActual*20)/100;
        if(saldoActual == 0){

            System.out.println("Saldo insuficiente");
        }else if(aux < retiro){

            System.out.println("Retiro no realizado");
            System.out.println("EL retiro supera el 20% del saldo");
        }else {
            saldoActual += retiro;
        }
        return saldoActual;
    }
}
