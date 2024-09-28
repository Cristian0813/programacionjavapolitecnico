/* Ejercicio 1.
- Desarrollar un programa que permita por medio de la edad de una persona, 
determinar la categoría en la que pertenece a raíz de la siguiente tabla:

Rango de edad Categoría
0 - 5         Infante
6 - 10        Niño
11 - 15       Pre adolescente
16 - 18       Adolescente
19 - 25       Pre adulto
26 - 40       Adulto
41 - 55       Pre anciano
56+           Anciano

Recuerda tener presente:
• Condicionales anidadas.
• Tabla de verdades.
• Tabla de operadores lógicos.
*/

package EjerciciosCondicionalesComplejas;


public class Ejercicio1 {

    public static void main (String [] args){
        
        int edad = (int)(Math.random()*81);
        String categoria = getCategoria(edad);
        
        System.out.println("La categoria de la persona es: " + categoria);
    }
    
    public static String getCategoria(int edad){
        
         if (edad >= 0 && edad <= 5) {
            return "Infante";
        } else if (edad >= 6 && edad <= 10) {
            return "Niño";
        } else if (edad >= 11 && edad <= 15) {
            return "Pre adolescente";
        } else if (edad >= 16 && edad <= 18) {
            return "Adolescente";
        } else if (edad >= 19 && edad <= 25) {
            return "Pre adulto";
        } else if (edad >= 26 && edad <= 40) {
            return "Adulto";
        } else if (edad >= 41 && edad <= 55) {
            return "Pre anciano";
        } else if (edad >= 56) {
            return "Anciano";
        } else {
            return "Edad no válida";
        }
    }
}
