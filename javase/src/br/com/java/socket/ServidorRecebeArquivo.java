package br.com.java.socket;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServidorRecebeArquivo {
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta!");
		
		Socket cliente = servidor.accept();
		System.out.println("Nova conexão com o cliente " + cliente.getInetAddress().getHostAddress());
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("saida2.txt")));
		Scanner entrada = new Scanner(cliente.getInputStream());
		while(entrada.hasNext()){
			String linha = entrada.nextLine();
			bufferedWriter.write(linha);
			bufferedWriter.newLine();
		}
		
		entrada.close();
		bufferedWriter.close();
		servidor.close();
	}
}
