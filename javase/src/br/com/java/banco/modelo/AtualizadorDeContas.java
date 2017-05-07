package br.com.java.banco.modelo;

public class AtualizadorDeContas {
	
	private double selic;
	private double saldoTotal;
	
	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}
	
	public void roda(Conta conta){
		System.out.println("Saldo anterior: " + conta.getSaldo());
		conta.atualiza(selic);
		System.out.println("Saldo atualizado: " + conta.getSaldo());
		saldoTotal += conta.getSaldo();
	}
	
	public double getSaldoTotal() {
		return saldoTotal;
	}

}
