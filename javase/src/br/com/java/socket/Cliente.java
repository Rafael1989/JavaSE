package br.com.java.socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = scanner.nextLine();
		new Cliente("127.0.0.1", 12345, nome).executa();
	}
	
	private String host;
	private int porta;
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public Cliente(String host, int porta, String nome) {
		this.host = host;
		this.porta = porta;
		this.nome = nome;
	}
	
	public void executa() throws IOException{
		Socket cliente = new Socket(this.host, this.porta);
		System.out.println("O cliente se conectou ao servidor.");
		
		Recebedor r = new Recebedor(cliente.getInputStream());
		new Thread(r).start();
		
		Scanner teclado = new Scanner(System.in);
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		
		while(teclado.hasNextLine()){
			saida.print(nome+":");
			saida.println(teclado.nextLine());
		}
		
		saida.close();
		teclado.close();
		cliente.close();
	}
}
