/* Ejercicio 5.
Desarrolla un programa completamente de tu autoría y con el grado de complejidad que
creas necesario, utiliza todo lo aprendido hasta ahora.
 */
package EjerciciosCicloWhile;

public class Ejercicio5 {

    public static void main (String[]args){

        int numero = 1;
        int sumatoriaPares = 0;
        int sumatoriaImpares = 0;

        while(numero <= 100){
            if(numero % 2 == 0){
                sumatoriaPares += numero;
            } else{
                sumatoriaImpares += numero;
            }
            numero ++;
        }
        System.out.println("La sumatoria de los números pares entre 1 y 100 es: " + sumatoriaPares);
        System.out.println("La sumatoria de los números impares entre 1 y 100 es: " + sumatoriaImpares);
    }
}
