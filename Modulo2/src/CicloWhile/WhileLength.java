package CicloWhile;

public class WhileLength {
    public static void main (String [] args){
        
        //Desarrollar un programa que, dada una palabra, descomponga todos sus caracteres.
        
        String palabra = "Calima el Darien";
        int conteoPalabra = 0;
        
        while(conteoPalabra < palabra.length()){
            System.out.print(palabra.charAt(conteoPalabra) + " ");
            conteoPalabra ++;
        }
        
        System.out.print("\nLa palabra tiene " + palabra.length() + " caracteres");
        
        
        String nombre = "Cristian Javier arias Ordoñez";
        int i = 0;
        
        System.out.println("\nEl nombre " + nombre + " tiene "  + nombre.length() + " caracteres");
        
        while(i < nombre.length()){
            System.out.println(nombre.charAt(i) + " en la posición: " + i);
            i ++;
        }
        
        boolean x = true;
        while(x){
            double n = Math.ceil(Math.random()*50);
            System.out.println(n);
            if(n % 10 == 0){
                x = false;
            }
        }
    }
    
}
