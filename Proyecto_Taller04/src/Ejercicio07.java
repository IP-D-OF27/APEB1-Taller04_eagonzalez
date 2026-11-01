/**
 * Ejercicio 07: Generar un algoritmo que permita calcular y mostrar el valor a 
 * cancelar de una planilla de luz. Se debe ingresar el valor de costo por 
 * kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario 
 * tiene edad mayor a 65 años, se debe descontar el 10%.
 * @author Emilio González
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoKilovatio, kilovatiosConsumidos;
        double valorTotal, descuento = 0;
        int edad;
        System.out.println("Ingrese el costo por kilovatio/hora: ");
        costoKilovatio = tcl.nextDouble();
        System.out.println("Ingrese los kilovatios consumidos en el mes: ");
        kilovatiosConsumidos = tcl.nextDouble();
        System.out.println("Ingrese la edad del usuario: ");
        edad = tcl.nextInt();
        valorTotal = costoKilovatio * kilovatiosConsumidos;
        if (edad > 65) {
            descuento = valorTotal * 0.10;
            valorTotal = valorTotal - descuento;
            System.out.println("Se aplica un descuento del 10% por adulto mayor.");
        }
        System.out.printf("El valor total a pagar es: " + valorTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
 *  run:
    Ingrese el costo por kilovatio/hora: 
    20
    Ingrese los kilovatios consumidos en el mes: 
    45
    Ingrese la edad del usuario: 
    68
    Se aplica un descuento del 10% por adulto mayor.
    El valor total a pagar es: 810.0BUILD SUCCESSFUL (total time: 15 seconds)
 */