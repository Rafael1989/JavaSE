package br.com.java.socket;

import java.io.InputStream;
import java.util.Scanner;

public class TrataCliente implements Runnable{

	private InputStream cliente;
	private Servidor servidor;
	private int id;
	
	public TrataCliente(InputStream cliente, Servidor servidor, int id) {
		this.cliente = cliente;
		this.servidor = servidor;
		this.id = id;
	}
	
	@Override
	public void run() {
		Scanner s = new Scanner(this.cliente);
		while(s.hasNext()){
			servidor.distribuiMensagem(s.nextLine());
		}
		servidor.getClientes().remove(servidor.getClientes().get(id));
		s.close();
	}

}
