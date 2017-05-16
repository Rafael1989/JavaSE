package br.com.java.string;

public class TestaCharAtELengthTrazPraFrente {
	public static void main(String[] args) {
		String s = "Socorram-me, subi no ônibus em Marrocos";
		for(int i = s.length()-1;i >= 0;i--){
			System.out.print(s.charAt(i));
		}
		System.out.println();
		String s2 = "Anotaram a data da maratona";
		for(int i = s2.length()-1;i >= 0;i--){
			System.out.print(s2.charAt(i));
		}
	}
}
