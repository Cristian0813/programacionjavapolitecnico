/* Ejercicio 3.
Desarrollar un programa que permita contar cuantas vocales existentes en el siguiente parrafo.

“Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas risus risus pellentesque.
Eros iaculis duis posuere integer purus euismod consequat. Vel congue curabitur penatibus ac mus nisi iaculis;
scelerisque feugiat blandit molestie euismod. Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est.
Platea non proin aliquet scelerisque nam maecenas elit cum.”
 */
package EjerciciosCicloWhile;

public class Ejercicio3 {
    public static void main (String [] args){

        String parragrafo = "Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas risus risus pellentesque.\n" +
                "Eros iaculis duis posuere integer purus euismod consequat. Vel congue curabitur penatibus ac mus nisi iaculis;\n" +
                "scelerisque feugiat blandit molestie euismod. Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est.\n" +
                "Platea non proin aliquet scelerisque nam maecenas elit cum.";

        int auxiliar = parragrafo.length()-1;
        int vocales = 0;

        while (auxiliar >= 0){
            if(parragrafo.charAt(auxiliar) == 'a' || parragrafo.charAt(auxiliar) == 'e' || parragrafo.charAt(auxiliar) == 'i' || parragrafo.charAt(auxiliar) == 'o' || parragrafo.charAt(auxiliar) == 'u'){
                vocales ++;
            }
            auxiliar --;
        }
        System.out.println("La cantidad de vocales es: " + vocales);
    }
}
