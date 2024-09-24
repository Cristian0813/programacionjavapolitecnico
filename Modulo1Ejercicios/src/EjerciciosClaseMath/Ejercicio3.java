/*
 * - Generar 5 números aleatorios entre 0 y 10, que serán almacenados en 5 variables llamadas, “nota1”, “nota2” …,
 * - utilizar el método Math.random.
 * - Calcular el promedio de las 5 notas.
 * - Mostrar el resultado del promedio en pantalla.
 */

package EjerciciosClaseMath;

public class Ejercicio3 {
    public static void main (String [] args){
        double nota1 = Math.random() * 10;
        double nota2 = Math.random() * 10;
        double nota3 = Math.random() * 10;
        double nota4 = Math.random() * 10;
        double nota5 = Math.random() * 10;

        
        double promedio = (nota1 + nota2 + nota3 + nota4 + nota5);
        System.out.println("El promedio de las 5 notas es: " + promedio);
    }
}
