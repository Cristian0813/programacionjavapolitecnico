/*
Ejercicio 1:
- Crear una variable para almacenar el nombre de un estudiante.
- Crear 5 variables de tipo double para almacenar 5 diferentes notas decimales.
- Calcular el promedio final del estudiante a partir de las 5 notas decimales. 
  (Recuerda que un promedio se calcula sumando todos los valores y dividiendo el resultado por el número de valores).
- Mostrar el resultado y el nombre del estudiante.
*/

package EjerciciosOperaciones;

public class Ejercicio1 {
    public static void main (String [] args){
        
        String nombre = "Cristian";
        double notaUno = 5.5;
        double notaDos = 8.2;
        double notaTres = 1.7;
        double notaCuatro = 10.0;
        double notaCinco = 7.7;
        
        double promedio = (notaUno + notaDos + notaTres + notaCuatro + notaCinco) / 5;
        
        System.out.println("El promedio de las notas de " + nombre + " es: " + promedio);
    }
}
