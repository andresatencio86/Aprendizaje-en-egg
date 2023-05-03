/*) Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.
e) Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos
f) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.
 * 
 */
package servicio;

import entidad.Curso;
import java.util.Scanner;

public class CursoService {

     static Scanner leer = new Scanner(System.in).useDelimiter("\n");   ////static para 

    public static Curso crearCurso() {
        Curso curso = new Curso();
        System.out.println(" Ingrese el  nombre del curso");
        curso.setNombreCurso(leer.nextInt());
        System.out.println("ingresa la cantidad de hs por dia");
        curso.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingresa la cantidad de dias a la semana");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("ingresa que turno es, mañana o tarde");
        curso.setTurno(leer.next());
        while (!curso.getTurno().equalsIgnoreCase("mañana") && !curso.getTurno().equalsIgnoreCase("tarde")) {
            System.out.println("Ingrese correctamente el turno");
            curso.setTurno(leer.next());
        }
        System.out.println("Ingrese el precio por hora");
        curso.setPrecioPorHora(leer.nextDouble());
        System.out.println("ingrese los alumnos");
        curso.setAlumno (cargarAlumnos(curso));
        return curso;
    }
    public static String[] cargarAlumnos(Curso c){
      String[] alumnoAux= new String[c.getAlumno().length];
        for (int i = 0; i < c.getAlumno().length; i++) {
            alumnoAux[i]=leer.next();
        }
    return alumnoAux;
}
    public static double calcularGanancia(Curso g){
   double ganancia= g.getCantidadHorasPorDia()*g.getPrecioPorHora()*g.getCantidadDiasPorSemana()*g.getAlumno().length;
   return ganancia;
    }
}

