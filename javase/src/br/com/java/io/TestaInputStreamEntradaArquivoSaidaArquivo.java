package br.com.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestaInputStreamEntradaArquivoSaidaArquivo {
	public static void main(String[] args) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));
			BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("saida.txt")));
			
			String linha = bufferedReader.readLine();
			
			while(linha != null){
				bufferedWriter.write(linha);
				bufferedWriter.newLine();
				linha = bufferedReader.readLine();
			}
			
			bufferedReader.close();
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
