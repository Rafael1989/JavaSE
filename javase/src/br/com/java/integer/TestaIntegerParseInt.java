package br.com.java.integer;

public class TestaIntegerParseInt {
	public static void main(String[] args) {
		String valida = "1";
		String invalida = "a";
		
		System.out.println(Integer.parseInt(valida)+1);
		System.out.println(Integer.parseInt(invalida)); //Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
	}
}
