package br.com.java.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformance {
	public static void main(String[] args) {
		int total = 30000;
		long inicio = System.currentTimeMillis();
		Collection<Integer> numeros = new ArrayList<>(); //tempo 15 + 875 = 890
		//Collection<Integer> numeros = new HashSet<>(); //tempo 15 + 16 = 31
		long inicioPrimeiroFor = System.currentTimeMillis();
		for(int i = 0;i<total;i++){
			numeros.add(i);
		}
		long fimPrimeiroFor = System.currentTimeMillis();
		long tempoPrimeiroFor = fimPrimeiroFor - inicioPrimeiroFor;
		long inicioSegundoFor = System.currentTimeMillis();
		for(int i = 0;i<total;i++){
			numeros.contains(i);
		}
		long fimSegundoFor = System.currentTimeMillis();
		long tempoSegundoFor = fimSegundoFor - inicioSegundoFor;
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("tempo primeiro for " + tempoPrimeiroFor);
		System.out.println("tempo segundo for " + tempoSegundoFor);
		System.out.println("tempo total " + tempo);
		
		
	}
}
