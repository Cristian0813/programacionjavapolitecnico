/* Ejercicio 3.
- Desarrollar un programa que, por medio de 3 números enteros, 
determinar cuál es el mayor.
*/
package EjerciciosCondicionalesComplejas;


public class Ejercicio3 {

    public static void main (String [] args){
        
        int numeroUno =(int)(Math.random()*100);
        int numeroDos =(int)(Math.random()*100);
        int numeroTres =(int)(Math.random()*100);
        
        int mayor = getMayor(numeroUno, numeroDos, numeroTres);

        System.out.println("El mayor de los tres números es: " + mayor);
    }

    public static int getMayor(int num1, int num2, int num3) {
        
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
