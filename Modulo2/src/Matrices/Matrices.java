package Matrices;

public class Matrices {

    public static void main(String[] args) {

        //Forma 1:
        int matrizNumeros1[][] = new int[4][5];
        //Forma 2:
        int[][] matrizNumeros2 = new int[4][5];
        //Forma 3:
        int[][] matrizNumeros3 = new int[4][5];
        //Forma 4:
        int matrizNumeros4[][];
        //Forma 5:
        int matrizNumeros5[][] = {};
        //Forma 6:
        int matrizNumeros6[][] = {{1, 2}, {3, 9}};
        //Forma 7:
        int matrizNumeros7[][] = new int[][]{{6, 2}, {2, 7}};

        /* Estructura de una matriz
        • Los elementos de una matriz o array bidimensional se empiezan a numerar
        en el 0,0 (haciendo referencia a las filas y las columnas) y permiten
        gestionar desde una sola variable múltiples datos del mismo tipo.
         */
        
        int numeros [][] = new int[2][2];
        numeros [0][0] = 1;
        numeros [0][1] = 2;
        numeros [1][0] = 6;
        numeros [1][1] = 7;
        
        /*
        • La cantidad de datos que se pueden almacenar los determinan las 
        filas y las columnas por medio de la multiplicación de sus valores, por ejemplo:
            ✓ Matriz [2][8]: permitirá almacenar 16 valores.
            ✓ Matriz [3][15]: permitirá almacenar 45 valores.

        • A cada dato almacenado dentro de la matriz le corresponde dos índices, 
        uno que determina en qué fila se encuentra el dato y otro en qué columna, dado que, 
        a partir de los índices, se accede a los datos.
            ┌───────────┬────────────┬────────────┬────────────┬────────────┐
            │   Matriz  │      0     │     1      │     2      │     3      │
            ├───────────┼────────────┼────────────┼────────────┼────────────┤
            │     0     │   Diego    │    Juan    │            │            │
            ├───────────┼────────────┼────────────┼────────────┼────────────┤
            │     1     │            │            │            │    Frank   │
            ├───────────┼────────────┼────────────┼────────────┼────────────┤
            │     2     │            │   Steven   │            │            │
            ├───────────┼────────────┼────────────┼────────────┼────────────┤
            │     3     │            │            │    Ana     │            │
            └───────────┴────────────┴────────────┴────────────┴────────────┘    
       
            En la representación anterior de una matriz 4*4, tiene almacenados cinco 
            datos en las siguientes posiciones:
            ┌─────────┬──────────┐
            │  Diego  │  [0][0]  │
            ├─────────┼──────────┤
            │  Juan   │  [0][1]  │
            ├─────────┼──────────┤
            │  Frank  │  [1][3]  │
            ├─────────┼──────────┤
            │  Steven │  [2][1]  │
            ├─────────┼──────────┤
            │  Ana    │  [3][2]  │
            └─────────┴──────────┘    
            
        • El tamaño de la matriz no puede ser redefinido.
            int numeros [][] = new int[2][2];
            numeros [0][0] = 1;
            numeros [0][1] = 2;

            numeros [1][0] = 6;
            numeros [1][1] = 7;
            
            numeros [][] = new int[2][4];

        */
        
        // • Las matrices pueden ser de N*M posiciones, siendo N y M cualquier número entero.
        int numero[][] = new int[27][92];
        String nombres[][] = new String[40][200];
    }

}
