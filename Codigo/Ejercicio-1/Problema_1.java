package javaapplication1;
import java.util.Scanner;
public class Problema1 {
public static void main(String[] args) {
Scanner c= new Scanner(System.in);
//Declarar variables
double x1;
double y1;
double x2;
double y2;
double pendiente;
double Y;
double AnguloEnRadianes;
double AnguloEnGrados;
// Pedir al usuario que introduzca las coordenadas de los puntos A y B
System.out.println("Introduzca las coordenadas del punto A ( x1 y y1 ) :");
x1 = c.nextDouble();
y1 = c.nextDouble();
System.out.println("Introduzca las coordenadas del punto B ( x2 y y2 ):");
x2 = c.nextDouble();
y2 = c.nextDouble();
// Formula para calcular la pendiente (m)
pendiente = (y2 - y1) / (x2 - x1);
System.out.println("La pendiente es: " + pendiente);
// Calcular la ecuación de la recta en forma y = mx + c
Y = y1 - pendiente * x1;
// Imprimir la ecuación de la recta
System.out.println("La ecuación de la recta es: y = " + pendiente + " x + " + Y);
// Calcular el ángulo α que la recta forma con el eje horizontal en radianes
AnguloEnRadianes = Math.atan(pendiente);
// Convertir el ángulo a grados
AnguloEnGrados = Math.toDegrees(AnguloEnRadianes);
// Imprimir el ángulo en grados
System.out.println("El ángulo que forma la recta con el eje horizontal es: " +
AnguloEnGrados + " grados");
}
}
