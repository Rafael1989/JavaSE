package br.com.java.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaScannerEntradaPadraoSaidaArquivoPrintStream {
	public static void main(String[] args) {
		
		try {
			Scanner scanner = new Scanner(System.in);
			PrintStream printStream = new PrintStream("saida.txt");
			while(scanner.hasNextLine()){
				printStream.println(scanner.nextLine());
			}
			printStream.flush();
			printStream.close();
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
