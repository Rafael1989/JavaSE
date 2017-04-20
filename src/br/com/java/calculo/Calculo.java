package br.com.java.calculo;

public class Calculo {
	public static void main(String[] args) {
		int janeiro = 15000;
		int fevereiro = 23000;
		int marco = 17000;
		int gastoTrimestral = janeiro + fevereiro + marco;
		double mediaMensal = gastoTrimestral / 3;
		System.out.println("Gasto trimestral : " + gastoTrimestral);
		System.out.println("Média mensal : " + mediaMensal);
				
	}
}
