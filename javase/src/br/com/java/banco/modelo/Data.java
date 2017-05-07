package br.com.java.banco.modelo;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String formatada() {
		if(dataValida(dia, mes, ano))
		return this.dia + "/" + this.mes + "/" + this.ano;
		return "Data informada inválida";
	}

	public boolean dataValida(int dia, int mes, int ano) {
		if (dia > 31)
			return false;
		if (mes > 12)
			return false;
		if (((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) && (dia > 30))
			return false;
		if (mes == 2) {
			if (bisessto(ano)){
				if (dia > 29)
					return false;
			}else{
				if (dia > 28)
					return false;
			}
		}
		return true;
	}

	public boolean bisessto(int ano) {
		return (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0));
	}

}
