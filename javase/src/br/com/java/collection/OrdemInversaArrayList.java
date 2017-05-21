package br.com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdemInversaArrayList {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		for(int i = 0; i < 1000;i++){
			numeros.add(i);
		}
		
		Collections.reverse(numeros);
		
		System.out.println(numeros);
	}
}
