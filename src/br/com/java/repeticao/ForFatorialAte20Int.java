package br.com.java.repeticao;

public class ForFatorialAte20Int {
	public static void main(String[] args) {
		int fatorial = 1;
		for(int i = 1;i <= 20;i++){
			fatorial = fatorial * i;
			System.out.println(fatorial);
		}
	}
}
