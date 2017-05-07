package br.com.java.banco.modelo;

public class PessoaFisica {
	
	public PessoaFisica(String cpf) throws Exception {
		if(!validaCpf(cpf)){
			throw new Exception();
		}
	}
	
	private boolean validaCpf(String cpf){
		if(cpf.length()!=11){
			return false;
		}
		return true;
	}
}
