/*Ejercicio 2. 
Dados dos números enteros, determinar cuál es el mayor por medio de una 
condicional y realizar una potencia con el número menor como exponente (Math.pow).
*/
package EjerciciosCondicionalesSimples;


public class Ejercicio2 {
    
    public static void main (String [] args){
        
        int numeroUno = (int)(Math.random()*100);
        int numeroDos = (int)(Math.random()*100);
        
        if(numeroUno > numeroDos){
            System.out.println("Potencia de número uno: " + Math.pow(numeroUno, numeroDos));
        }else{
            System.out.println("Potencia número dos: " + Math.pow(numeroDos, numeroUno));
        }
    }

}
