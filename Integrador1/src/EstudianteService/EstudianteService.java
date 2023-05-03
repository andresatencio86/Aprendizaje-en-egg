/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstudianteService;

import Estudiante.Estudiante;
import java.util.Scanner;


public class EstudianteService {
    
     Scanner leer = new Scanner(System.in);

    public Estudiante crearEst() {
        System.out.println("ingrese el nombre del alumno");
        String estudiante = leer.nextLine();
        System.out.println("ingrese la nota del estudiante");
        double nota = leer.nextDouble();
        leer.nextLine();
        return new Estudiante(estudiante, nota);
    }

    /* public static Estudiante crearEst(){
     Estudiante e = new Estudiante();
        importar la clase
    System.out.println("ingrese el nombre del alumno");
    e.setNombre(leer.nextLine());
    System.out.println("ingrese la nota del estudiante");
    e.setNota(leer.nextDouble());
        return e;
    de este modo tambien podemos crear los estudiantes e incluso ahorro variables
        }
     */

    // Calcular y mostrar el promedio de notas de todo el curso
    public double promedio(Estudiante[] alumnos){
        double aux = 0;
        for (int i = 0; i < alumnos.length; i++){
            aux += alumnos[i].getNota();
        }
        return (aux/alumnos.length);
    }

        //Retornar otro arreglo con los nombre de los alumnos que recibieron una
        //nota mayor al promedio del curso

        public String[] mayorPromedio(Estudiante[] alumnos){
            int dimension = 0;

            for (int i =0; i < alumnos.length; i++){
                if (promedio(alumnos) < alumnos[i].getNota()){
                    dimension ++;
                }
            }
            String[] alumnosTipoSeba = new String[dimension];
            int contador = 0;
            for (int i =0; i < alumnos.length; i++){
                if (promedio(alumnos) < alumnos[i].getNota()){
                    alumnosTipoSeba[contador] = alumnos[i].getNombre();
                    contador ++;
                }
            }
            return alumnosTipoSeba;
        }
        /*Por Ãºltimo, deberemos mostrar todos los estudiantes con una nota
        mayor al promedio.*/
            public void mostrarSebas(Estudiante[] alumnos){

                for (int i = 0; i < mayorPromedio(alumnos).length; i++ ){
                    System.out.println("los alumnos capos son: " + mayorPromedio(alumnos)[i]);
                }

            }
        }

    

