/*
1. Desarrolla un programa que permita mostrar el factorial de un número definido previamente.
*/

package EjerciciosCicloFor;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero = 10;
        int factorial = 1;

        for (int i = numero; i > 0; i--, numero-- ) {
            factorial = factorial * 10;
        }
        System.out.println("El factorial es: " + factorial);

    }
}
