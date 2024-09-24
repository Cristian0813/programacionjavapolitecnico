/*
Ejercicio 6:
- Crear una variable entera llamada “ladoCuadrado” de valor 8.
- Calcular el área y el perímetro del cuadrado a partir de la 
  variable anteriormente creada.

- Crear una variable entera llamada “baseTriangulo” de valor 9.
- Crear una variable entera llamada “alturaTriangulo” de valor 8.
- Crear dos variables enteras llamadas “ladoUnoTriangulo” y 
  “ladoDosTriangulo” de valor 8 ambas.
- Calcular el área y el perímetro del triángulo a partir de 
  variables anteriormente creadas.

- Crear una variable entera llamada “baseRectangulo” de valor 8.
- Crear una variable entera llamada “alturaRectangulo” de valor 6.
- Calcular el área y el perímetro del rectángulo a partir de 
  variables anteriormente creadas.
- Mostrar el resultado de las operaciones.
*/

package EjerciciosOperaciones;

public class Ejercicio6 {
    public static void main (String [] args){
        
        //Cuadrado
        int ladoCuadrado = 8;
        
        int areaCuadrado = (int) Math.pow(ladoCuadrado, 2);
        int perimetroCuadrado = 4 * ladoCuadrado;
        
        System.out.println("Cuadrado");
        System.out.println("Área: " + areaCuadrado);
        System.out.println("Perímetro: " + perimetroCuadrado);
        
        //Triángulo
        int baseTriangulo = 9;
        int alturaTriangulo = 8;
        int ladoUnoTriangulo = 8;
        int ladoDosTriangulo = 8;
        int areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        int perimetroTriangulo = baseTriangulo + ladoUnoTriangulo + ladoDosTriangulo;
        
        System.out.println("\nTriángulo");
        System.out.println("Área: " + areaTriangulo);
        System.out.println("Perímetro: " + perimetroTriangulo);
        
        //Rectángulo
        int baseRectangulo = 8;
        int alturaRectangulo = 6;
        
        int areaRectangulo = baseRectangulo * alturaRectangulo;
        int perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);
        
        System.out.println("\nRectángulo:");
        System.out.println("Área: " + areaRectangulo);
        System.out.println("Perímetro: " + perimetroRectangulo);
    }
}
