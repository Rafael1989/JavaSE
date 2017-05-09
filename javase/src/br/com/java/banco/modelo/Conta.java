package br.com.java.banco.modelo;

import br.com.java.exception.ValorInvalidoException;

public abstract class Conta {

	protected double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public void deposita(double valor){
		if(valor < 0){
			throw new ValorInvalidoException(valor);
		}
		this.saldo += valor;
	}
	
	public abstract void atualiza(double taxa);
}
