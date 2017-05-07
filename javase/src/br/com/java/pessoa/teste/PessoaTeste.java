package br.com.java.pessoa.teste;

import br.com.java.pessoa.modelo.Pessoa;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("aaaaaa");
		pessoa.setIdade(111);
		pessoa.fazAniversario();
		pessoa.fazAniversario();
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
	}
}
