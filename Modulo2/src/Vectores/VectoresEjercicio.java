package Vectores;

public class VectoresEjercicio {

    public static void main(String[] args) {

    /* Ejercicio:
    • Desarrollar un programa que, mediante el uso de dos vectores, 
    permita almacenar las cinco notas de un estudiante para calcular su 
    promedio final. Los valores para calcular el promedio se encuentran en 
    un vector aparte que contiene los porcentajes asignados a cada nota.
    */
        // Declaración de vectores
        double[] notas = new double[5];
        int[] porcentajes = new int[5];

        // Inicialización de vectores
        notas[0] = 4.5;
        notas[1] = 3.2;
        notas[2] = 5;
        notas[3] = 1.5;
        notas[4] = 4.3;

        porcentajes[0] = 20;
        porcentajes[1] = 10;
        porcentajes[2] = 30;
        porcentajes[3] = 20;
        porcentajes[4] = 20;

        // Cálculo del promedio
        double promedio = 0;
        for (int i = 0; i < notas.length; i++) {
            promedio += (notas[i] * porcentajes[i]) / 100;
        }
        System.out.println("Promedio final: " + Math.round(promedio));

    /* Ejercicio: 
    • Desarrollar un ejercicio que, dado un vector de cinco nombres, 
    cambie todas las letras de los nombres por números, de manera que el 
    nombre termine estando compuesto por solo números.
    */
        // Declaración de vectores
        String nombres[] = {"DIEGO", "JUAN", "PEDRO", "MARIA", "ANA"};
        char caracteres[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 
                             'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q',
                             'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 
                        17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};
        int x = 0;
        String nombreAuxiliar = "";
        
        while(x < 5){
            for (int j = 0; j < nombres[x].length(); j++) {
                for (int k = 0; k < caracteres.length; k++) {
                    if (nombres[x].charAt(j) == caracteres[k]) {
                        nombreAuxiliar = nombreAuxiliar + numeros[k];
                    }
                }
            }
            nombres[x] = nombreAuxiliar;
            System.out.println(nombres[x]);
            nombreAuxiliar = "";
            x ++;
        }
    }
}