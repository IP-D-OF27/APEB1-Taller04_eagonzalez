/**
 * Ejercicio 02: Generar un algoritmo que permite ingresar los gastos de tres 
 * hijos de un padre de familia; calcular y mostrar el total de gastos de los 
 * hijos del padre de familia.
 * @author Emilio González
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int gastohijo1, gastohijo2, gastohijo3, totalGastos;
        System.out.println("Deme los 3 gastos: ");
        gastohijo1 = tcl.nextInt();
        gastohijo2 = tcl.nextInt();
        gastohijo3 = tcl.nextInt();
        totalGastos = (gastohijo1 + gastohijo2 + gastohijo3);
        System.out.println("Gasto total: " + totalGastos);
    }
}
/***
 * EVIDENCIA DEL RUN:
 *  run:
    Deme los 3 gastos: 
    22
    33
    55
    Gasto total: 110
    BUILD SUCCESSFUL (total time: 14 seconds)
 */