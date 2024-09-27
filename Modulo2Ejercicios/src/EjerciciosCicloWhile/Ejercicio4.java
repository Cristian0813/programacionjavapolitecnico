/* Ejercicio 4.
Desarrollar un programa que continúe con la serie sumatoria de 11 – 22 – 33 – 44.
Debe mostrar únicamente los primeros 25 valores de la serie.
*/
package EjerciciosCicloWhile;

public class Ejercicio4 {
    public static void main (String[]args){
        int numero = 0;
        int suma = 0;

        while(suma < 100){
            numero = suma + 11;
            System.out.println(numero + " ");
            suma ++;
        }
    }
}
