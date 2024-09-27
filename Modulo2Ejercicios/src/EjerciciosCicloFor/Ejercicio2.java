/* Ejercicio 2.
Desarrollar un programa que determine los divisores de un número definido previamente.
*/

package EjerciciosCicloFor;

public class Ejercicio2 {
    public static void main (String [] args){
        int numero = 54;
        for (int i = 1; i < numero; i ++){
            if(numero % i == 0) {
                System.out.println(i + " ");
            }
        }

    }
}
