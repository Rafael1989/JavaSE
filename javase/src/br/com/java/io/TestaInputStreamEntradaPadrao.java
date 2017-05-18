package br.com.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ctrl + z para finalizar
public class TestaInputStreamEntradaPadrao {
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
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
