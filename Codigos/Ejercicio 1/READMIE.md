Planteamiento 

Dados 2 puntos A y B con coordenadas x1, y1 y x2, y2 respectivamente. Regresar la ecuación de la recta y el ángulo interno que sse forma entre el eje horizontal y la recta.

Resolución 

Lo que se hizo para poder resolver este problema es primeramente recordar algunos conceptos basicos como los son: 

Fórmula de la pendiente (y2-y1) / (x2-x1)
Fórmula para calcular la ecuación de la recta: Y = y1 - m * x1
Fórmula para calcular el ángulo: θ = tan -1 (m)

En este caso utilizaremos la fórmula matemática que ya viene programada en el lenguaje de Java, la cual nos ahorra mucho trabajo, de igual manera utilizaremos una misma fórmula para convertir nuestro ángulo de radianes a grados.

Para calcular el ángulo en radianes: Math.atan(m)
Para convertir de radianes a grados: Math.toDegrees(AnguloEnRadianes)

Primeramente se le solicita al usuario que introduzca los valores de A y B

Una vez teniendo los valores de nuestras coordenaadas, procedemos a calcular la pendiente con la fórmula ya antes mencionada (y2-y1) / (x2-x1)

Después de ya tener el valor de nuestra pendiente lo que haremos es calcular la ecuación de la recta de la forma de Y = mx + c. Esto es para poder conocer la ecuación de la recta.

Ahora solo utilizaremos nuestras formulas predeterminadas para conocer el ángulo que se forma con el eje horizontal y después convertir de radianes a grados.

Así es como obtuve la solución del problema que se me planteó