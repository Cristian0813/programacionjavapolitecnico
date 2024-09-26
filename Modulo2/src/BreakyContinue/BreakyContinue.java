
package BreakyContinue;

public class BreakyContinue {
    
    public static void main (String [] args){
        
        for(int i = 0; i < 10; i++){
            System.out.println("Dentro del ciclo");
        }
        System.out.println("Fuera del ciclo");
        
        for(int i = 0; i < 5; i++){
            if(i == 3){
                continue;
            }
            System.out.println("Dentro del Ciclo");
        }        
    }
}
