package br.com.java.interfaces;

public interface Conta {
	
	public double getSaldo();
	public void deposita(double valor);
	public void retira(double valor);
	public void atualiza(double taxaSelic);
}
