/* Ejercicio 2.
Desarrollar un programa que dados dos grupos (Grupo A – Grupo B) cada uno 
con 10 estudiantes y una nota final de la materia por estudiante, determinar:

- El promedio general de cada grupo.
- El promedio general de ambos grupos.
- El grupo con mejor promedio.
*/

package EjerciciosVectores;

public class Ejercicio2 {
    public static void main(String[] args) {
        double promedioA = 0, promedioB = 0, promG = 0;
        double sumaA = 0, sumaB = 0;

        double notasA[] = { 10, 9, 5, 3, 8, 7, 10, 7, 10, 9 };

        double notasB[] = { 1, 10, 8, 2, 9, 6, 6, 7, 10, 10 };

        for (int i = 0; i < notasA.length; i++) {
            sumaA = sumaA + notasA[i];
            sumaB = sumaB + notasB[i];
        }

        promedioA = sumaA / notasA.length;
        System.out.println("Promedio A: " + promedioA);

        promedioB = sumaB / notasB.length;
        System.out.println("Promedio B: " + promedioB);

        promG = (promedioA + promedioB) / 2;
        System.out.println("Promedio general: " + promG);

        if (promedioA > promedioB) {
            System.out.println("El grupo con mejor promedio es el A");
        } else if (promedioB > promedioA) {
            System.out.println("El grupo con mejor promedio es el B");
        } else {
            System.out.println("Ambos grupos tienen el mismo promedio");
        }
    }
}