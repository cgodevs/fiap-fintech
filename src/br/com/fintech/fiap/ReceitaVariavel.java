package br.com.fiap.fintech;

public class ReceitaVariavel {
	private double valorMinimo;
	private double ultimoValorReceita;
	private int periodicidade;
	private int diaGanhoDefinidos;
	public double getValorMinimo() {
		return valorMinimo;
	}
	public double getUltimoValorReceita() {
		return ultimoValorReceita;
	}
	public int getPeriodicidade() {
		return periodicidade;
	}
	public int getDiaGanhoDefinidos() {
		return diaGanhoDefinidos;
	}
	public void setValorMinimo(double valorMinimo) {
		this.valorMinimo = valorMinimo;
	}
	public void setUltimoValorReceita(double ultimoValorReceita) {
		this.ultimoValorReceita = ultimoValorReceita;
	}
	public void setPeriodicidade(int periodicidade) {
		this.periodicidade = periodicidade;
	}
	public void setDiaGanhoDefinidos(int diaGanhoDefinidos) {
		this.diaGanhoDefinidos = diaGanhoDefinidos;
	}
	
}
