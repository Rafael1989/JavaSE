package br.com.java.casa.array.teste;

import br.com.java.casa.array.modelo.Casa;
import br.com.java.porta.modelo.Porta;

public class CasaTeste {
	public static void main(String[] args) {
		Casa casa = new Casa();
		Porta[]portas = new Porta[10];
		casa.setPortas(portas);
		Porta porta = new Porta();
		Porta porta2 = new Porta();
		Porta porta3 = new Porta();
		casa.adicionaPorta(porta);
		casa.adicionaPorta(porta2);
		casa.adicionaPorta(porta3);
		porta.abre();
		porta2.fecha();
		porta3.abre();
		System.out.println(casa.quantasPortasEstaoAbertas());
		System.out.println(casa.totalDePortas());
	}
}
