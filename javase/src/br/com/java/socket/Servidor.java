package br.com.java.socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Servidor {
	public static void main(String[] args) throws IOException {
		new Servidor(12345).executa();
	}
	
	private int porta;
	private List<PrintStream> clientes;
	
	public List<PrintStream> getClientes() {
		return clientes;
	}
	
	public Servidor(int porta) {
		this.porta = porta;
		this.clientes = new ArrayList<>();
	}
	
	public void executa() throws IOException{
		ServerSocket servidor = new ServerSocket(this.porta);
		System.out.println("Porta 12345 aberta!");
		int contador = 0;
		while(true){
			Socket cliente = servidor.accept();
			System.out.println("Nova conexão com o cliente " + cliente.getInetAddress().getHostAddress());
			PrintStream ps = new PrintStream(cliente.getOutputStream());
			this.clientes.add(ps);
			TrataCliente tc = new TrataCliente(cliente.getInputStream(), this, contador);
			new Thread(tc).start();
			contador++;
		}
	}
	
	public void distribuiMensagem(String msg){
		for(PrintStream cliente : this.clientes){
			cliente.println(msg);
		}
	}
}
