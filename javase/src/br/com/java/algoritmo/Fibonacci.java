package br.com.java.algoritmo;

public class Fibonacci {
	public static void main(String[] args) {
		int anterior = 1;
		int anteanterior = 0;
		int atual = 0;
		for(int i = 0;i<10;i++){
			if(i == 0 || i == 1){
				System.out.println(i);
			}
			atual = anterior + anteanterior;
			System.out.println(atual);
			anteanterior = anterior;
			anterior = atual;
		}
	}
}
