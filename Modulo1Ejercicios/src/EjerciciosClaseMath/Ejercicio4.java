/*
 * - Generar 2 números con decimales aleatorios entre 1 y 50, que serán almacenados en dos variables.
 * - Redondear las dos variables anteriormente creadas por medio del método Math.round, Math.floor o Math.ceil.
 * - Calcular el número mayor por medio de Math.max.
 * - Mostrar el número mayor entre ambas variables.
 */

package EjerciciosClaseMath;

public class Ejercicio4 {
    public static void main (String [] args){
        double numero1 = (Math.random()*50);
        double numero2 = (Math.random()*50);
        
        int Numero1Redondeado = (int) Math.ceil(numero1);
        int Numero2Redondeado = (int) Math.round(numero2);
        
        System.out.println("Número 1 redondeado es: " + Numero1Redondeado);
        System.out.println("Número 2 redondeado es: " + Numero2Redondeado);
        
        System.out.println("El número mayor es: " + Math.max(Numero1Redondeado, Numero2Redondeado));        
    }
}
