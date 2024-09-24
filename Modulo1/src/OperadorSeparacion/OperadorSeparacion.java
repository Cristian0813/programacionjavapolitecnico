/*

() → Permite modificar la prioridad de una expresión, 
     contener expresiones para el control del flujo y realizar conversiones 
     de tipo. Por otro lado, pueden contener la lista de parámetros o argumentos, 
     tanto en la definición de un método como en la llamada al mismo.
{} → Permite definir bloques de código y ámbitos y contener los valores 
     iniciales de un array.
[] → Permite declarar bloques de array (vectores o matrices) y referenciar
     sus elementos.
; → Permite separar sentencias.
, → Permite separar identificadores consecutivos en la declaración de variables
    y en las listas de parámetros. También se emplea para encadenar sentencias
    dentro de un ciclo for.
. → Permite separar el nombre de un atributo o método de su instancia de
    referencia. También separa el identificador de un paquete de los
    subpaquetes y clases.

*/

package OperadorSeparacion;

public class OperadorSeparacion {

    public static void main(String[] args) {
        int suma = (5+9)*2;
        int arreglo[]={2,9};
        int a, b, c;
        double euler = Math.E;
        
    }
}

/*

    ┌───────────┬───────────┬────────────┬───────────────────────────────────────┐
    │ Prioridad │ Operador  │    Tipo    │              Operación                │
    ├───────────┼───────────┼────────────┼───────────────────────────────────────┤
    │           │    ++     │ Aritmético │ Incremento previo o posterior         │
    │           ├───────────┼────────────┼───────────────────────────────────────┤
    │           │    --     │ Aritmético │ Decremento previo o posterior         │
    │           ├───────────┼────────────┼───────────────────────────────────────┤
    │     1     │    +, -   │ Aritmético │ Suma, resta                           │
    │           ├───────────┼────────────┼───────────────────────────────────────┤
    │           │    ~      │ Integral   │ Cambio de bits                        │
    │           ├───────────┼────────────┼───────────────────────────────────────┤
    │           │    !      │ Booleano   │ Negación                              │
    ├───────────┼───────────┼────────────┼───────────────────────────────────────┤
    │     2     │    Tipo   │ Cualquiera │ NA                                    │
    ├───────────┼───────────┼────────────┼───────────────────────────────────────┤
    │     3     │ *, /, %   │ Aritmético │ Multiplicación, división y residuo    │
    ├───────────┼───────────┼────────────┼───────────────────────────────────────┤
    │           │    +, -   │ Aritmético │ Suma, resta                           │
    │     4     ├───────────┼────────────┼───────────────────────────────────────┤
    │           │    +      │ Cadena     │ Concatenación de cadenas              │
    ├───────────┼───────────┼────────────┼───────────────────────────────────────┤
    │           │ <<        │ Integral   │ Desplazamiento de bits a la izquierda │
    │           ├───────────┼────────────┼───────────────────────────────────────┤
    │           │ >>        │ Integral   │  Desplazamiento de bits a la derecha  │
    │     5     │           │            │  con inclusión de signo               │
    │           ├───────────┼────────────┼───────────────────────────────────────┤
    │           │ >>>       │ Integral   │ Desplazamiento de bits a la derecha   │ 
    │           │           │            │ con inclusión del cero                │
    ├───────────┼───────────┼────────────┼───────────────────────────────────────┤
    │           │ <, <=     │ Aritmético │ Menor que, menor o igual que          │
    │           ├───────────┼────────────┼───────────────────────────────────────┤
    │     6     │ >, >=     │ Aritmético │ Mayor que, mayor o igual que          │
    │           ├───────────┼────────────┼───────────────────────────────────────┤
    │           │ instanceof│ Objeto,tipo│ Comparación de tipos                  │
    ├───────────┼───────────┼────────────┼───────────────────────────────────────┤
    │           │     ==    │ Primitivo  │ Igual                                 │
    │           ├───────────┼────────────┼───────────────────────────────────────┤
    │           │     !=    │ Primitivo  │ Desigual                              │
    │     7     ├───────────┼────────────┼───────────────────────────────────────┤
    │           │     ==    │ Objeto     │ Igual                                 │
    │           ├───────────┼────────────┼───────────────────────────────────────┤
    │           │     !=    │ Objeto     │ Desigual                              │
    ├───────────┼───────────┼────────────┼───────────────────────────────────────┤
    │           │     &     │ Integral   │ Cambio de bits AND                    │
    │     8     ├───────────┼────────────┼───────────────────────────────────────┤
    │           │     &     │ Booleano   │ Producto booleano                     │
    ├───────────┼───────────┼────────────┼───────────────────────────────────────┤  
    │           │     ^     │ Integral   │ Cambio de bits XOR                    │
    │     9     ├───────────┼────────────┼───────────────────────────────────────┤
    │           │     ^     │ Booleano   │ Suma exclusiva booleana               │
    ├───────────┼───────────┼────────────┼───────────────────────────────────────┤
    │           │     |     │ Integral   │ Cambio de bits OR                     │
    │    10     ├───────────┼────────────┼───────────────────────────────────────┤
    │           │     |     │ Booleano   │ Suma booleana                         │
    ├───────────┼───────────┼────────────┼───────────────────────────────────────┤
    │    11     │     &&    │ Booleano   │ AND condicional                       │
    ├───────────┼───────────┼────────────┼───────────────────────────────────────┤
    │    12     │     ||    │ Booleano   │ OR condicional                        │
    ├───────────┼───────────┼────────────┼───────────────────────────────────────┤
    │    13     │     ? :   │ Booleano   │ Operador condicional ternario         │
    ├───────────┼───────────┼────────────┼───────────────────────────────────────┤
    │           │     =     │            │ Asignación                            │
    │           ├───────────┤            ├───────────────────────────────────────┤
    │           │ *=,/=,%=  │            │                                       │
    │           ├───────────┤            │                                       │
    │           │   +=, -=  │            │                                       │
    │    14     ├───────────┤ Variable   │ Asiganción con operación              │
    │           │ <<=, >>=  │            │                                       │
    │           ├───────────┤            │                                       │
    │           │   >>>=    │            │                                       │
    │           ├───────────┤            │                                       │
    │           │ &=,^=,|=  │            │                                       │
    └───────────┴───────────┴────────────┴───────────────────────────────────────┘

*/