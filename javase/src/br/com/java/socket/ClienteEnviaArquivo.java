package br.com.java.socket;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteEnviaArquivo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket cliente = new Socket("127.0.0.1", 12345);
		System.out.println("O cliente se conectou ao servidor");
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));
		String linha = bufferedReader.readLine();
		
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		while(linha != null){
			saida.println(linha);
			linha = bufferedReader.readLine();
		}
		saida.flush();
		saida.close();
		bufferedReader.close();
	}
}
