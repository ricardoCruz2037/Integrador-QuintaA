/**
 *
 * @author Ricardo López Cruz.
 */
public static void main(String arg[]) {

		Scanner dato = new Scanner(System.in);
		long numeroUsuario, numero;
		long[] numeroBinario;
		boolean entradaValida = false;

		do { // Bucle que asegura la entrada valida.
			try { // Manejo de excepciones en los datos de entrada.
				System.out.println("Introduce un numero Entero Positivo o Negativo.");
				numeroUsuario = dato.nextLong(); // Dato del usuario.
				numero = numeroUsuario; // Dato original del usuario.

				if (numeroUsuario > 0) { // Codigo para los numero positivos
					numeroBinario = conversionBinario(numeroUsuario);
					System.out.println("El numero " + numero + " en binario es: ");
					imprimirBinario(numeroBinario);
					entradaValida = true;
				} else if (numeroUsuario < 0) {// Codigo para los numero negativos
					// Convierte a binario y luego calcula el complemento a dos
					numeroBinario = conversionBinario(-numeroUsuario); // Obtencion del valor absoluto del numero
																		// binario.
					System.out.println("El numero " + numero
							+ " es negativo, por lo que se utilizo el complemento A2 (Bit de signo). Su equivalencia en binario es:");
					imprimirBinario(calcularComplementoDos(numeroBinario));
					entradaValida = true;
				} else {
					System.out.println("El numero ingresado es un cero.");
					entradaValida = true;
				}

			} catch (InputMismatchException e) { // Excepcion cuando no es un numero entero.
				System.out.println("Error: Debes introducir un número entero válido.");
				dato.nextLine(); // Limpieza del buffer de entrada.
			}
		} while (!entradaValida); // Condicion del bucle

		dato.close(); // Cierre del objeto Scanner.

	}

	// Imprime el numero binario del array
	private static void imprimirBinario(long[] numeroBinario) {
		for (int j = numeroBinario.length - 1; j >= 0; j--) {
			System.out.print(numeroBinario[j]);
		}
	}

	// Convierte el numeroUsuario a binario dividiendo los reciduos (modulos).
	private static long[] conversionBinario(long numeroUsuario) {
		long[] numeroBinario = new long[64];
		int i = 0;

		while (numeroUsuario != 0) {
			long division = numeroUsuario / 2;
			long modulo = numeroUsuario % 2;
			numeroBinario[i] = modulo;
			numeroUsuario = division;
			i++;
		}

		return numeroBinario;
	}

	// Calcula el complemento A2 del numero binario original.
	private static long[] calcularComplementoDos(long[] numeroBinario) {
		// Encuentra l primer 1 en la representación binaria
		int primerUno = -1;
		for (int i = 0; i < numeroBinario.length; i++) { // Recorre el array hasta a la posicion del primer 1, partiendo
															// de
			// esta, comienza a invertir los bits.
			if (numeroBinario[i] == 1) {
				primerUno = i;
				break;
			}
		}

		// Invierte los bits desde el primer 1
		for (int i = primerUno + 1; i < numeroBinario.length; i++) {
			numeroBinario[i] = 1 - numeroBinario[i]; // Si binario es 0 = 1-0=1. por lo que tenemos ahora binario de 1.
		} // Si binario es 1 = 1-1=0. por lo que tenemos ahora binario de 0.

		return numeroBinario;
	}
