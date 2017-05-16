package br.com.java.string;

public class TestaSplit {
	public static void main(String[] args) {
		String s = "uma frase qualquer pode ser escrita";
		String[] ioda = s.split(" ");
		for(int i = ioda.length-1;i>=0;i--){
			System.out.print(ioda[i] + " ");
		}
	}
}
