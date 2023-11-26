# Ejercicio 2 

## Planteamiento:
Dado un número binario de n bits regresar su equivalente en decimal
## Resolucion:
Identificar n bits que es el numero binario al que queremos regresar su equivalente a decimal
 
Una vez identificado nuestro numero le asiganamos la potencia de (Base-2 )el cual crece el exponente de derecha a izquierda en uno y para eso  utilizamos variables de tipo long para tener un rango de valores mas amplio. 

Una vez obtenida nuestra potencia por cada bit con nuestra variable Math.pow, se multiplica cada digito por correspondiente potencia de 2 y con los resultados obtenidos se suman los terminos con nuestra variable binarioString lo que equivale a nuestro numero a decimal.  




 
