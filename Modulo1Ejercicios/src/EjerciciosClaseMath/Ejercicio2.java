/*
Ejercicio 2:
- hallar la raíz cuadrada de los siguientes números por medio del método Math.sqrt.
- 2, 8, 9, 27, 28, 55, 121.
- Mostrar los resultados de cada operación.
*/

package EjerciciosClaseMath;

public class Ejercicio2 {
    public static void main (String [] args){
        int[] numeros = {2, 8, 9, 27, 28, 55, 121};
        
        for(int numero : numeros){
            double raizCuadrada = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
        }
    }
}
