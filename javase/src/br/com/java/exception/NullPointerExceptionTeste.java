package br.com.java.exception;

import br.com.java.interfaces.Conta;

public class NullPointerExceptionTeste {
	public static void main(String[] args) {
		Conta conta = null;
		conta.getSaldo();
	}
}
