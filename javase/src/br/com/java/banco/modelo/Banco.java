package br.com.java.banco.modelo;

public class Banco {
	
	private Conta[] contas;
	
	public Banco(int quantidadeDeContas){
		this.contas = new Conta[quantidadeDeContas];
	}
	
	public void adiciona(Conta conta){
		for(int i = 0;i<this.contas.length;i++){
			if(this.contas[i]==null){
				this.contas[i] = conta;
				break;
			}
		}
	}
	
	public Conta getConta(int posicao){
		return this.contas[posicao];
	}
	
	public int getTotalDeContas(){
		int totalDeContas = 0;
		for(int i = 0;i<this.contas.length;i++){
			if(this.contas[i]==null){
				break;
			}
			totalDeContas++;
		}
		return totalDeContas;
	}
}
