package br.com.java.porta.teste;

import br.com.java.porta.modelo.Porta;

public class PortaTeste {
	public static void main(String[] args) {
		Porta porta = new Porta();
		porta.abre();
		porta.fecha();
		porta.pinta("verde");
		porta.pinta("branco");
		porta.pinta("vermelho");
		porta.setDimensaoX(0.5);
		porta.setDimensaoY(2.3);
		porta.setDimensaoZ(0.2);
		System.out.println("A porta " + porta.estaAberta());
		System.out.println("Cor da porta: " + porta.getCor());
		System.out.println("Largura da porta: " + porta.getDimensaoX());
		System.out.println("Altura da porta: " + porta.getDimensaoY());
		System.out.println("Profundidade da porta: " + porta.getDimensaoZ());
	}
}
