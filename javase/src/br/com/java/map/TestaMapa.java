package br.com.java.map;

import java.util.HashMap;
import java.util.Map;

import br.com.java.banco.modelo.Conta;
import br.com.java.banco.modelo.ContaCorrente;

public class TestaMapa {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.deposita(100);
		
		Conta conta2 = new ContaCorrente();
		conta2.deposita(300);
		
		Map<String, Conta> contas = new HashMap<>();
		contas.put("gerente", conta);
		contas.put("diretor", conta2);
		
		Conta conta3 = contas.get("diretor");
		System.out.println(conta3.getSaldo());
	}
}
