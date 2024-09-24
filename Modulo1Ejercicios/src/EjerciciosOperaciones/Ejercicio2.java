/*
Ejercicio 2:
- Crear una variable entera con el valor de 9.
- Crear una variable entera con el valor de 7.
- Calcular la suma de la variable número uno más la variable número dos.
- Calcular la resta de la variable número uno menos la variable número dos.
- Calcular la multiplicación de la variable número uno por la variable número dos.
- Calcular la división de la variable número uno dividida la variable número dos.
- Mostrar los resultados de cada operación.
 */
package EjerciciosOperaciones;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        int numUno = 9;
        int numDos = 7;
        double division;
        int suma, resta, multiplicacion;
        
        suma = numUno + numDos;
        System.out.println("El resultado de la suma es: " + suma);

        resta = numUno - numDos;
        System.out.println("El resultado de la resta es: " + resta);

        multiplicacion = numUno * numDos;
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);

        division = numUno / numDos;
        System.out.println("El resultado de la divisón es: " + division);
    }
}
