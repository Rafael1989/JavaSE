package br.com.java.algoritmo;

public class FibonacciRecursivoArray {
	static int tamanhoArrayPopulado;
	public static void calculaFibonacci(Integer[] fib, Integer num) {
		tamanhoArrayPopulado = 0;
		for(int i = 0;i<fib.length;i++){
			if(fib[i]==null){
				break;
			}
			tamanhoArrayPopulado++;
		}
		if (num > 0) {
			if (tamanhoArrayPopulado == 0) {
				fib[0] = 0;
			} else if (tamanhoArrayPopulado == 1) {
				fib[1] = 1;
			} else {
				fib[tamanhoArrayPopulado] = (fib[tamanhoArrayPopulado-2] + fib[tamanhoArrayPopulado-1]);
			}
			calculaFibonacci(fib, --num);
		}
	}
	public static void main (String[] args) {
		Integer[] fib = new Integer[10];
		calculaFibonacci(fib, 7);
		for(int i = 0;i<tamanhoArrayPopulado;i++){
			System.out.println(fib[i]);
		}
	}
}
