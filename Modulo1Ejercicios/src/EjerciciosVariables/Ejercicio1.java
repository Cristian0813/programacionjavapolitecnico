/*
Ejercicio 1: Crear las siguientes variables según su criterio:
- Una variable que me permita almacenar el nombre de una persona.
- Una variable “x” para almacenar un número con 2 decimales.
- Una variable constante para almacenar el valor del dólar.
- Una variable primitiva float para almacenar los primeros 7 decimales de “pi”.
- Un variable de estructura tipo Double para almacenar los primeros 15 
  decimales de “Euler”.
- Imprima en consola las variables creadas (Recuerde usar el 
  System.out.println (); y dentro de los paréntesis las variables).
 */
package EjerciciosVariables;

public class Ejercicio1 {
    public static void main (String [] args){
        
        String nombre = "Cristian Javier Arias Ordoñez";
        double x = 10.23;
        final double dolarValor = 4149.95;
        float valorPI = 3.1415926F;
        Double valorEuler = 2.718281828459045;
        
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("El decimal es: " + x);
        System.out.println("El valor de dolar es: " + dolarValor);
        System.out.println("Los primeros 7 decimales de 'pi': " + valorPI);
        System.out.println("Los primeros 15 decimales de 'Euler': " + valorEuler);
    }
}
