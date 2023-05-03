
import entidad.Curso;
import servicio.CursoService;

/*
 * Un profesor particular está dando cursos para grupos de cinco alumnos
y necesita un programa para organizar la información de cada curso.
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un
arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los
siguientes métodos:
a) Un constructor por defecto.
b) Un constructor con todos los atributos como parámetro.
c) Métodos getters y setters de cada atributo.
d

 */
public class Main {

    public static void main(String[] args) {
        Curso A = CursoService.crearCurso(); /// aca lo traigo porque puse el static en el servicio
        System.out.println("la ganancia es " + CursoService.calcularGanancia(A)); ///aca imprimo el numero que tengo para devolver

    }

}
