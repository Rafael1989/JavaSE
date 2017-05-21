package br.com.java.thread;

public class TestaPrograma {
	public static void main(String[] args) {
		
		Programa programa = new Programa();
		programa.setId(1);
		
		Thread thread = new Thread(programa);
		thread.start();
		
		Programa programa2 = new Programa();
		programa2.setId(2);
		
		Thread thread2 = new Thread(programa2);
		thread2.start();
		
	}
}
