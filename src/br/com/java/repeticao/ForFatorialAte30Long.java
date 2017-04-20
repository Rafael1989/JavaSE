package br.com.java.repeticao;

public class ForFatorialAte30Long {
	public static void main(String[] args) {
		long fatorial = 1;
		for(int i = 1; i<=30;i++){
			fatorial = fatorial * i;
			System.out.println(fatorial);
		}
	}
}
