/*
 * Definir los siguientes métodos en
AhorcadoService:






● Método juego(): el método juego se encargará de llamar todos los
métodos previamente mencionados e informará cuando el usuario
descubra toda la palabra o se quede sin intentos. Este método se
llamará en el main.
Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades

 */
package servicio;

import entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    /*   ● Metodo crearJuego(): le pide la palabra al usuario y cantidad de
jugadas máxima. Con la palabra del usuario, pone la longitud de la
palabra, como la longitud del vector. Después ingresa la palabra en el
vector, letra por letra, quedando cada letra de la palabra en un índice
del vector. Y también, guarda la cantidad de jugadas máximas y el
valor que ingresó el usuario.
     */
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static Ahorcado crearJuego() {    ///aca cuando creo el objeto, tiene que tener el mismo nombre que en la entidad..sino, imposible traerlo
        Ahorcado juego = new Ahorcado();
        System.out.println("Vamos a comenzar a jugar al ahorcado");
        System.out.println("-----------------------------");
        System.out.println("ingresa la palabra a adivinar");
        String palabra = leer.nextLine();
        System.out.println("ingresa la cantidad máxima de intentos que queres tener como posibilidad de adivinar.");
        juego.setCdadMaxJugada(leer.nextInt());

        char[] palabraAux = new char[palabra.length()];  //aca creo el vector, con la palabra y su longitud

        for (int i = 0; i < palabra.length(); i++) {
            palabraAux[i] = palabra.charAt(i);    ///hago que la recorra de no en uno, letra por letra
        }
        juego.setPalabra(palabraAux);  ///seteo mi palabra a adivinar

        return juego;
    }

    /*● Método longitud(): muestra la longitud de la palabra que se debe
encontrar. Nota: buscar como se usa el vector.length.*/
    public static int longitud(Ahorcado juego) {
        return juego.getPalabra().length;

    }

    /*● Método buscar(letra): este método recibe una letra dada por el
usuario y busca si la letra ingresada es parte de la palabra o no.
También informará si la letra estaba o no.*/
    public static boolean buscar(Ahorcado juego, char letra) {
        for (int i = 0; i < juego.getPalabra().length; i++) {
            if (letra == juego.getPalabra()[i]) {

                return true;
            }
        }
        return false;
    }

    /*● Método encontradas(letra): que reciba una letra ingresada por el
usuario y muestre cuantas letras han sido encontradas y cuántas le
faltan. Este método además deberá devolver true si la letra estaba y
false si la letra no estaba, ya que, cada vez que se busque una letra
que no esté, se le restará uno a sus oportunidades.*/
    public static int encontradas(Ahorcado juego, char letra) {
        for (int i = 0; i < juego.getPalabra().length; i++) {
            if (letra == juego.getPalabra()[i]) {
                juego.setCdadLetrasEncontradas(juego.getCdadLetrasEncontradas() + 1);
            } else {
                juego.getCdadMaxJugada(juego.getCdadMaxJugada() - 1);
            }
            System.out.println("te quedan " + juego.getCdadMaxJugada() + "intentos");
        }
        return juego.getCdadLetrasEncontradas();
    }

    /*● Método intentos(): para mostrar cuántas oportunidades le queda al
jugador.*/
    
    public static int intentos(Ahorcado juego){
        System.out.println("te quedan " +   return juego.getCdadMaxJugada());
      
    }

    
    
}
