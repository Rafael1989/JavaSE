package br.com.java.abstrata;

import br.com.java.banco.modelo.Conta;
import br.com.java.banco.modelo.ContaCorrente;

public class TestaClasseAbstrata {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		System.out.println(conta);
	}
}
