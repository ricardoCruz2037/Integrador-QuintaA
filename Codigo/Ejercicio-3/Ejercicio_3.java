
import java.util.Scanner;

/**
 * PROBLEMA 3
 * Dada una circunferencia con centro en el punto C con coordenadas (x1, y1) y radio r, evaluar si un punto T 
 * con coordenadas (x2, y2) está dentro del área de la circunferencia.
 * @author Daniel Aldana Lopez
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario las coordenadas del centro de la circunferencia
            System.out.print("Ingrese la coordenada x1 del centro de la circunferencia: ");
            double x1 = scanner.nextDouble();

            System.out.print("Ingrese la coordenada y1 del centro de la circunferencia: ");
            double y1 = scanner.nextDouble();

            // Solicitar al usuario el radio de la circunferencia
            System.out.print("Ingrese el radio de la circunferencia: ");
            double r = scanner.nextDouble();

            // Solicitar al usuario las coordenadas del punto a verificar
            System.out.print("Ingrese la coordenada x2 del punto a verificar: ");
            double x2 = scanner.nextDouble();

            System.out.print("Ingrese la coordenada y2 del punto a verificar: ");
            double y2 = scanner.nextDouble();

            // Calcular la distancia entre el centro de la circunferencia y el punto dado
            double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

            // Verificar si el punto está dentro de la circunferencia. Si la distancia es menor o igual a 
            // El radio el punto T esta dentro de la circunferencia. De lo contrario el punto T esta fuera.
            if (distancia <= r) {
                System.out.println("El punto T está dentro de la circunferencia.");
            } else {
                System.out.println("El punto T está fuera de la circunferencia.");
            }
        }

    }
}
