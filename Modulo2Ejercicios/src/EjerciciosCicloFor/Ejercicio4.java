/* Ejercicio 4.
Desarrollar un programa que realice la sumatoria de todas las iteraciones de un ciclo
desde 0 hasta un número entero definido previamente, al resultado de la suma realizar las siguientes operaciones.

- 👍🏼 Raíz cuadrada.
- 👍🏼Generar un número aleatorio entre 1 y la sumatoria de las iteraciones.
- Determinar los divisores.
- Hallar la factorial.
- Definir si es un número perfecto.
*/
package EjerciciosCicloFor;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numero = 2;
        int sumaIteracion = 0;
        int suma = 0;
        int factorial = 1;

        for (int i = 0; i <= numero; i++) {
            sumaIteracion = sumaIteracion + i;
        }
        System.out.println("La suma de la iteración es: " + sumaIteracion);
        System.out.println("La raíz cuadrada es: " + Math.sqrt(sumaIteracion));
        System.out.println("Número aleatorio es: " + Math.random() * numero);

        System.out.println("Divisores: ");
        for (int i = 0; i <= sumaIteracion; i++) {
            if(i % numero == 0){
                System.out.println(i + " ");
            }
        }

        for(int i = 1; i < sumaIteracion; i++){
            if(sumaIteracion % i == 0){
                suma = suma + i;
            }
        }
        if(suma == sumaIteracion ){
            System.out.println(numero + " es perfecto");
        } else{
            System.out.println(numero + " no es perfecto");
        }

        for (int i = sumaIteracion; i > 0; i--, sumaIteracion-- ) {
            factorial = factorial * sumaIteracion;
        }
        System.out.println("El factorial es: " + factorial);

    }

}
