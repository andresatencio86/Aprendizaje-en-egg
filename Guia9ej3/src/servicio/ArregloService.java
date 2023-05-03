/*
 * Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales. Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.
 */
package servicio;

import java.util.Arrays;


public class ArregloService {
    
      public void inicializarA(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 10;
        }
    }

    public void mostrarArray(double[] array) {
        String str = Arrays.toString(array);    ////aca con  el string muestro el array
        System.out.println(str);
    }

    public double[] ordenarArray(double[] array) {
        Arrays.sort(array);   ///aca lo ordeno de mayor a menor

        double[] aux = new double[array.length];
        int j = aux.length-1;
        for (int i = 0; i < array.length; i++) {
            aux[i] = array[j];
            j--;
        }
        return aux;
    }

    public double[] inicializarB(double[] arrayB, double[] arrayA) {
        if (arrayB.length <= arrayA.length) {
            arrayB = Arrays.copyOf(arrayA, arrayB.length);
            Arrays.fill(arrayB, 10, arrayB.length, 0.5);
        }
        else {
            System.out.println("Error");
        }

        return arrayB;
    }
}

