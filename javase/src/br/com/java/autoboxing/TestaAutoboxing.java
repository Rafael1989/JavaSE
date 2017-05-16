package br.com.java.autoboxing;

import br.com.java.banco.modelo.GuardadorDeObjetos;

public class TestaAutoboxing {
	public static void main(String[] args) {
		GuardadorDeObjetos guardadorDeObjetos = new GuardadorDeObjetos();
		int i = 5;
		guardadorDeObjetos.adicionaObjeto(i);
		Integer integer = new Integer((int) guardadorDeObjetos.pegaObjeto(0));
		System.out.println(integer);
	}
}
