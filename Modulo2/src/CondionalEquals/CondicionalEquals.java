package CondionalEquals;

public class CondicionalEquals {
    public static void main (String [] args ) {
        // Ejemplo 1
        String nombre = "Cristian";
        if (nombre.equals(nombre)) {
            System.out.println("True\n");
        }

        // Ejemplo 2
        String Saludo1 = new String("Saludo");
        String Saludo2 = new String("Saludo");
        System.out.print(Saludo1 == Saludo2);
        System.out.print("\n");
        System.out.print(Saludo1.equals(Saludo2) + "\n");
        System.out.print("\n");

        // Ejemplo 3
        String x = new String("Saludo");
        String y = new String("Saludo");
        if (x == y) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (x.equals(y)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.print("\n");

    }
}