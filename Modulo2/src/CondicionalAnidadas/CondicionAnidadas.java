package CondicionalAnidadas;

public class CondicionAnidadas {

    public static void main(String[] args) {

        int numero = 9;

        if (numero >= 0) {
            if (numero > 0 && numero <= 4) {
                System.out.println("Bajo valor");
            } else if (numero > 4 && numero <= 8) {
                System.out.println("Medio valor");
            } else if (numero > 8 && numero <= 14) {
            System.out.println("Alto valor");
            }
        } else {
            System.out.println("Es negativo");
        }
    }
}
