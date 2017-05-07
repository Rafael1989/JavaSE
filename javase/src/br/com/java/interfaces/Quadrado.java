package br.com.java.interfaces;

public class Quadrado implements AreaCalculavel{
	
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return Math.pow(this.lado, 2);
	}

}
