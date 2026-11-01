/**
 * Ejercicio 10: El programa debe calcular el área del polígono. La figura se 
 * compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales 
 * (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un 
 * rectángulo (D) cuyo ancho mide lo mismo que uno de los lados del cuadrado, 
 * mientras que la altura mide lo mismo que la altura de los triángulos. Se pide
 * que haga un programa que calcule el área total.
    Por cultura general, sabemos que el área de un rectángulo se calcula 
    multiplicando su base por su altura; el área de un triángulo rectángulo 
    se calcula multiplicando su base por su altura, y luego dividiendo el 
    resultado entre dos; finalmente, el área de un cuadrado se calcula 
    elevando al cuadrado la medida de uno de sus lados.
 * @author Emilio González
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double lado, altura, areaA, areaB, areaC, areaD, areaE, areaTotal;
        System.out.println("Ingrese el lado del cuadrado: ");
        lado = tcl.nextDouble();
        System.out.println("Ingrese la altura de los triangulos");
        altura = tcl.nextDouble();
        areaA = lado * lado;
        areaB = (lado * altura) / 2;
        areaC = (lado * altura) / 2;
        areaD = lado * altura;
        areaE = (lado * altura) / 2;
        areaTotal = areaA + areaB + areaC + areaD + areaE;
        System.out.printf("Area del cuadrado A: %.2f%n", areaA);
        System.out.printf("Area del triangulo B: %.2f%n", areaB);
        System.out.printf("Area del triangulo C: %.2f%n", areaC);
        System.out.printf("Area del rectangulo D: %.2f%n", areaD);
        System.out.printf("Area del triangulo E: %.2f%n", areaE);
        System.out.printf("Area total: %.2f%n", areaTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
 *  run:
    Ingrese el lado del cuadrado: 
    12
    Ingrese la altura de los triangulos
    6
    Area del cuadrado A: 144.00
    Area del triangulo B: 36.00
    Area del triangulo C: 36.00
    Area del rectangulo D: 72.00
    Area del triangulo E: 36.00
    Area total: 324.00
    BUILD SUCCESSFUL (total time: 7 seconds)
     */