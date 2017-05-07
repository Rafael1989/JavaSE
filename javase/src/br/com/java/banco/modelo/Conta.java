package br.com.java.banco.modelo;

public class Conta {

	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa;
	}
}
