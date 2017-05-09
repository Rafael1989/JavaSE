package br.com.java.exception;

public class ArrayIndexOutOfBoundsExceptionTeste {
	public static void main(String[] args) {
		System.out.println("in�cio do main");
		try{
			metodo1();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("erro: " + e);
		}
		System.out.println("fim do main");
	}

	private static void metodo1() {
		System.out.println("in�cio do m�todo 1");
		metodo2();
		System.out.println("fim do m�todo 1");
	}

	private static void metodo2() {
		System.out.println("in�cio do m�todo 2");
		int[]array = new int[10];
		
		for(int i = 0;i<15;i++){
			array[i] = i;
			System.out.println(i);
		}
		
		System.out.println("fim do m�todo 2");
	}
}
