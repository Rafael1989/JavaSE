package br.com.java.banco.modelo;

public class Funcionario {

	private String nome;
	private String departamento;
	private double salario;
	private Data dataAdmissao = new Data();
	private String rg;

	public void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	public double calculaGanhoAnual() {
		return this.salario * 12;
	}
	
	public void mostra(){
		System.out.println("Registro Geral: " + this.getRg());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Data de admissão: " + this.dataAdmissao.formatada());
		System.out.println("Departamento: " + this.getDepartamento());
		System.out.println("Salário: R$ " + this.getSalario());
		System.out.println("Ganho anual: R$ " + this.calculaGanhoAnual());
		System.out.println("-------------------------------------------------------");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getDataAdmissao() {
		return dataAdmissao;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
