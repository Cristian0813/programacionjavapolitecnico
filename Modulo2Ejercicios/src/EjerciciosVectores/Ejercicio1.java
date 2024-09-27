/* Ejercicio 1. 
Desarrollar un programa que por medio de un vector de tipo float 
permita almacenar el peso de 5 personas para posteriormente:

- Determinar el promedio del peso de las 5 personas.
- Determinar cuántas personas superar el promedio del peso.
- Determinar cuántas personas son inferiores al promedio del peso.
 */
package EjerciciosVectores;

public class Ejercicio1 {

     public static void main(String[] args) {
         
    float[] pesos = new float[5];
    pesos[0] = 85.3f;
    pesos[1] = 95.8f;
    pesos[2] = 62.4f;
    pesos[3] = 47.9f;
    pesos[4] = 87.0f;
    float sumaPesos = 0;
    float promedioPeso = sumaPesos / pesos.length;
    int personasSuperanPromedio = 0;
    
    for (float peso : pesos) {
      sumaPesos += peso;
    }

    for (float peso : pesos) {
      if (peso > promedioPeso) {
        personasSuperanPromedio++;
      }
    }

    int personasInferioresPromedio = 0;
    for (float peso : pesos) {
      if (peso < promedioPeso) {
        personasInferioresPromedio++;
      }
    }

    System.out.println("Promedio del peso: " + promedioPeso);
    System.out.println("Personas que superan el promedio del peso: " + personasSuperanPromedio);
    System.out.println("Personas que son inferiores al promedio del peso: " + personasInferioresPromedio);
  }
}
