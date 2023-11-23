EJERCICIO NUMERO 4.

Autor: Ricardo López Cruz.	
Numero de control: 230110088	
Correo institucional: 230110088@itsoeh.edu.mx	
Pagina Personal de contacto: https://ricardocruz2037.github.io/.github.com/	
Cuenta De github: https://github.com/ricardoCruz2037	
Correo Personal: ricardolopezcruzcontacto2037@gmail.com	
Fecha de Subida: 22/11/2023	

Dado un número decimal entero, positivo o negativo, regresar su equivalente en binario.

En este ejercicio el objetivo a alcanzar es el poder convertir un número entero positivo o negativo ingresado por el usuario a su equivalencia en binario, si dado número es negativo, se dará su equivalencia mediante el método de complemento A2. Para ello, debemos realizar dichas operaciones sin la necesidad de utilizar métodos o funciones preestablecidas por java como lo puede ser "toBinary" o algún otro método que nos permita acortar nuestro proceso.

NÚMERO POSITIVO.

Para convertir un número decimal a binario, debemos dividirlo por 2. El número binario que buscamos es el residuo de cada una de estas divisiones. Los residuos solo pueden ser 0 o 1, ya que el cociente de una división entre 2 solo puede ser un número entero. El proceso se repite hasta que el cociente de la división sea 0.

Tomemos como ejemplo el número 4, la representación binaria del número 4 es 0100, para llegar a esta debemos hacer el procedimiento antes mencionado:

                                     4/2 = 2 --> residuo 0
                                     2/2 = 1 --> reasiduo 0
                                     1/2 = 0 --> residuo 1

Para leer nuestro bit de la forma correcta, debemos escribirlo al revés. Por ejemplo, si obtenemos el residuo 001, la forma correcta de escribirlo es 100. Es por eso que en nuestro algoritmo, al momento de imprimir el array que almacena nuestro número binario, los bits se imprimen al revés (cabe resaltar que los bits correctamente se escriben en cantidades divisibles a 2, en este caso, el resultado final sería 0100).

NÚMERO NEGATIVO.

Para representar un número negativo en binario, invertimos los bits de su valor absoluto. Para ello, primero debemos obtener el valor absoluto del número Binario. Una vez que tenemos el valor absoluto, invertimos sus bits, comenzando por el primer bit 1 que encontremos, de derecha a izquierda.

Guardaremos la posición donde se encuentre el primer número 1, luego, a este se le sumara 1 para avanzar a la siguiente posición sin que la original guardada no se vea afectada. Es ahí cuando realizamos nuestra siguiente operación para invertir el bit almacenado en dichas posiciones siguientes del primer 1.
                                    
                                     numeroBinario[i] = 1 - numeroBinario[i];
                                     Valor de la posicion = 1 - Valor de la posicion.

                     Si el Valor de la posicion es 0: 1 - 0 = 1. Por lo que tenemos ahora como valor 1.
		             Si el Valor de la posicion es 1: 1 - 1 = 0. Por lo que tenemos ahora Como valor 
                
De esta forma tendremos invertido nuestros bits y habremos realizado el complemento A2 de nuestro número negativo, cumpliendo así con la problemática principal del problema y cumpliendo con el objetivo principal de la conversión correcta del número decimal a binario.
