package br.com.java.banco.teste;

import br.com.java.banco.modelo.PessoaFisica;

public class PessoaFisicaTeste {
	public static void main(String[] args) {
		try {
			PessoaFisica pessoaFisica = new PessoaFisica("11111111111");
			System.out.println("cpf v�lido");
		} catch (Exception e) {
			System.out.println("Digite um cpf v�lido");
		}
	}
}
