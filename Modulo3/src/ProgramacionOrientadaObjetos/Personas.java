// Tema: Programación orientada a objetos
/*
La programación orientada a objetos es un paradigma de la programación, 
y ¿qué es un paradigma en programación? «Es una propuesta tecnológica 
adoptada por una comunidad de programadores y desarrolladores cuyo núcleo 
central es incuestionable en cuanto a que únicamente trata de resolver uno o 
varios problemas claramente delimitados» (Aprendiendo Arduino, 2019). Es una 
forma que los programadores emplean para resolver problemas a partir de clases 
y objetos, es una forma especial de programar, más cercana a como se 
expresan las cosas en la vida real.

Aclaramos que la programación orientada a objetos no se trata de nuevas 
características que adquiere el lenguaje de programación. Con la programación 
orientada a objetos se hace referencia a una nueva forma de pensar. 
Lo que se acostumbra a ver es la programación estructurada (Wikipedia, 2023a), 
donde se tiene un problema y se descompone en distintos subproblemas para 
tener soluciones más pequeñas y simples.

Como mencionamos anteriormente, la programación orientada a objetos 
busca ver la programación como la vida real, donde los objetos son 
similares a los objetos en la realidad.
*/

package ProgramacionOrientadaObjetos;


public class Personas {
    
    String nombre;
    String pais;
    int edad;
    
    public Personas(){
    
        nombre = "Cristian";
        pais  = "Colombia";
        edad = 34;
    }
    
    public void Saludar(){
        System.out.println("Hola");
    }
    
    public void MostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Pais: " + pais);
        System.out.println("Edad: " + edad);
    }
    
    public static void main(String [] args){
        Personas miPersona = new Personas();
        System.out.println("Mostra datos");
        miPersona.MostrarDatos();
    }
}