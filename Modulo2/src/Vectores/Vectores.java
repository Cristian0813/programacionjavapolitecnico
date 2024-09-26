package Vectores;

public class Vectores {

    public static void main(String[] args) {

        //Forma 1:
        int vectorNumeros1[] = new int[10];
        //Forma 2:
        int[] vectorNumeros2 = new int[10];
        //Forma 3:
        //int[] vectorNumeros 3 = new int[10];
        //Forma 4:
        int vectorNumeros4[];
        //Forma 5:
        int vectorNumeros5[] = {};
        //Forma 6:
        int vectorNumeros6[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        //Forma 7:
        int vectorNumeros7[] = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        
        //Estructura de un vector
        
        /*
        Los elementos de un vector o array se empiezan a numerar en el 0 y 
        permiten gestionar desde una sola variable múltiples datos del mismo tipo.
         */
        String estudiante[] = new String[3];
        estudiante[0] = "Juan";
        estudiante[1] = "Stiven";
        estudiante[2] = "Andres";
        
        for (int i = 0; i < estudiante.length; i++ ){
            System.out.println("Nombre " + i + " - " + estudiante[i]);
        }
        
        /*
        • Al igual que en la aplicación del método charArt, en los arreglos, 
        a cada dato almacenado le corresponde un índice, dado que , a partir 
        de los índices, se operan los vectores.
        
        ┌──────────────────────────────────────────┐
        │              Estudiantes[]               │ 
        ├───────────┬──────────────┬───────────────┤
        │   "Juan"  │   "Stiven"   │   "Andres"    │
        ├───────────┴──────────────┴───────────────┤
        │               Posiciones                 │
        ├───────────┬──────────────┬───────────────┤
        │     0     │       1      │       2       │
        └───────────┴──────────────┴───────────────┘
        */

        // • El tamaño del vector no puede ser redefinido.
        /*
            String estudiantes[] = new String[3];
            estudiantes[0] = "Juan";
            estudiantes[1] = "Stiven";
            estudiantes[2] = "Andres";
            estudiantes[] = new String[5];
        */

        // • Los vectores pueden ser de N posiciones, siendo N cualquier número entero.
        String estudiantes[] = new String[30];
        double notas[] = new double[30];

    }
}
