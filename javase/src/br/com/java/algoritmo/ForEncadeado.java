package br.com.java.algoritmo;

import java.util.Scanner;

public class ForEncadeado {
	public static void main(String[] args) {
		int numeroDeLinhas = new Scanner(System.in).nextInt();
		for(int i = 1;i<numeroDeLinhas;i++){
			for(int j = i;j<=i*i;j+=i){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
