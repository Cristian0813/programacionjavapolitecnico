package OperadoresLogicos;

public class OperadorLogico {

    public static void main(String[] args) {
        boolean negacion = false;
        System.out.println(negacion);

        boolean sumaLogica = true | false;
        System.out.println(sumaLogica);

        boolean sumaLogicaExclusiva = (5 == 5) ^ (5 < 4);
        System.out.println(sumaLogicaExclusiva);

        boolean productoLogico = (5 == 5) & (5 < 4);
        System.out.println(productoLogico);

        boolean sumaLogicaCortocircuito = true || false;
        System.out.println(sumaLogicaCortocircuito);

        boolean productoLogicoCortocircuito = (5 == 5) && (5 < 4);
        System.out.println(productoLogicoCortocircuito);
    }
}
