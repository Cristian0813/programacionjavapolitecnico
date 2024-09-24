/*
 * - Crear 2 variables enteras, una llamada “Base” y la otra “Exponente”, asignar valores a su criterio.
 * - Calcular la potencia utilizando el método Math.pow.
 * - Mostrar el resultado de la operación.
*/

package EjerciciosClaseMath;

public class Ejercicio1 {
    public static void main(String [] args){
        int Base = 8;
        int Exponente = 2;
        
        int potencia = (int) Math.pow(Base, Exponente);
        System.out.println("La potencias es: " + potencia);
    }
}
