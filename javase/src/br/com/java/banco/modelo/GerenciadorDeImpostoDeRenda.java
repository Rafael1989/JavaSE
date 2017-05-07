package br.com.java.banco.modelo;

public class GerenciadorDeImpostoDeRenda {
	
	private double totalTributos;
	
	public void adiciona(Tributavel tributavel){
		this.totalTributos += tributavel.calculaTributos();
	}
	
	public double getTotalTributos() {
		return totalTributos;
	}

}
