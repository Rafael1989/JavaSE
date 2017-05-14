package br.com.java.integer;

public class TestaIntegerIgual {
	public static void main(String[] args) {
		Integer i1 = new Integer("1");
		Integer i2 = new Integer("1");
		
		System.out.println((i1 == i2)?"[=]":"[!=]");
	}
}
