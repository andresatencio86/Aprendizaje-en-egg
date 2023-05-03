/*
 * Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).
 */
package servicio;

import java.util.Date;
import java.util.Scanner;


public class FechaService {



    Scanner leer = new Scanner(System.in);

    public Date fechaNacimiento() {
        System.out.print("Ingrese el dia de su nacimiento: ");
        int d = leer.nextInt();
        while (d > 31 || 1 > d) {
            System.out.print("Ingrese el dia de su nacimiento entre 1 y 31: ");
            d = leer.nextInt();
        }
        System.out.print("Ingrese el mes de su nacimiento: ");
        int m = leer.nextInt();
        while (m > 12 || 1 > m) {
            System.out.print("Ingrese el mes de su nacimiento entre 1 y 12: ");
            m = leer.nextInt();
        }
        System.out.print("Ingrese el año de su nacimiento: ");
        int a = leer.nextInt();

        return new Date(a-1900,m-1,d);
    }

    public Date fechaActual() {
        return new Date();
    }

    public long edad(Date nac, Date actual) {
        return (actual.getTime() - nac.getTime()) / 31556900000L;
    }
}


