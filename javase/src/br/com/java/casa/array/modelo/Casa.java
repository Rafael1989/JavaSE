package br.com.java.casa.array.modelo;

import br.com.java.porta.modelo.Porta;

public class Casa {
	private String cor;
	private int totalDePortas;
	private Porta [] portas;
	
	public void pinta(String cor){
		this.cor = cor;
	}
	
	public int quantasPortasEstaoAbertas(){
		int portasAbertas = 0;
		for(int i = 0;i<this.portas.length;i++){
			if(this.portas[i]!= null){
				String estaAberta = this.portas[i].estaAberta();
				if(estaAberta.equals("está aberta")){
					portasAbertas++;
				}
			}else{
				break;
			}
		}
		return portasAbertas;
	}
	
	public void adicionaPorta(Porta porta){
		for(int i = 0;i<this.portas.length;i++){
			if(this.portas[i]==null){
				this.portas[i] = porta;
				break;
			}
		}
	}
	
	public int totalDePortas(){
		this.totalDePortas = 0;
		for(int i = 0;i<this.portas.length;i++){
			if(this.portas[i]==null){
				break;
			}
			this.totalDePortas++;
		}
		return this.totalDePortas;
	}
	
	public void setPortas(Porta[] portas) {
		this.portas = portas;
	}
	
	public Porta[] getPortas() {
		return portas;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
}
