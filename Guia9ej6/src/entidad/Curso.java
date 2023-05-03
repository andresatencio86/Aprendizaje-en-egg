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


 */
package entidad;

public class Curso {
    
    private int nombreCurso;
    private double cantidadHorasPorDia;
     private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumno= new String[5];

    public Curso() {
    }

    public Curso(int nombreCurso, double cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora, String[] alumno) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumno= alumno;
    }

    public int getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(int nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(double cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumno() {
        return alumno;
    }

    public void setAlumno(String[] alumno) {
        this.alumno = alumno;
    }

  
           
     
}
