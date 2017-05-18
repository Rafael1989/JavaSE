package br.com.java.banco.teste;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.java.banco.modelo.ContaPoupanca;

public class TestaOrdenacaoContas {
	public static void main(String[] args) {
		//List<ContaPoupanca> lista = new ArrayList<ContaPoupanca>();
		List<ContaPoupanca> lista = new LinkedList<ContaPoupanca>();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNumero(1);
		contaPoupanca.setNome("Alberto");
		contaPoupanca.deposita(200);
		ContaPoupanca contaPoupanca2 = new ContaPoupanca();
		contaPoupanca2.setNumero(2);
		contaPoupanca2.deposita(100);
		contaPoupanca2.setNome("Bruno");
		ContaPoupanca contaPoupanca3 = new ContaPoupanca();
		contaPoupanca3.setNumero(3);
		contaPoupanca3.deposita(400);
		contaPoupanca3.setNome("Caio");
		for(int i = 0;i<10;i++){
			ContaPoupanca cp = new ContaPoupanca();
			cp.setNumero(i+1);
			cp.setNome("Dario");
			cp.deposita(new Random().nextDouble()*1000);
			lista.add(cp);
		}
		lista.add(contaPoupanca);
		lista.add(contaPoupanca2);
		lista.add(contaPoupanca3);
		Collections.sort(lista);
		//Collections.reverse(lista);
		//Collections.rotate(lista, 2);
		//Collections.shuffle(lista);
		System.out.println(lista);
		for(ContaPoupanca contaPoupanca4 : lista){
			System.out.println(contaPoupanca4.getNome() + " " + contaPoupanca4.getNumero() + " com saldo R$" + new DecimalFormat("##.##").format(contaPoupanca4.getSaldo()));
		}
	}
}
