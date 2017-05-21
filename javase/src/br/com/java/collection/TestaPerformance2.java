package br.com.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformance2 {
	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		//List<Integer> numeros = new ArrayList<>(); //tempo 117
		List<Integer> numeros = new LinkedList<>(); //tempo 10
		
		for(int i = 0;i<30000;i++){
			numeros.add(0,i);
		}
		long fim = System.currentTimeMillis();
		System.out.println(fim - inicio);
	}
}
