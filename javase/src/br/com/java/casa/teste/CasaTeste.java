package br.com.java.casa.teste;

import br.com.java.casa.modelo.Casa;
import br.com.java.porta.modelo.Porta;

public class CasaTeste {
	public static void main(String[] args) {
		Casa casa = new Casa();
		casa.pinta("Verde");
		Porta porta1 = new Porta();
		Porta porta2 = new Porta();
		Porta porta3 = new Porta();
		casa.setPorta1(porta1);
		casa.setPorta2(porta2);
		casa.setPorta3(porta3);
		casa.getPorta1().abre();
		casa.getPorta2().fecha();
		casa.getPorta3().abre();
		System.out.println("Cor da casa: " + casa.getCor());
		System.out.println("A porta 1 " + casa.getPorta1().estaAberta());
		System.out.println("A porta 2 " + casa.getPorta2().estaAberta());
		System.out.println("A porta 3 " + casa.getPorta3().estaAberta());
		System.out.println("Há " + casa.quantasPortasEstaoAbertas() + " portas abertas.");
	}
}
