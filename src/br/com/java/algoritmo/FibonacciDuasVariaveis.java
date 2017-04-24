package br.com.java.algoritmo;

public class FibonacciDuasVariaveis {
	public static void main(String[] args) {
		int a = 0, b = 1;
		while (b <= 100) {
			System.out.print(a + " " + b + " ");
			a += b;
			b += a;
		}
	}
}
