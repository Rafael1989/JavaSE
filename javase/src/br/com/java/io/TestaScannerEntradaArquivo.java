package br.com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestaScannerEntradaArquivo {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new FileInputStream("arquivo.txt"));
			
			while(scanner.hasNext()){
				String linha = scanner.nextLine();
				System.out.println(linha);
			}
			
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
