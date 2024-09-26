package SwitchCaseString;

public class SwitchCaseString {

    public static void main(String[] args) {
        
        String nombre = "Ana";
        
        switch (nombre) {
            case "Diego":
                System.out.println("Hola Diego, lindo día");
                break;
            case "Juan":
                System.out.println("Juan, ¿cómo estás?");
                break;
            case "Stiven":
                System.out.println("Stiven, buena barba");
                break;
            case "Ana":
                System.out.println("Lindo cabello Ana");
                break;
            case "Susana":
                System.out.println("Susana ¿y la familia?");
                break;
            default:
                System.out.println("Error");
        }
    }
}
