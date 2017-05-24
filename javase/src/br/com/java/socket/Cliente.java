package br.com.java.socket;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = scanner.nextLine();
		System.out.println("Teclado do " + nome);
		System.out.println("------------------------------------------------------------------------");
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
		
		
		Recebedor r = new Recebedor(cliente.getInputStream());
		new Thread(r).start();
		
		Scanner teclado = new Scanner(new FileInputStream("arquivo.txt"));
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		saida.println(nome+" entrou na sala");
		while(teclado.hasNextLine()){
			saida.print(nome+" disse: ");
			saida.println(teclado.nextLine());
		}
		
		
	}
}
