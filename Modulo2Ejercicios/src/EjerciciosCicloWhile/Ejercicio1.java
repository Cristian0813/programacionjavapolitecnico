/* Ejercicio 1.
Desarrolla un programa que permita invertir la palabra “Programación”. El resultado debe ser “nóicamargorP”.
*/
package EjerciciosCicloWhile;

public class Ejercicio1 {
    public static void main (String [] args){
        String palabra = "Programación";
        String invertida = "";
        int longitud = palabra.length() - 1;

        while(longitud >= 0){
            invertida = invertida + palabra.charAt(longitud);
            longitud--;
        }
        System.out.println("La palabra invertida es: " + invertida);
    }
}
