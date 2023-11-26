import java.util.Scanner;

/*Autor:Valeria Soto Hernandez 
Problematica: Dada una ecuación cuadratica regresar los valores de las raíces en caso de que estén sobre el
conjunto de los números reales, en caso contrario indicar que la solución esta en el conjunto de
los números complejos.
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        // Declarar las variables que se van a usar en el programa
        double a, b, c, raiz1, raiz2, discrminante;
        // Obtener datos
        System.out.println("Ingresa los coeficientes de la ecuacion cuadratica");
        System.out.print("a: ");
        a = dato.nextDouble();
        System.out.print("b: ");
        b = dato.nextDouble();
        System.out.print("c: ");
        c = dato.nextDouble();
        // Calcular el discriminante
        discrminante = Math.pow(b, 2) - 4 * a * c;
        // Condiciones
        if (discrminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La ecuacion tiene una raiz real: ");
            System.out.println("Raiz: " + raiz);
        } else if (discrminante > 0) {
            raiz1 = (-b + Math.sqrt(discrminante)) / (2 * a);
            raiz2 = (-b - Math.sqrt(discrminante)) / (2 * a);
            System.out.println("La ecuacion tiene dos raices reales: ");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        } else {
            System.out.println("Las raices son numeros complejos");
        }
    }
}
