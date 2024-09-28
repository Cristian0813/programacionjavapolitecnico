/*Ejercicio 3. 
Desarrollar un programa que dada una matriz 3*4 con números aleatorios, 
imprimir de la matriz sólo lo siguiente:

- La primera fila
- La segunda columna
- La tercera fila
 */
package EjerciciosMatrices;

public class Ejercicio3 {

    public static void main(String[] args) {

        int matriz[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println("Matriz completa: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Primera fila:");
        for (int j = 0; j < 4; j++) {
            System.out.print(matriz[0][j] + " ");
        }
        System.out.println();

        System.out.println("Segunda columna:");
        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][1]);
        }

        System.out.println("Tercera fila:");
        for (int j = 0; j < 4; j++) {
            System.out.print(matriz[2][j] + " ");
        }
        System.out.println();
    }
}
