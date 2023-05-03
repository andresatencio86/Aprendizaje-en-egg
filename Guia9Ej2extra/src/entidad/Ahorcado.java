/*
 * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual
deberá contener como atributos, un vector con la palabra a buscar, la
cantidad de letras encontradas y la cantidad jugadas máximas que
puede realizar el usuario. 
 */
package entidad;


public class Ahorcado {
    private  char[] palabra;   ///lo pongo a char como vector, porque voy a ingresar de a una letra, y voy a definir la palabra en servicios
    private int cdadLetrasEncontradas;
    private int cdadMaxJugada;

    public Ahorcado() {
    }

    public Ahorcado(int cdadLetrasEncontradas, int cdadMaxJugada, char[] palabra) {
        this.cdadLetrasEncontradas = cdadLetrasEncontradas;
        this.cdadMaxJugada = cdadMaxJugada;
        this.palabra= palabra;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getCdadLetrasEncontradas() {
        return cdadLetrasEncontradas;
    }

    public void setCdadLetrasEncontradas(int cdadLetras) {
        this.cdadLetrasEncontradas = cdadLetras;
    }

    public int getCdadMaxJugada() {
        return cdadMaxJugada;
    }

    public void setCdadMaxJugada(int cdadMaxJugada) {
        this.cdadMaxJugada = cdadMaxJugada;
    }

    public void getCdadMaxJugada(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
