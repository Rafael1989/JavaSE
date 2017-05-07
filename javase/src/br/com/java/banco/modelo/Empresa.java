package br.com.java.banco.modelo;

public class Empresa {

	private String nome;
	private String cnpj;
	private Funcionario [] funcionarios;
	
	public Empresa(int quantidadeFuncionarios){
		this.funcionarios = new Funcionario[quantidadeFuncionarios];
	}
	
	public void adiciona(Funcionario funcionario){
		boolean quantidadeFuncionariosLotou = true;
		for(int i = 0; i < funcionarios.length;i++){
			if(funcionarios[i] == null){
				this.funcionarios[i] = funcionario;
				quantidadeFuncionariosLotou = false;
				break;
			}
		}
		if(quantidadeFuncionariosLotou){
			Funcionario [] funcionariosTemporario = new Funcionario[this.funcionarios.length*2];
			for(int i = 0;i<this.funcionarios.length;i++){
				if(this.funcionarios[i]!= null){
					funcionariosTemporario[i] = this.funcionarios[i];
				}
			}
			this.funcionarios = funcionariosTemporario;
		}
	}
	
	public void mostraEmpregados(){
		System.out.println("Nome da empresa: " + this.getNome());
		System.out.println("CNPJ da empresa: " + this.getCnpj());
		for(int i = 0;i<this.funcionarios.length;i++){
			if(this.funcionarios[i]!= null){
				this.funcionarios[i].mostra();
			}
		}
	}
	
	public boolean contem(Funcionario funcionario){
		if(getFuncionario(Funcionario.identificador-1)!=null){
			return true;
		}
		return false;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public Funcionario getFuncionario(int posicao) {
		return funcionarios[posicao];
	}
	
}
