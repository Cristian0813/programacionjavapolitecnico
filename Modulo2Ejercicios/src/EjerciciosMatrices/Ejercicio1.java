/* Ejercicio 1. 
Desarrollar un programa que por medio de tres (3) matrices de N*M 
(Determinar el tamaño, igual para las 3 matrices):

- Almacenar números pares aleatorios entre 0 y 100 en la primera matriz.
- Almacenar números impares aleatorios entre 0 y 50 en la segunda matriz.
- Almacenar la suma de los valores de ambas matrices en la tercera matriz.
 */
package EjerciciosMatrices;

public class Ejercicio1 {

    public static void main(String[] args) {

        int N = 4;
        int M = 3;

        int[][] matriz1 = new int[N][M];
        int[][] matriz2 = new int[N][M];
        int[][] matriz3 = new int[N][M];

        // Generar números pares aleatorios entre 0 y 100 en la primera matriz.
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz1[i][j] = (int) (Math.random() * 101) * 2;
            }
        }

        // Generar números impares aleatorios entre 0 y 50 en la segunda matriz.
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz2[i][j] = (int) (Math.random() * 51) * 2 + 1;
            }
        }

        // Generar la suma de los valores de ambas matrices en la tercera matriz.
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz 1:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz 2:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz 3:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
