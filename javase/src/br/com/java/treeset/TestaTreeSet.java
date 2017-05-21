package br.com.java.treeset;

import java.util.TreeSet;

public class TestaTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> numeros = new TreeSet<>();
		
		for(int i = 0;i<1000;i++){
			numeros.add(i);
		}
		
		System.out.println(numeros.descendingSet());
	}
}
