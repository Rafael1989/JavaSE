package br.com.java.interfaces;

public class ContaCorrente implements ContaTributavel{
	
	private double saldo;

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor-0.1;
	}

	@Override
	public void retira(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void atualiza(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic * 3;
	}

	@Override
	public double calculaTributos() {
		return this.saldo * 0.01;
	}

}
