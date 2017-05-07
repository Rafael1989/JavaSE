package br.com.java.banco.modelo;

public abstract class Conta {

	protected double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public abstract void atualiza(double taxa);
}
