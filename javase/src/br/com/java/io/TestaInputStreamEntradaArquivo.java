package br.com.java.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestaInputStreamEntradaArquivo {
	public static void main(String[] args) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));
			
			String linha = bufferedReader.readLine();
			
			while(linha != null){
				System.out.println(linha);
				linha = bufferedReader.readLine();
			}
			
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
