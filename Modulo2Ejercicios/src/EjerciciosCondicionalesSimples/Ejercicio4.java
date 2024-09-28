/* Ejercicio 4. 
Dados dos números enteros, determinar si uno es múltiplo 
del otro (Por medio del módulo).
*/

package EjerciciosCondicionalesSimples;


public class Ejercicio4 {
    
    public static void main (String [] args){
        
        int numeroUno = 2;
        int numeroDos = 3;
        
        if(numeroUno % numeroDos == 0){
             System.out.println("El número "+ numeroDos +" es multiplo del número " + numeroUno);
        }else{
            System.out.println("El número "+ numeroDos +" no es multiplo del número " + numeroUno);
        }
    }
}
