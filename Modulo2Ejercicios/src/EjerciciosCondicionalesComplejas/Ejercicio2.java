/* Ejercicio 2.
- Desarrollar un programa que permita determinar la cantidad de cifras 
de un número X teniendo en cuenta que el número únicamente puede tener 
4 cifras. Mostrar un mensaje por defecto si el número supera las 4 cifras.
*/
package EjerciciosCondicionalesComplejas;


public class Ejercicio2 {

    public static void main (String [] args){
        
        int numero = 10;
        int cifras = (int) (Math.log(numero)+1);
        
        if(cifras <= 4){
            System.out.println(cifras + " Cifras");
        }else{
            System.out.println("4 cifras");
        }
    }
}
