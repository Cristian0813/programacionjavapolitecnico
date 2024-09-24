package VariablesTipoDatos;

public class TipoNumero {
	public static void main (String []args) {
		NumeroEntero inst = new NumeroEntero ();
		inst.NumerosEnteros();
		inst.NumerosFlotantes();
		inst.NumeroBooleanChar();
	}
	
	// NÚMEROS ENTEROS
	public void NumerosEnteros() {

		// byte: Emplea un sólo byte (8 bits) de almacenamiento.
		// Esto permite almacenar valores entre [-128, 127].
		byte numeroByte = 9;
		System.out.println("Número Byte → " + numeroByte);

		// short: Emplea el doble almacenamiento de (byte).
		// Esto permite almacenar valores entre [-32.768, 32.767].
		short numeroShort = 32767;
		System.out.println("Número Short → " + numeroShort);

		// int: Emplea un tamaño mayor, 4 bytes (32 bits).
		// Esto permite almacenar valores entre [-2147483648, 2147483647].
		int numeroInt = 41825;
		System.out.println("Número Entero → " + numeroInt);

		// long: Emplea el tamaño mayor de todos los enteros, 8 bytes (64 bits).
		// Esto permite almacenar valroes entre [-9223372036854775808,
		// 9223372036854775807].
		long numeroLong = 924654123974521L;
		System.out.println("Número Long → " + numeroLong + "\n");
	}

	// NÚMEROS FLOTANTES
	public void NumerosFlotantes() {

		// float: Emplea un tamaño de 32 bits (4 bytes).
		// Esto permite almacenar valores entre [-3.4028234E+8, 1.40239846E-45].
		float numeroFloat = 5976464F;
		System.out.println("Número Float → " + numeroFloat);

		// double: Emplea un tamaño de 64 bits (8 bytes).
		// Esto permite almacenar valores entre [-1.7976931348623157E+309,
		// 4.94065645841246544E-324]
		double numeroDouble = 2654792142478F;
		System.out.println("Número Double → " + numeroDouble + "\n");
	}

	// BOOLEANOS Y CARACTERES
	public void NumeroBooleanChar() {

		// boolean: Se emplea con la finalidad de trabajar con valores verdaderos/falsos
		// (booleanos). //Se traducen sus valores en true/falso.
		boolean variableBoolean = true;
		System.out.println("Booleano → " + variableBoolean);

		// char: Se emplea para almacenar caracteres individuales (letras, aunque puede
		// contener números).
		// Utiliza 16 bits y se códifica sobre UTF-16 Unicode.
		char numeroChar = '1';
		char letraChar = 'D';
		System.out.println("Número Char → " + numeroChar + "\nLetra Char → " + letraChar + "\n");
	}
}
