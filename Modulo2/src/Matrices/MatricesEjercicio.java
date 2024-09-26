package Matrices;

public class MatricesEjercicio {

    public static void main(String args[]) {
   /* Ejercicios:
    • Desarrollar un programa que, dada una matriz de 5*4, almacene números 
    aleatorios entre 0 y 100 en todas sus posiciones. Luego mostrar la matriz 
    en forma de tabla.
   */
   
        int numeros [][] = new int[5][4];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                numeros[i][j] = (int) Math.ceil(Math.random() * 100);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        
    /* Ejercicio:
    • Con base en el ejercicio anterior, realizar las siguientes operaciones:
    1. Suma de todos los valores.
    2. Resta de todos los valores.
    3. Multiplicación de todos los valores.
    4. Raíz cuadrada de la suma de todos los valores.
    5. División de la multiplicación por la suma.
    */
        int Numeros[][] = new int[5] [4];
        int suma = 0, resta = 0;
        int multiplicacion = 1;
        double division;
        double raiz;
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                Numeros[i][j] = (int) Math.ceil(Math.random()*100);
            }
        }
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                suma = suma + Numeros [i][j];
                resta = resta - Numeros [i][j];
                multiplicacion = multiplicacion * Numeros[i][j];
                System.out.print(Numeros[i][j] + " ");
            }
        }
        System.out.println();
        
        division = multiplicacion/suma;
        raiz = Math.sqrt(suma);
        
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
        System.out.println("La raíz es: " + raiz);
    }
}
