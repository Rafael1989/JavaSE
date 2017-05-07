package br.com.java.banco.teste;

import br.com.java.banco.modelo.ContaCorrente;
import br.com.java.banco.modelo.SeguroDeVida;
import br.com.java.banco.modelo.Tributavel;

public class TestaTributavel {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.deposita(100);
		Tributavel t1 = contaCorrente;
		System.out.println(t1.calculaTributos());
		Tributavel t2 = new SeguroDeVida();
		System.out.println(t2.calculaTributos());
	}
}
