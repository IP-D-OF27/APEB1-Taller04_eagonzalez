/**
 * Ejercicio 09: Desarrolle una solución que determine el estado académico de 
 * una persona estudiante en una asignatura universitaria a partir de una 
 * calificación de evaluación continua, una calificación de examen final y un 
 * porcentaje de asistencia. La regla institucional establece que:
    La asistencia mínima debe alcanzarse para ser evaluado
    Existe una nota mínima en el examen final, y
    La nota final se calcula combinando evaluación continua y examen final.
    La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y mostrar 
    la nota final redondeada a un decimal.
 * @author Emilio González
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double evaContinua, califExamen, porcenAsistencia, notaFinal;
        String estado;
        System.out.println("Ingrese su nota de evaluacion continua: ");
        evaContinua = tcl.nextDouble();
        System.out.println("Ingrese su nota del examen final: ");
        califExamen = tcl.nextDouble();
        System.out.println("Ingrese su porcentaje de asistencia: ");
        porcenAsistencia = tcl.nextDouble();
        //Yo usare los siguientes datos para el ejercicio: 
        //Asistencia mínima: 70%.
        //Nota mínima del examen final: 5/10
        //Evaluación continua: 60% de la nota final
        //Examen final: 40% de la nota final
        //Aprobado: nota final igual o superior a 7
        //Supletorio: nota final entre 5 y menos de 7
        //Reprobado: no cumple los requisitos o tiene una nota inferior a 5
        notaFinal = (evaContinua * 0.60) + (califExamen * 0.40);
        if (porcenAsistencia < 70 || califExamen < 5) {
            estado = "Reprobado";
        } else if (notaFinal >= 7) {
            estado = "Aprobado";
        } else if (notaFinal >= 5) {
            estado = "Supletorio";
        } else {
            estado = "Reprobado";
        }
        System.out.println("Estado academico: " + estado);
        System.out.printf("Nota final: %.1f%n" , notaFinal);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
    Ingrese su nota de evaluacion continua: 
    7.9
    Ingrese su nota del examen final: 
    10
    Ingrese su porcentaje de asistencia: 
    70
    Estado academico: Aprobado
    Nota final: 8.7
    * //BUILD SUCCESSFUL (total time: 21 seconds)
    * */