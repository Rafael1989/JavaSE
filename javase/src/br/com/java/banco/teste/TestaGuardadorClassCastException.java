package br.com.java.banco.teste;

import br.com.java.banco.modelo.ContaCorrente;
import br.com.java.banco.modelo.ContaPoupanca;
import br.com.java.banco.modelo.GuardadorDeObjetos;

public class TestaGuardadorClassCastException {
	public static void main(String[] args) {
		GuardadorDeObjetos guardadorDeObjetos = new GuardadorDeObjetos();
		ContaCorrente contaCorrente = new ContaCorrente();
		guardadorDeObjetos.adicionaObjeto(contaCorrente);
		ContaPoupanca contaPoupanca = (ContaPoupanca) guardadorDeObjetos.pegaObjeto(0);
		System.out.println(contaPoupanca);
	}
}
