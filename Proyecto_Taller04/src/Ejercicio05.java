/**
 * Ejercicio 05: Generar un algoritmo que permita calcular y mostrar el costo 
 * de una computadora de escritorio. La misma es comprada por partes; CPU, 
 * teclado, pantalla, ratón.
 * @author Emilio González
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        int costoCPU, costoTeclado, costoPantalla, costoRaton, totalPC;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese el costo de la CPU: ");
        costoCPU = tcl.nextInt();
        System.out.println("Ingrese el costo del teclado: ");
        costoTeclado = tcl.nextInt();
        System.out.println("Ingrese el costo de la pantalla: ");
        costoPantalla = tcl.nextInt();
        System.out.println("Ingrese el costo del raton: ");
        costoRaton = tcl.nextInt();
        totalPC = (costoCPU + costoTeclado + costoPantalla + costoRaton);
        System.out.println("El total de lo que costaria su computadora es: " + totalPC);
    }
}
/***
 * EVIDENCIA DEL RUN:
 *  run:
    Ingrese el costo de la CPU: 
    320
    Ingrese el costo del teclado: 
    180
    Ingrese el costo de la pantalla: 
    200
    Ingrese el costo del raton: 
    27
    El total de lo que costaria su computadora es: 727
    BUILD SUCCESSFUL (total time: 26 seconds)
 */