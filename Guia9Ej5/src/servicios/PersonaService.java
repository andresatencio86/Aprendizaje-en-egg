/*
Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
constructor parametrizado, get y set. Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.

 */
package servicios;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//    a) Método crearPersona que pida al usuario Nombre y fecha de
//nacimiento de la persona a crear. Retornar el objeto Persona creado.
    ///Persona p1=new Persona();   

    public Persona crearPersona() {
        System.out.println("Ingrese su nombre ");
        // p1.setNombre(leer.next());
        String Nombre = leer.nextLine();
        System.out.println("Ingrese el dia de su nacimiento");
        int dia = leer.nextInt();
        while (dia > 31 || 1 > dia) {
            System.out.println("ingrese el dia entre 1 y 31");
            dia = leer.nextInt();
        }
        System.out.println("Ingrese el mes de su nacimiento");
        int mes = leer.nextInt();
        while (mes > 12 || mes < 1) {
            System.out.println("ingrese el mes entre 1 y 12");
            mes = leer.nextInt();
        }
        System.out.println("Ingrese el año de su nacimiento");
        int año = leer.nextInt();
        Date FechaNacimiento = new Date(año - 1900, mes - 1, dia);
        return new Persona(Nombre, FechaNacimiento);
        ///System.out.println("el nombre de la persona es "+ p1.getNombre() + "y su fecha de nacimiento es " + p1.getFechaNacimiento());
    }

//    b) Método calcularEdad que calcule la edad del usuario utilizando el
//atributo de fecha de nacimiento y la fecha actual.
    
    public int calcularEdad(Persona p){
        Date actual= new Date();
        return (int) ((actual.getTime() - p.getFechaNacimiento().getTime()) / 31556900000L);
    }
//    c) Método menorQue recibe como parámetro una Persona y una edad.
//Retorna true si la persona es menor que la edad consultada o false
//en caso contrario.
    public boolean menorQue (Persona p, int edad){
        return calcularEdad(p)<edad;
             
    }
//    d) Método mostrarPersona que muestra la información de la persona
//deseada.
    public void mostrarPersona(Persona p){
        System.out.println("El nombre de la persona es " + p.getNombre());
        System.out.println("la edad de la persona es" + calcularEdad(p));
    }
}


