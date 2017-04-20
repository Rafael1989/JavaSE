package br.com.java.algoritmo;

import java.util.Scanner;

public class AlgoritmoLogica {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		while(numero!=1){
			if(numero%2==0){
				numero = numero / 2;
			}else{
				numero = 3 * numero + 1;
			}
			System.out.println(numero);
		}
			
	}
}
