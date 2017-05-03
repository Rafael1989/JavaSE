package br.com.java.porta.modelo;

public class Porta {

	private boolean aberta;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;

	public void abre() {
		this.aberta = true;
	}

	public void fecha() {
		this.aberta = false;
	}

	public void pinta(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}

	public String estaAberta() {
		return (this.aberta)?"está aberta":"está fechada";
	}

	public double getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public double getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public double getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}

}
