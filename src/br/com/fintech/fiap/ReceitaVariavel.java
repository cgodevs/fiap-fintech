package br.com.fiap.fintech;

public class ReceitaVariavel extends Receita {
	private static final long serialVersionUID = 1L;
	private double valorMinimo;
	private double ultimoValorReceita;
	private int periodicidade;
	private int diaGanhoDefinidos;
	
	public ReceitaVariavel() {}
	
	public ReceitaVariavel(double valorMinimo, double ultimoValorReceita, int periodicidade, int diaGanhoDefinidos) {
		super();
		this.valorMinimo = valorMinimo;
		this.ultimoValorReceita = ultimoValorReceita;
		this.periodicidade = periodicidade;
		this.diaGanhoDefinidos = diaGanhoDefinidos;
	}
	
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
