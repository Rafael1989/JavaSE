package br.com.java.repeticao;

public class ForFatorial {
	public static void main(String[] args) {
		int fatorial = 1;
		for(int i = 1;i<=10;i++){
			System.out.println(fatorial * i);
			fatorial = fatorial * i;
		}
	}
}
