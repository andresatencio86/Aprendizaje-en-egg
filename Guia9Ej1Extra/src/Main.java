
import java.util.Scanner;

/*
 * Crea una clase en Java donde declares una variable de tipo array de
Strings que contenga los doce meses del año, en minúsculas. A
continuación, declara una variable mesSecreto de tipo String, y hazla
igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría
ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:
febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!To change this license header, choose License Headers in Project Properties.

 */
public class Main {


    public static void main(String[] args) {
      

                Scanner leer = new Scanner(System.in).useDelimiter("\n");
                
                String ingresarMes= "";
                String [] mesSecreto= new String[12];
                mesSecreto[7]= "Julio";
                System.out.println("Adivine el mes secreto y le diremos si es el correcto");
                ingresarMes=leer.nextLine();
                while (!"Julio".equalsIgnoreCase(ingresarMes)){
                    System.out.println("No adivinaste.Elegi otro mes");
                    ingresarMes=leer.nextLine();
                    if (ingresarMes.equalsIgnoreCase("Julio")){
                        
                    }else{
                        
                    }
                    System.out.println("adivinaste juan carlos!!");
                }  
                }
     }
                        
    

