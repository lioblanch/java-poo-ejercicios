package Servicios;

import Entidades.Persona;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ServicioFecha {
    static Scanner reader = new Scanner(System.in);
    public Persona crearPersona(){

        Persona ps = new Persona();
        System.out.println("Ingrese el nombre de la persona: ");
        ps.setNombre(reader.nextLine());

        System.out.println("Ingrese el dia de cumpleaños dd");
        int dia = reader.nextInt();
        System.out.println("Ingrese el mes de cumpleaños MM");
        int mes = reader.nextInt();
        System.out.println("Ingrese el año de cumpleaños YYYY");
        int anio = reader.nextInt();

        Date calendario1 = new Date(anio -1900, mes, dia);
        Calendar dt = new GregorianCalendar(anio, mes, dia);


        ps.setFechaNacimiento(calendario1);

        return ps;
    }

    public void calcularEdad(Persona ps){

        Calendar hoy = Calendar.getInstance();



    }
}
