/* Ejercicio 3.
Desarrollar un programa que permita definir si un número entero ya establecido es un número perfecto o no.
 */

package EjerciciosCicloFor;

public class Ejercicio3 {
    public static void main (String [] args){
        int numero = 8128;
        int suma = 0;
        for(int i = 1; i < numero; i++){
            if(numero % i == 0){
                suma = suma + i;
            }
        }
        if(suma == numero ){
            System.out.println(numero + " es perfecto");
        } else{
            System.out.println(numero + " no es perfecto");
        }
    }
}
