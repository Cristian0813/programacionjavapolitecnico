/* Ejercicio 5. 
Por medio de una nota decimal, determinar sí el estudiante aprobó o 
no la clase (0 – 6 = Perdió – 7 – 10 = Aprobó).
*/
package EjerciciosCondicionalesSimples;


public class Ejercicio5 {

    public static void main(String[] args) {
        
    double nota = 6.9;

    if (nota >= 7 && nota <= 10) {
      System.out.println("El estudiante aprobó la clase con una nota de " + nota);
    } else if (nota >= 0 && nota < 7) {
      System.out.println("El estudiante perdió la clase con una nota de " + nota);
    } 
  }
}
