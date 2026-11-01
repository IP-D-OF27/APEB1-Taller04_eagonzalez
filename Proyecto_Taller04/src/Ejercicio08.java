/**
 * Ejercicio 08: Se debe generar una solución que permita calcular y mostrar el 
 * valor total a pagar mensual de servicios digitales de una persona. Los 
 * servicios digitales son: netflix, youtube premium, dropbox, spotify. Si la 
 * persona es menor a 30 años se descuenta el 20% del total mensual.
 * @author Emilio González
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args) {
        double netflix, youtube, dropbox, spotify, total, descuento, 
                totaldescuento;
        int edad;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese su pago mensual de Netflix: ");
        netflix = tcl.nextDouble();
        System.out.println("Ingrese su pago mensual de Youtube Premium: ");
        youtube = tcl.nextDouble();
        System.out.println("Ingrese su pago mensual de Dropbox: ");
        dropbox = tcl.nextDouble();
        System.out.println("Ingrese su pago mensual de Spotify: ");
        spotify = tcl.nextDouble();
        System.out.println("Ingrese su edad: ");
        edad = tcl.nextInt();
        if (edad < 30) {
            System.out.println("A usted se le descuenta el 20% del total mensual");
            total = (netflix + youtube + dropbox + spotify);
            descuento = (total * 0.20);
            totaldescuento = (total - descuento);
            System.out.println("Total: " + totaldescuento);
        } else { 
            System.out.println("No se le aplica descuento");
            total = (netflix + youtube + dropbox + spotify);
            System.out.println("Total: " + total);
    }
    }
}
/***
 * EVIDENCIA DEL RUN:
 *  run:
    Ingrese su pago mensual de Netflix: 
    20
    Ingrese su pago mensual de Youtube Premium: 
    11
    Ingrese su pago mensual de Dropbox: 
    15
    Ingrese su pago mensual de Spotify: 
    7
    Ingrese su edad: 
    22
    A usted se le descuenta el 20% del total mensual
    Total:42.4
    //BUILD SUCCESSFUL (total time: 16 seconds)
    */