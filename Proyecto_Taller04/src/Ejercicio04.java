/**
 * Ejercicio 01: Generar un algoritmo que permita calcular y mostrar el valor 
 * de la planilla de teléfono de un casa. Se debe ingresar el costo por minutos,
 * el número de minutos consumidos en el mes.
 * @author Emilio González
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        int costoMinutos, numeroMinutos, valor;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese el costo por minutos: ");
        costoMinutos = tcl.nextInt();
        System.out.println("Ingrese el numero de minutos consumidos en el mes: ");
        numeroMinutos = tcl.nextInt();
        valor = (costoMinutos * numeroMinutos);
        System.out.println("Valor: " + valor);
    }
}
/***
 * EVIDENCIA DEL RUN:
 *  run:
    Ingrese el costo por minutos: 
    12
    Ingrese el numero de minutos consumidos en el mes: 
    22
    Valor: 264
    BUILD SUCCESSFUL (total time: 5 seconds)
 */