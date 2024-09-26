package CicloWhile;

public class CicloWhile {
    public static void main (String [] args){
        
        boolean x = true;
        int i = 0;
        
        while(x){
            System.out.println("Ciclo while");
            x = false;
            
        }
        
        while(i < 10){
            System.out.println(i);
            i ++;
        }
        
        // Ejercicio:
        // Desarrollar un programa que imprima los números impares entre 1 y 25.
        
        int impar = 0;
        
        
        System.out.println("Ejercicio");
        while(impar < 25){
            if(impar % 2 != 0){
                System.out.println(impar ++);
            }
            impar ++;
        }
    }
    
}
