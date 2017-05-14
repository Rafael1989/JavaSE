package br.com.java.banco.modelo;

import br.com.java.exception.ValorInvalidoException;
/**
 * 
 * Classe Responsável por moldar as contas do banco
 * 
 * @author OoORafael
 *
 */
public abstract class Conta {

	protected double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	/**
	 * Método que incrementa o saldo
	 * 
	 * @param valor
	 */
	public void deposita(double valor){
		if(valor < 0){
			throw new ValorInvalidoException(valor);
		}
		this.saldo += valor;
	}
	
	public abstract void atualiza(double taxa);
}
