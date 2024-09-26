package SwitchCaseAnidados;

public class SwitchCaseAnidados {

    public static void main(String[] args) {
        
        int promedio = 4;
        int parcial = 4;
        
        switch(promedio){
            case 1:
            case 2:
            case 3:
                System.out.println("Perdiste la materia");
                break;
            case 4:
            case 5:
                System.out.println("Ganaste la materia");
                
                switch(parcial){
                    case 1: 
                    case 2: 
                    case 3:
                        System.out.println("Pero perdistes el parcial");
                        break;
                    case 4: 
                    case 5: 
                        System.out.println("Y tambien el parcial");
                        break;
                }
                break;
            default: System.out.println("Error");
        }
    }
}
