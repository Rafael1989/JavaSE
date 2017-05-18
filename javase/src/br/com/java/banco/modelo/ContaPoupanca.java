package br.com.java.banco.modelo;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		/*
		 * ordena pelo número da conta
	 	if(this.getNumero() < o.getNumero()){
			return -1;
		}
		if(this.getNumero() > o.getNumero()){
			return 1;
		}
		return 0;
		return this.getNumero() - o.getNumero();
		*/
		//ordena por ordem alfabética
		return this.getNome().compareToIgnoreCase(o.getNome()); 
		
	}
	
}
