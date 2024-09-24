
package Wrappers;

public class Wrappers {

    public static void main(String[] args) {
    
        // Representación de byte en Byte.
        Byte numeroByte = 1;
        System.out.println("Valor de Byte: " + numeroByte);

        // Representación de short en Short.
        Short numeroShort = 2416;
        System.out.println("Valor de Short: " + numeroShort);

        // Representación de int en Integer.
        Integer numeroInteger = 95256712;
        System.out.println("Valor de Integer: " + numeroInteger);

        // Representación de long en Long.
        Long numerolong = 5213714121L;
        System.out.println("Valor de Long: " + numerolong);

        // Representación de float en Float.
        Float numeroFloat = 6591342543251F;
        System.out.println("Valor de Float: " + numeroFloat);

        // Representación de double en Double.
        Double numeroDouble = 9.3;
        System.out.println("Valor de Double: " + numeroDouble);

        // Representación de boolean en Boolean.
        Boolean variableBoolean = true;
        System.out.println("Valor de Boolean: " + variableBoolean);

        // Representación de char en Character.
        Character variableCharacter = 'A';
        System.out.println("Valor de Character: " + variableCharacter);

        // Representación de un número en Character.
        Character numeroCharacter = '2'; // Los caracteres se deben representar entre comillas simples
        System.out.println("Valor de Character con número: " + numeroCharacter);
        
    	/*
    	 * • No puede ser una palabra reservada del lenguaje o un literal booleano:
    	 * 
    	 * String class "Hola";
    	 * int true = 87;
    	 * int double = 9;
    	 * 
    	 * • No puede comenzar con un número:
    	 * int 5numero; 
    	 * int 5 = 9;
    	 * 
    	 * • No debe contener los símbolos que se utilicen como operadores:
    	 * char genero-estudiante = 'M';
    	 * double altura = 1.80;
    	 * String %nombre = "Alejandro";
    	 * int edad*docente;
    	 * 
    	 * • No debe contener espacios entre el nombre:
    	 * String edad estudiante = 19; 
    	 * int numero celular;
    	 */
        
        /* • Por convención, los nombres compuestos deben ir con el primer
          carácter inicial minúsculo, el resto de los caracteres iniciales en
          mayúsculas:
        */
        String nombreDocente = "Andrés";
        boolean esEstudiante = true;
        
        System.out.println(nombreDocente);
        System.out.println(esEstudiante);
        
        //• Se pueden crear dos variables del mismo tipo contiguamente:
        int a = 8, b=9; 
        String j = "Hola", h ="mundo";
        System.out.println("Int a→"+ a +", Int b→" + b);
        System.out.println(j +" " + h);
        
        //• Se pueden o no iniciar variables:
        String dia = "Martes";
        float peso = 71;
        Character generoEstudiante = 'M';
        String fecha = "10/08/2024";
        System.out.println(dia);
        System.out.println(peso);
        System.out.println(generoEstudiante);
        System.out.println(fecha);
        
        // • Se puede asignar el valor de una variable a una nueva variable:
        int numerosA[] = {3,9,2,4,8};
        int numerosB[] = numerosA;
        System.out.println("numerosA: " + java.util.Arrays.toString(numerosA));
        System.out.println("numerosB: " + java.util.Arrays.toString(numerosB));

        String nombrePerro = "Doggy";
        String nombreGato = nombrePerro;
        System.out.println("nombrePerro: " + nombrePerro);
        System.out.println("nombreGato: " + nombreGato);

        //• Se puede castear el valor de las variables, es decir, pasar de int a
        //	double, de string a int, entre otras combinaciones:
        String edadTexto = "19";
        int edadNumero = Integer.parseInt(edadTexto);
        System.out.println("edadTexto: " + edadTexto);
        System.out.println("edadNumero: " + edadNumero);

        String alturaDouble = "182";
        double alturaEntera = Double.parseDouble(alturaDouble);
        System.out.println("alturaDouble: " + alturaDouble);
        System.out.println("alturaEntera: " + alturaEntera);

        // 
        double numeroDouble1 = 9.2;
        int numeroEntero = (int) numeroDouble1;
        System.out.println("numeroDouble: " + numeroDouble1);
        System.out.println("numeroEntero: " + numeroEntero);

        //
        int numeroEntero2 = 9;
        double numeroDouble2 = (double) numeroEntero2;
        System.out.println("numeroEntero2: " + numeroEntero2);
        System.out.println("numeroDouble2: " + numeroDouble2);
    }	    
}
