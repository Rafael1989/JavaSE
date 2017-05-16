package br.com.java.equals;

import br.com.java.banco.modelo.ContaCorrente;

public class TestaEquals {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setNumero(1);
		contaCorrente.deposita(200);
		ContaCorrente contaCorrente2 = new ContaCorrente();
		contaCorrente2.setNumero(1);
		contaCorrente2.deposita(300);
		if(contaCorrente.equals(contaCorrente2)){
			System.out.println("São iguais");
		}
		if(contaCorrente==contaCorrente2){
			System.out.println("São mesmo");
		}
		
		ContaCorrente contaCorrente3 = new ContaCorrente();
		contaCorrente3.setNumero(1);
		contaCorrente3.setNome("a");
		contaCorrente3.deposita(200);
		ContaCorrente contaCorrente4 = new ContaCorrente();
		contaCorrente4.setNumero(2);
		contaCorrente4.setNome("a");
		contaCorrente4.deposita(300);
		if(contaCorrente3.equals(contaCorrente4)){
			System.out.println("São iguais");
		}
		if(contaCorrente3==contaCorrente4){
			System.out.println("São mesmo");
		}
	}
}
