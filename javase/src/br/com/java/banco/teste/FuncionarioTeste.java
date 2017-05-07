package br.com.java.banco.teste;

import br.com.java.banco.modelo.Funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario joao = new Funcionario("João Nascimento");
		joao.setRg("38.000.451-3");
		joao.getDataAdmissao().setDia(31);
		joao.getDataAdmissao().setMes(2);
		joao.getDataAdmissao().setAno(2005);
		joao.setDepartamento("Tecnologia da Informação");
		joao.setSalario(5000);
		joao.recebeAumento(5000);
		joao.mostra();
		
		Funcionario jose = new Funcionario();
		jose.setRg("38.000.451-3");
		jose.setNome("João Nascimento");
		jose.getDataAdmissao().setDia(1);
		jose.getDataAdmissao().setMes(4);
		jose.getDataAdmissao().setAno(2016);
		jose.setDepartamento("Tecnologia da Informação");
		jose.setSalario(5000);
		jose.recebeAumento(5000);
		jose.mostra();
		
		if(joao == jose){
			System.out.println(joao.getNome() + " é igual a " + jose.getNome());
		}else{
			System.out.println(joao.getNome() + " é diferente de " + jose.getNome());
		}
		
		Funcionario manoel = jose;
		manoel.mostra();
		
		if(manoel == jose){
			System.out.println(manoel.getNome() + " é igual a " + jose.getNome());
		}else{
			System.out.println(manoel.getNome() + " é diferente de " + jose.getNome());
		}
		
	}
}
