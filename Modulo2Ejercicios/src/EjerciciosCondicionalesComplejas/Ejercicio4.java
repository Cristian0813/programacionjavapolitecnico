/* Ejercicio 4.
- Un postulante a un empleo, realiza un test de capacitación, 
se obtuvo la siguiente información: cantidad total de preguntas 
que se le realizaron y la cantidad de preguntas que contestó correctamente. 
Desarrolle un programa que informe el nivel según el porcentaje de 
respuestas correctas que ha obtenido, y sabiendo que:

1. Nivel máximo: Porcentaje >= 90%.
2. Nivel medio: Porcentaje >= 75% y <90%.
3. Nivel regular: Porcentaje >= 50% y <75%.
4. Fuera de nivel: Porcentaje < 50%.
 */
package EjerciciosCondicionalesComplejas;

public class Ejercicio4 {

    public static void main(String[] args) {
        int totalPreguntas = (int) (Math.random() * 20) + 1;
        int preguntasCorrectas = (int) (Math.random() * totalPreguntas) + 1;

        String nivel = getNivel(totalPreguntas, preguntasCorrectas);

        System.out.println("El nivel del postulante es: " + nivel);
        System.out.println("Total preguntas: " + totalPreguntas);
        System.out.println("Preguntas correctas: " + preguntasCorrectas);
    }

    public static String getNivel(int totalPreguntas, int preguntasCorrectas) {
        double porcentaje = (double) preguntasCorrectas / totalPreguntas * 100;

        if (porcentaje >= 90) {
            return "Nivel máximo";
        } else if (porcentaje >= 75 && porcentaje < 90) {
            return "Nivel medio";
        } else if (porcentaje >= 50 && porcentaje < 75) {
            return "Nivel regular";
        } else {
            return "Fuera de nivel";
        }
    }
}
