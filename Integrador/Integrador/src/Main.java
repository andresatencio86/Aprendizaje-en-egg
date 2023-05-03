public class Main {
    public static void main(String[] args) {
        EstudianteService e = new EstudianteService();
        Estudiante[] alumnos = new Estudiante[4];
        for (int i = 0 ; i < alumnos.length; i++){
            alumnos[i] = e.crearEst();
        }
        e.promedio(alumnos);
        System.out.println("la cantidad de alumnos capos es: " + e.mayorPromedio(alumnos).length);
        e.mostrarSebas(alumnos);

    }
}