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
	
	private int numero;
	
	private String nome;

	protected double saldo;
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
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
	
	@Override
	public String toString() {
		return "Esse objeto é uma conta com saldo: R$" + this.saldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta)obj;
		
		return this.numero == outraConta.getNumero() || this.nome == outraConta.getNome();
	}
}
