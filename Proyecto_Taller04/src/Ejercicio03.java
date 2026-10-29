/**
 * Ejercicio 03: Se desea desarrollar un algoritmo que permita mostrar la tabla 
 * de multiplicar de un número ingresado por el usuario; solo en el caso que el 
 * valor del número esté entre 2 y 6. No use aún, ciclos repetitivos.
 * @author Emilio González
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numero, tablamultiplicar;
        System.out.println("Deme un numero entre 2 y 6 para realizar una tabla de multiplicar: ");
        numero = tcl.nextInt();
        if (numero >= 2 && numero <= 6) {
                System.out.println("Tabla de multiplicar de: " + numero);
                System.out.println(numero + " * 1 = " + (numero * 1));
                System.out.println(numero + " * 2 = " + (numero * 2));
                System.out.println(numero + " * 3 = " + (numero * 3));
                System.out.println(numero + " * 4 = " + (numero * 4));
                System.out.println(numero + " * 5 = " + (numero * 5));
                System.out.println(numero + " * 6 = " + (numero * 6));
                System.out.println(numero + " * 7 = " + (numero * 7));
                System.out.println(numero + " * 8 = " + (numero * 8));
                System.out.println(numero + " * 9 = " + (numero * 9));
                System.out.println(numero + " * 10 = " + (numero * 10));
            }
        else {
            System.out.println("Error: El numero debe estar entre 2 y 6.");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 *  run:
    Deme un numero entre 2 y 6 para realizar una tabla de multiplicar: 
    4
    Tabla de multiplicar de: 4
    4 * 1 = 4
    4 * 2 = 8
    4 * 3 = 12
    4 * 4 = 16
    4 * 5 = 20
    4 * 6 = 24
    4 * 7 = 28
    4 * 8 = 32
    4 * 9 = 36
    4 * 10 = 40
    BUILD SUCCESSFUL (total time: 5 seconds)
 */