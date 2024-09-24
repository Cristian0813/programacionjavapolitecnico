/*
Ejercicio 3:
- Crear una variable entera de nombre “numeroUno” con el valor de 8.
- Crear una variable entera de nombre “numeroDos” con el valor de 2.
- Intercambiar los valores de ambas variables, de modo que “numeroUno” 
  valga 2, y “numeroDos” valga 8. (Utiliza una variable auxiliar).
- Mostrar los resultados de ambas variables.
 */
package EjerciciosOperaciones;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        int numeroUno = 8;
        int numeroDos = 2;
        
        int auxiliar = numeroUno;
        
        numeroUno = numeroDos;
        numeroDos = auxiliar;
        
        System.out.println("Número 1: " + numeroUno);
        System.out.println("Número 2: " + numeroDos);
        
    }
}
