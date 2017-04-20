package br.com.java.algoritmo;

public class ForFatorialAte30Int {
	public static void main(String[] args) {
		int fatorial = 1;
		for(int i = 1;i<=30;i++){
			fatorial = fatorial * i;
			System.out.println(fatorial);
		}
	}
}
