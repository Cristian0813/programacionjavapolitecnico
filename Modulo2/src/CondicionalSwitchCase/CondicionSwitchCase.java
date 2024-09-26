package CondicionalSwitchCase;

public class CondicionSwitchCase {

    public static void main(String[] args) {
        
        int numeroUno = 2;
        int numeroDos = 4;
        
        switch (numeroUno) {
            case 1:
                System.out.print("Número 1");
            case 2: 
                System.out.print("Número 2");
            case 3:
                System.out.print("Número 3");
            default:
                System.out.print("Error");
        }
        
        switch (numeroDos) {
            case 1:
                System.out.print("Número 1");
            case 2: 
                System.out.print("Número 2");
                break;
            case 3:
                System.out.print("Número 3");
            default:
                System.out.print("Error");
        }
    }

}
