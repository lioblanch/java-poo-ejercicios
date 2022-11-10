package Servicios;

import Entidades.ClasePersona;
import java.util.Scanner;
public class ServicioPersona {
    Scanner reader = new Scanner(System.in).useDelimiter("\n");
    public ClasePersona crearPersona(){

        ClasePersona cp1 = new ClasePersona();

        System.out.println("Ingrese el nombre de la persona");
        cp1.setNombre(reader.nextLine());
        do {
            System.out.println("Ingrese el sexo de la persona "
                    + "\n (H) para hombre " + "\n (M)  para mujer"
                    + "\n (O) para otros");
            cp1.setSexo(reader.nextLine());
        }while(!"h".equalsIgnoreCase(cp1.getSexo())&&!"o".equalsIgnoreCase(cp1.getSexo())&&!"m".equalsIgnoreCase(cp1.getSexo())
        );
        System.out.println("Ingrese la edad de la persona");
        cp1.setEdad(reader.nextInt());
        System.out.println("Ingrese el peso de la persona: ");
        cp1.setPeso(reader.nextInt());
        System.out.println("Ingrese la altura de la persona: ");
        cp1.setAltura(reader.nextFloat());
        reader.nextLine();
        return cp1;
    }

    /**
     * Este metodo calcula el Indice de masa Corporal 
     * @param cp1
     */
    public void calculandoIMC(ClasePersona cp1){

        float imc1 = (cp1.getPeso()/(cp1.getAltura() * cp1.getAltura()));

       if (imc1 >20){
           cp1.setImc(-1);

       }else if ((imc1 >= 20) && (imc1<=25)){
           cp1.setImc(0);
       } else if (imc1>25){
           cp1.setImc(1);
       }
    }

    public void esMayordeEdad(ClasePersona cp1){

        if (cp1.getEdad()>= 18 ){
            cp1.setMym(true);
            System.out.println("Es mayor de edad");

        }else {
            cp1.setMym(false);
            System.out.println("Es menor de edad");
        }
    }
}
