package br.com.java.casting;

public class Casting {
	public static void main(String[] args) {
		byte byteMinimo = -128;
		byte byteMaximo = 127;
		
		short shortMinimo = -32768;
		short shortMaximo = 32767;
		
		int intMinimo = -2147483648;
		int intMaximo = 2147483647;
		
		long longMinimo = -9223372036854775808L;
		long longMaximo = 9223372036854775807L;
		
		float floatMinimo = 1.4E-45F;
		float floatMaximo = 3.4028235E38F;
		
		double doubleMinimo = 4.9E-324;
		double doubleMaximo = 1.7976931348623157E308;
		
		boolean booleanFalse = false;
		boolean booleanTrue = true;
		
		char letra = 'a';
		char numero = '4';
		char caracterEspecial = '*';
		
		byte numeroByte = 1;
		short numeroShort = 1;
		int numeroInt = 1;
		long numeroLong = 1L;
		float numeroFloat = 1F;
		double numeroDouble = 1.0;
		boolean verdadeiro = true;
		char caracter = '1';
		
		numeroByte = (byte)numeroShort;
		numeroByte = (byte)numeroInt;
		numeroByte = (byte)numeroLong;
		numeroByte = (byte)numeroFloat;
		numeroByte = (byte)numeroDouble;
		numeroByte = (byte)caracter;

		numeroShort = numeroByte;
		numeroShort = (short)numeroInt;
		numeroShort = (short)numeroLong;
		numeroShort = (short)numeroFloat;
		numeroShort = (short)numeroDouble;
		numeroShort = (short)caracter;
		
		numeroInt = numeroByte;
		numeroInt = numeroShort;
		numeroInt = (int)numeroLong;
		numeroInt = (int)numeroFloat;
		numeroInt = (int)numeroDouble;
		numeroInt = caracter;
		
		numeroLong = numeroByte;
		numeroLong = numeroShort;
		numeroLong = numeroInt;
		numeroLong = (long)numeroFloat;
		numeroLong = (long)numeroDouble;
		numeroLong = caracter;
		
		numeroFloat = numeroByte;
		numeroFloat = numeroShort;
		numeroFloat = numeroInt;
		numeroFloat = numeroLong;
		numeroFloat = (float)numeroDouble;
		numeroFloat = caracter;
		
		numeroDouble = numeroByte;
		numeroDouble = numeroShort;
		numeroDouble = numeroInt;
		numeroDouble = numeroLong;
		numeroDouble = numeroFloat;
		numeroDouble = caracter;
		
		caracter = (char)numeroByte;
		caracter = (char)numeroShort;
		caracter = (char)numeroInt;
		caracter = (char)numeroLong;
		caracter = (char)numeroFloat;
		caracter = (char)numeroDouble;
		
	}
}
