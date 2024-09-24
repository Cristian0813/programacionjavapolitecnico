package Math;

public class MathClass {

    public static void main(String[] args) {
        double valorPi = java.lang.Math.PI;
        System.out.println(valorPi);

        double raiz = java.lang.Math.sqrt(25);
        System.out.println(raiz);
        System.out.println("\n");

        System.out.print("Valor absoluto = " + java.lang.Math.abs(-123) + "\n");
        System.out.print("hipotenusa = " + java.lang.Math.hypot(15, 9) + "\n");
        System.out.print("Logarítmo natural = " + java.lang.Math.log(4) + "\n");
        System.out.print("Número mayor = " + java.lang.Math.max(4, 9) + "\n");
        System.out.print("Número menor = " + java.lang.Math.min(4, 9) + "\n");
        System.out.print("Potencia = " + java.lang.Math.pow(5, 4) + "\n");
        System.out.print("Número aleatorio = " + java.lang.Math.random() * 100 + "\n");
        System.out.print("Número redondo = " + java.lang.Math.round(java.lang.Math.random() * 10) + "\n");
        System.out.print("Raíz cuadrada = " + java.lang.Math.sqrt(121) + "\n");

    }
}

/*
 * 
 * ┌──────────────────────┬────────────────────────────────────────────────────┐
 * │-------→Método←-------│-------------------------→Descripción←--------------│
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.abs(x)       │ Devuelve el valor absoluto de un número            │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.acos(x)      │ Devuelve el arco coseno de un número               │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.acosh(x)     │ Devuelve el arco coseno hiperbólico de un número   │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.asin(x)      │ Devuelve el arco seno de un número                 │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.atan(x)      │ Devuelve el arco tangente de un número             │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.atan2(y, x)  │ Devuelve el arco tangente del cociente de sus      │
 * │                      │ argumentos                                         │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.cbrt(x)      │ Devuelve la raíz cúbica de un número               │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.ceil(x)      │ Devuelve el entero más pequeño mayor o igual que   │
 * │                      │ un número                                          │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.cos(x)       │ Devuelve el coseno de un número                    │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.cosh(x)      │ Devuelve el coseno hiperbólico de un número        │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │                      │ Devuelve Ex, donde x es el argumento, y E es la    │
 * │    Math.exp(x)       │ constante de Euler (2.718...), la base de los      │
 * │                      │ logaritmos naturales                               │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.expm1(x)     │ Devuelve ex - 1                                    │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.floor(x)     │ Devuelve el mayor entero menor que o igual a       │
 * │                      │ un número                                          │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.hypot(x, y)  │ Devuelve la raíz cuadrada de la suma de los        │
 * │                      │ cuadrados de sus argumentos                        │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.log(x)       │ Devuelve el logaritmo natural (log, también ln)    │
 * │                      │ de un número                                       │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.max(a, b)    │ Devuelve el mayor de cero o más números            │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.min(a, b)    │ Devuelve el más pequeño de cero o más números      │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.pow(x, y)    │ Las devoluciones de base a la potencia de          │
 * │                      │ exponente, que es base exponent                    │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.random()     │ Devuelve un número pseudoaleatorio entre 0 y 1     │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.round(x)     │ Devuelve el valor de un número redondeado al número│
 * │                      │ entero más cercano                                 │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.sin(x)       │ Devuelve el seno de un número                      │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.sinh(x)      │ Devuelve el seno hiperbólico de un número          │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.sqrt(x)      │ Devuelve la raíz cuadrada positiva de un número    │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.tan(x)       │ Devuelve la tangente de un número                  │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.tanh(x)      │ Devuelve la tangente hiperbólica de un número      │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.E            │ Devuelve el valor de E                             │
 * ├──────────────────────┼────────────────────────────────────────────────────┤
 * │    Math.PI           │ Devuelve el valor de PI                            │
 * └──────────────────────┴────────────────────────────────────────────────────┘
 * 
 */