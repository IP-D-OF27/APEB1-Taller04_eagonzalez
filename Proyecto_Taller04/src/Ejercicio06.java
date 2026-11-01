/**
 * Ejercicio 06: Generar un solución que permita calcular y mostrar el pago 
 * mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto del 
 * préstamo y el interés mensual a cobrar.
 * @author Emilio González
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double montoPrestamo, interesMensual;
        double interesTotal, pagoMensualTotal;
        System.out.println("Ingrese el monto del prestamo: ");
        montoPrestamo = tcl.nextDouble();
        System.out.println("Ingrese el interes mensual: ");
        interesMensual = tcl.nextDouble();
        interesTotal = montoPrestamo * interesMensual * 12;
        pagoMensualTotal = (montoPrestamo + interesTotal) / 12;
        System.out.printf("El pago mensual del prestamo es: " + pagoMensualTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
 *  run:
    Ingrese el monto del prestamo: 
    100
    Ingrese el interes mensual: 
    9
    El pago mensual del prestamo es: 908.3333333333334
    * BUILD SUCCESSFUL (total time: 8 seconds)
 */