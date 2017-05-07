package br.com.java.banco.teste;

import br.com.java.banco.modelo.Empresa;
import br.com.java.banco.modelo.Funcionario;

public class EmpresaTeste {
	public static void main(String[] args) {
		Empresa empresa = new Empresa(10);
		empresa.setCnpj("111111111111-11");
		empresa.setNome("qqqqq");
		Funcionario funcionario = new Funcionario();
		funcionario.setDepartamento("Recursos Humanos");
		funcionario.setNome("Thubiru");
		funcionario.setRg("11111111-1");
		funcionario.setSalario(800);
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setDepartamento("Financeiro");
		funcionario2.setNome("Biru");
		funcionario2.setRg("22222222-2");
		funcionario2.setSalario(4000);
		empresa.adiciona(funcionario);
		empresa.adiciona(funcionario2);
		empresa.mostraEmpregados();
		System.out.println(empresa.contem(funcionario2));
	}
}
