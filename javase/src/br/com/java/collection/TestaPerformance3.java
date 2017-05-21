package br.com.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformance3 {
	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		//List<Integer> numeros = new ArrayList<>(); // tempo 16
		List<Integer> numeros = new LinkedList<>(); //tempo 718
		
		for(int i = 0;i<30000;i++){
			numeros.add(i);
		}
		
		for(int i = 0;i<30000;i++){
			numeros.get(i);
		}
		
		long fim = System.currentTimeMillis();
		System.out.println(fim - inicio);
	}
}
