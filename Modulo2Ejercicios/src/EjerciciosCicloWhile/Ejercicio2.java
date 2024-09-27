/* Ejercicio 2.
Desarrollar un programa que determine si una palabra establecida previamente es o no palíndroma.
*/
package EjerciciosCicloWhile;

public class Ejercicio2 {
    public static void main(String[] args) {
        String palabra = "ANA";
        String invertida = "";
        int longitud = palabra.length() - 1;

        while (longitud >= 0) {
            invertida = invertida + palabra.charAt(longitud);
            longitud--;
        }
        if (palabra.equals(invertida)) {
            System.out.println("La palabra es palíndroma");
        }else{
            System.out.println("La palabra no es palíndroma");
        }
    }
}
