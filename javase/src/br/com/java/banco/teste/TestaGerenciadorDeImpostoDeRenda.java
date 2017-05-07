package br.com.java.banco.teste;

import br.com.java.banco.modelo.ContaCorrente;
import br.com.java.banco.modelo.GerenciadorDeImpostoDeRenda;
import br.com.java.banco.modelo.SeguroDeVida;

public class TestaGerenciadorDeImpostoDeRenda {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.deposita(100);
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		GerenciadorDeImpostoDeRenda gerenciadorDeImpostoDeRenda = new GerenciadorDeImpostoDeRenda();
		gerenciadorDeImpostoDeRenda.adiciona(contaCorrente);
		gerenciadorDeImpostoDeRenda.adiciona(seguroDeVida);
		System.out.printf("R$%.2f",gerenciadorDeImpostoDeRenda.getTotalTributos());
	}
}
