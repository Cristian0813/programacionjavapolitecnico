package CondicionalElse;

public class CondicionElse {

    public static void main(String[] args) {
        //Condicional
        if (true) {
            //Ejecución si es true
            System.out.println("TRUE");
        } else {
            //Ejecución si es false
            System.out.println("FALSE");
        }

        String Respuesta1 = "No";
        String Respuesta2 = "Si";

        System.out.println("- ¿Quieres un cafe?: ");
        System.out.println("* " + Respuesta1);

        if (Respuesta1 == "Si") {
            System.out.println("- ¿Vas a comprarlo?");
            if (Respuesta2 == "Si") {
                System.out.println("* " + Respuesta2);
                System.out.println("- Comprar café");
            } else {
                System.out.println("* " + Respuesta2);
                System.out.println("- Hacer el café");                                                                                                      
            }
            System.out.println("- Beber el café");
        } else {
            System.out.println("- Sigue estudiando");
        }
    }
}
