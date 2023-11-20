
import java.util.Scanner;

/**
 *
 * @author lldan
 */
public class Problema_3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario las coordenadas del centro de la circunferencia
            System.out.print("Ingrese la coordenada x del centro de la circunferencia: ");
            double x1 = scanner.nextDouble();

            System.out.print("Ingrese la coordenada y del centro de la circunferencia: ");
            double y1 = scanner.nextDouble();

            // Solicitar al usuario el radio de la circunferencia
            System.out.print("Ingrese el radio de la circunferencia: ");
            double r = scanner.nextDouble();

            // Solicitar al usuario las coordenadas del punto a verificar
            System.out.print("Ingrese la coordenada x del punto a verificar: ");
            double x2 = scanner.nextDouble();

            System.out.print("Ingrese la coordenada y del punto a verificar: ");
            double y2 = scanner.nextDouble();

            // Calcular la distancia entre el centro de la circunferencia y el punto dado
            double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

            // Verificar si el punto está dentro de la circunferencia
            if (distancia <= r) {
                System.out.println("El punto está dentro de la circunferencia.");
            } else {
                System.out.println("El punto está fuera de la circunferencia.");
            }
        }

    }
}