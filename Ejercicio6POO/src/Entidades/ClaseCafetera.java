package Entidades;



public class ClaseCafetera {
    private float capacidadMaxima;
    private float cantidadActual;

    public ClaseCafetera() {
    }

    public ClaseCafetera(float capacidadMaxima, float cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public float getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(float capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public float getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(float cantidadActual) {
        this.cantidadActual = cantidadActual;
    }


    public float llenadoCafetera(){

        capacidadMaxima = cantidadActual;
        return capacidadMaxima;
    }
    public float servirTaza(float a){
        if (a>=capacidadMaxima){

            a = capacidadMaxima;
            System.out.println("------------------------------------------------------------------------");
            System.out.println("La taza de cafe no esta llena, quedo con " + a + "mililitros en la taza");
            System.out.println("------------------------------------------------------------------------");
            capacidadMaxima = 0;
            System.out.println("La cafetera quedo en " + capacidadMaxima + " mililitros");
            cantidadActual = capacidadMaxima;
            return cantidadActual;

        }else {

            capacidadMaxima -= a;
            cantidadActual = capacidadMaxima;
            System.out.println("La taza de cafe esta llena con " + a + "mililitros y quedo con "
                    + cantidadActual + " mililitros en la Cafetera");
            return cantidadActual;
        }
    }

    public void vaciarCafetera(){

        cantidadActual = 0;
    }

    public float agregarCafe(float a){

        capacidadMaxima += a;

        cantidadActual = capacidadMaxima;
        return cantidadActual;
    }
}
