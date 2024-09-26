
package Condicionalif;

/*
¿Qué es una condicional?
Cuando se escribe un programa, se introduce la secuencia de sentencias. 
Sin sentencias de control del flujo, el intérprete (compilador) ejecuta las 
sentencias conforme aparecen en el programa de principio a fin. 
Las sentencias de control de flujo se emplean en los programas para 
ejecutar sentencias condicionalmente, repetir un conjunto de sentencias o, 
en general, cambiar el flujo secuencial de ejecución
*/

public class Condicionalif {
    public static void main(String[] args) {
              
        if(9 < 12){
            System.out.println("9 sí es menor a 12");
        }

        if(4 > 2){
           System.out.println("4 sí es mayor a 2 \n");
        }

        if(9 < 12 && 2 <=4){
            System.out.println("9 sí es menor a 12");
            System.out.println("2 sí es menor a 4 \n");
        }
       
        //Se inicializa ambas variables
        boolean p = true;
        boolean q = true;
        //Primea condición donde P y Q tienen que ser true
        //para cumplir el if correctamente.
        if(p && q){
            //Ejecución en caso de que P y Q sean verdaderos.
            System.out.println("P y Q tienen un valor TRUE");
        }
        //Segunda condición donde P o Q tienen que ser true
        //para cumplir el if correctamente.
        if(p || q){
            //Ejecución en caso de que P o Q sean true.
            System.out.println("P o Q tienen un valor TRUE");
        }
        //Tercera condición donde P al ser true y agregar el operador 
        // "!" niega el true y lo convierte a false (Sólo en ejecución 
        //de la condición, la variable P sigue siendo true).
        if(!p){
            //Ejecución en caso de que P sea true
            System.out.println("P tiene un valor TRUE");
        }
        
        //Se inicializan ambas variables
        boolean r = true;
        boolean s = false;
        //Primera condición donde R y S tienen que ser true 
        //para cumplir el if correctamente.
        if(r && s)
        {
            //Ejecución en caso de que R y S sean verdaderas 
            System.out.println("R y S tienen un valor true");
        }
        //Segunda condición donde R o S tienen que ser true 
        //para cumplir el if correctmanete. 
        if(r || s)
        {
            //Ejecución en caso de que R o S sean true 
            System.out.println("R o S tienen un valor true");
        }
        //Tercer condición donde R al ser true y agregar el operador
        //"!" niega el true y lo convierte a false (Sólo en ejecución
        //de la condición, la variable S sigue siendo true)
        if(!r){
            //Ejecución en caso de que R sea true
            System.out.println("R tiene un valor true");
        }
        
        //Se inicializan ambas variables
        boolean t = false;
        boolean u = true;
        //Primera condición donde T y U tienen que ser true 
        //para cumplir el if correctamente.
        if(t && u)
        {
            //Ejecución en caso de que T y U sean verdaderas 
            System.out.println("T y U tienen un valor true");
        }
        //Segunda condición donde T o U tienen que ser true 
        //para cumplir el if correctmanete.
        if(t || u)
        {
        //Ejecución en caso de que T o U sean true 
            System.out.println("T o U tienen un valor true");
        }
        //Tercer condición donde R al ser true y agregar el operador
        //"!" niega el true y lo convierte a false (Sólo en ejecución
        //de la condición, la variable S sigue siendo true)
        if(!t){
            //Ejecución en caso de que R sea true
            System.out.println("T tiene un valor true");
        }
        
        //Se inicializan ambas variables
        boolean v = false;
        boolean w = false;
        //Primera condición donde R y S tienen que ser true 
        //para cumplir el if correctamente.
        if(v && w)
        {
            //Ejecución en caso de que V y W sean verdaderas 
            System.out.println("V y W tienen un valor true");
        }
        //Segunda condición donde V o W tienen que ser true 
        //para cumplir el if correctmanete. 
        if(v || w)
        {
            //Ejecución en caso de que V o W sean true 
            System.out.println("V o W tienen un valor true");
        }
        //Tercer condición donde V al ser true y agregar el operador
        //"!" niega el true y lo convierte a false (Sólo en ejecución
        //de la condición, la variable S sigue siendo true)
        if(!v){
            //Ejecución en caso de que V sea true
            System.out.println("V tiene un valor true");
        }
    }
}
