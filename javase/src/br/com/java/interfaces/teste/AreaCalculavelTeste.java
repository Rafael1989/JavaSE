package br.com.java.interfaces.teste;

import br.com.java.interfaces.AreaCalculavel;
import br.com.java.interfaces.Circulo;
import br.com.java.interfaces.Quadrado;
import br.com.java.interfaces.Retangulo;

public class AreaCalculavelTeste {
	public static void main(String[] args) {
		AreaCalculavel areaCalculavel = new Quadrado(2.5);
		System.out.println(areaCalculavel.calculaArea());
		
		AreaCalculavel areaCalculavel2 = new Retangulo(2.5,5.7);
		System.out.println(areaCalculavel2.calculaArea());
		
		AreaCalculavel areaCalculavel3 = new Circulo(2.5);
		System.out.println(areaCalculavel3.calculaArea());
	}
}
