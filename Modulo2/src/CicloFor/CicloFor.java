package CicloFor;

public class CicloFor {

    public static void main(String[] args) {

        int contador = 0;
        
        for(int i = 0; i < 10; i ++){
            System.out.println("Número: " + i);
        }
        
        for(int i = 20; i >= 0; i -=2){
            System.out.println("Números: " + i);
        }
        
        for(int i = 1; i <= 1000; i ++){
            if(i % 7 == 0){
                contador ++;
            }
        }
        System.out.println("Los multiplo de 7 entre 1 y 1000 son: " + contador +"\n");
        
        for(int i = 1; i <=10; i++){
            System.out.println("La tabla multiplicar " + i);
            for(int j = 1; j <= 10; j++){
                System.out.println(i + "*" + j + "= " + i*j);
            }
        }
        
        for(int i = 0; i < 2; i ++){
            System.out.println("Ciclo 1");
            for(int j = 0; j < 2; j ++){
                System.out.println("Ciclo 2");
            }
        }
        
        
    }
}
