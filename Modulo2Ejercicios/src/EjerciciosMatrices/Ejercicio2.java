/* Ejercicio 2. 
Desarrollar un programa que dada una matriz de números enteros entre 0 – 50 
de 5*3, hallar el número mayor almacenado:

- Puedes utilizar variables auxiliares.
 */
package EjerciciosMatrices;

public class Ejercicio2 {

    public static void main(String[] args) {

        int matriz[][] = new int[5][3];
        int mayor = matriz[0][0];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 51);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Número mayor: " + mayor);
    }
}
