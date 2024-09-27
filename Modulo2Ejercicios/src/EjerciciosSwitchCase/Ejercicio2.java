/* Ejercicio 2.
Desarrollar una calculadora, la cual, en base a un operador, realice una 
operación con dos números enteros ya definidos y mostrar el resultado, 
los operadores a tener en cuenta son los vistos en la tabla de operadores 
aritméticos, sí deseas agregar más operadores, siéntete en libertad de hacerlo.
*/

package EjerciciosSwitchCase;


public class Ejercicio2 {
    public static void main(String [] args){
        
        int numero1 = 8;
        int numero2 = 5;
        char operador = '*';
        int resultado = 0;
        
        switch(operador){
            case '+':
                resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
            break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resultado);
            break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("El resultado de la multiplicaión es: " + resultado);
            break;
            case '/':
                resultado = numero1 / numero2;
                System.out.println("El resultado de la división es: " + resultado);
            break;
            default:
                System.out.println("No existe un valor válido");
        }
    }
}
