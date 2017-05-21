package br.com.java.banco.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BancoList {

	private List<Conta> contas = new ArrayList<>();
	private Map<String,Conta> mapaContas = new HashMap<>();
	
	public void adiciona(Conta conta){
		this.contas.add(conta);
		this.mapaContas.put(conta.getNome(),conta);
	}
	
	public Conta pega(int indice){
		return this.contas.get(indice);
	}
	
	public int pegaTotalDeContas(){
		return this.mapaContas.size();
	}
	
	public Conta buscaPorNome(String nome){
		return this.mapaContas.get(nome);
	}
}
