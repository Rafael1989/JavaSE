package br.com.java.banco.teste;

import br.com.java.banco.modelo.AtualizadorDeContas;
import br.com.java.banco.modelo.Conta;
import br.com.java.banco.modelo.ContaCorrente;
import br.com.java.banco.modelo.ContaPoupanca;

public class TestaContas {
	public static void main(String[] args) {
		Conta contaCorrente = new ContaCorrente();
		Conta contaPoupanca = new ContaPoupanca();
		
		contaCorrente.deposita(100);
		contaPoupanca.deposita(100);
		
		contaCorrente.saca(50);
		contaPoupanca.saca(50);
		
		/*conta.atualiza(0.01);
		contaCorrente.atualiza(0.01);
		contaPoupanca.atualiza(0.01);
		
		System.out.println(conta.getSaldo());
		System.out.println(contaCorrente.getSaldo());
		System.out.println(contaPoupanca.getSaldo());*/
		
		AtualizadorDeContas atualizadorDeContas = new AtualizadorDeContas(0.01);
		atualizadorDeContas.roda(contaPoupanca);
		atualizadorDeContas.roda(contaCorrente);
		
		System.out.println("Saldo total: "+atualizadorDeContas.getSaldoTotal());
	}
}
