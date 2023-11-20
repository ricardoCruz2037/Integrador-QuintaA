package holaMundo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class problema4Version1 {

	public static void main(String[] args) {
		Scanner datoGuardado = new Scanner(System.in);

		boolean entradaValida = false;

		do {
			try {
				System.out.println(
						"Introduzca el número real entero deseado, ya sea positivo o negativo, para convertirlo a binario: ");
				long numeroUsuario = datoGuardado.nextLong(); // Guardadod de datos ingresados por el usuario de tipo
																// long.

				String binarioResultado; // Declarar variable de tipo string.

				if (numeroUsuario >= 0) { // Si el numero ingresado es mayor a 0
					binarioResultado = Long.toBinaryString(numeroUsuario); // El numero del usuario se invierte a
																			// binario gracias a la funcion
																			// toBinaryString
				} else { // Si el numero del usuario no es mayor a 0 (osease que el numero es menor a 0)
					long complementoA1 = Math.abs(numeroUsuario) - 1; // devuelve el valor absoluto del numero del
																		// usuario, dandonos como resultado el numero en
																		// positivo. A este le restaremos 1.
					String binarioA1 = Long.toBinaryString(complementoA1); // Convertimos a binario la variable
					binarioResultado = invertirBits(binarioA1); // Dentro de la variable binarioResultado, vamos a
																// guardar el resultado de invertirBits, la cual es una
																// funcion que nos permite invertir los bits de nuestro
																// string cinarioA1
				}
				System.out.println("Número en binario: " + binarioResultado); // Muestra el resultado final guardado en
																				// esta variable.
				entradaValida = true; // la variable booleana se vuelve verdadera para terminar con el ciclo do while.

			} catch (InputMismatchException e) {
				System.out.println("Error: Debes introducir un número entero válido.");
				datoGuardado.nextLine(); // En dado caso de que el usuario introdusca un valor diferente a un numero
											// Real entero, se mostrara el mensaje siguienmte y se volvera a saolicitar
											// un nuevo numero
			}
		} while (!entradaValida); // Condicion del bucle

		datoGuardado.close(); // Cierre de nuestro scanner de nombre datoGuardado
	}

	private static String invertirBits(String binario) { // Esta es la funcion que nos permite invertir los bits de
															// nustro array.
		StringBuilder resultado = new StringBuilder(); // Utilizamos StringBuilder para construir la nueva cadena de
														// bits invertidos
		for (char bit : binario.toCharArray()) {
			resultado.append((bit == '0') ? '1' : '0'); //// Agregamos el bit invertido al StringBuilder
		}
		return resultado.toString(); // Dato de retorno, en este caso, la cadena con bits invertidos.
	}

}
