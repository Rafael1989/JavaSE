package br.com.java.banco.teste;

import br.com.java.banco.modelo.Conta;
import br.com.java.exception.ValorInvalidoException;

public class TestaDeposita {
	public static void main(String[] args) {
		Conta conta = new br.com.java.banco.modelo.ContaCorrente();
		try{
			conta.deposita(-100);
		}catch(ValorInvalidoException e){
			System.out.println(e.getMessage());
		}
	}
}
