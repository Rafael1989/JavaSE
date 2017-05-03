package br.com.java.casa.modelo;

import br.com.java.porta.modelo.Porta;

public class Casa {
	private String cor;
	private Porta porta1;
	private Porta porta2;
	private Porta porta3;
	
	public void pinta(String cor){
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	
	public int quantasPortasEstaoAbertas(){
		int quantidadeDePortasAbertas = 0;
		if(porta1.estaAberta().equals("está aberta")){
			quantidadeDePortasAbertas++;
		}
		if(porta2.estaAberta().equals("está aberta")){
			quantidadeDePortasAbertas++;
		}
		if(porta3.estaAberta().equals("está aberta")){
			quantidadeDePortasAbertas++;
		}
		return quantidadeDePortasAbertas;
	}
	
	public void setPorta1(Porta porta1) {
		this.porta1 = porta1;
	}
	
	public Porta getPorta1() {
		return porta1;
	}
	
	public void setPorta2(Porta porta2) {
		this.porta2 = porta2;
	}
	
	public Porta getPorta2() {
		return porta2;
	}
	
	public void setPorta3(Porta porta3) {
		this.porta3 = porta3;
	}
	
	public Porta getPorta3() {
		return porta3;
	}
}
