package br.com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TestaScannerDelimiter {
	public static void main(String[] args) {
		Scanner scanner;
		try {
			scanner = new Scanner(new FileInputStream("arquivo.txt"));
			scanner = scanner.useDelimiter(Pattern.compile("[^abc]"));
			while(scanner.hasNextLine()){
				String linha = scanner.nextLine();
				if(linha.contains("linha"))
				System.out.println(linha);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
