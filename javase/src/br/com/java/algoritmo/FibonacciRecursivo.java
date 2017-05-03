package br.com.java.algoritmo;

public class FibonacciRecursivo {

	public static void main(String[] args) {
		for(int i = 1;i<=6;i++ ){
			System.out.print(calculaFibonacci(i) + " ");
		}
	}

	private static int calculaFibonacci(int i) {
		return (i<=2)?1:calculaFibonacci(i-1)+ calculaFibonacci(i-2);
	}
}
