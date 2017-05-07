package br.com.java.banco.teste;

import br.com.java.banco.modelo.AtualizadorDeContas;
import br.com.java.banco.modelo.Banco;
import br.com.java.banco.modelo.ContaCorrente;
import br.com.java.banco.modelo.ContaPoupanca;

public class BancoTeste {
	public static void main(String[] args) {
		Banco banco = new Banco(10);
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		banco.adiciona(contaCorrente);
		banco.adiciona(contaPoupanca);
		
		AtualizadorDeContas atualizadorDeContas = new AtualizadorDeContas(0.01);
		
		for(int i = 0;i<banco.getTotalDeContas();i++){
			banco.getConta(i).deposita(100);
			banco.getConta(i).saca(20);
			atualizadorDeContas.roda(banco.getConta(i));
		}
	}
}
