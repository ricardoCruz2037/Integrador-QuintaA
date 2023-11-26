Dada una circunferencia con centro en el punto C con coordenadas (x1, y1) y radio r, evaluar si un 
punto T con coordenadas (x2, y2) está dentro del área de la circunferencia.

La fórmula de la distancia entre dos puntos en un plano se basa en el teorema de Pitágoras. 
Supongamos que tenemos dos puntos P(x1,y1) y Q(x2,y2) en un sistema de coordenadas 
cartesianas. La distancia d entre estos dos puntos se puede encontrar usando el teorema de 
Pitágoras en un triángulo rectángulo formado por los dos puntos y el punto en el origen con
 coordenadas (0,0).

 El teorema de Pitágoras establece que en un triángulo rectángulo, el cuadrado de la hipotenusa (c) 
 es igual a la suma de los cuadrados de los catetos (a y b). En el contexto de la distancia entre dos 
 puntos, podemos expresar esto de la siguiente manera:

 C++2=a**2+b**2

 En nuestro caso, c es la distancia entre los puntos P y Q (d), a es la diferencia en las coordenadas x 
 (x2−x1), y b es la diferencia en las coordenadas y (y2−y1).

 Por lo tanto, la fórmula de distancia euclidiana entre dos puntos P(x1,y1) y Q(x2,y2) en un plano es:
 Distancia=RaizCuadrada((x2−x1)**2+(y2−y1)**2)

 En este caso, (x1,y1) son las coordenadas del centro de la circunferencia (C) y (x2,y2) son las coordenadas del punto T.

 Si la distancia calculada es menor o igual al radio r, entonces el punto T está dentro de la circunferencia. Si la distancia es mayor que r, entonces el punto T está fuera de la circunferencia.

 En resumen, la condición para que el punto T esté dentro de la circunferencia es:
 (x2−x1)**2+(y2−y1)**2≤r2
 Esto proporciona la misma información y evita la operación de raíz cuadrada, lo que puede ser más eficiente en términos de computación.

