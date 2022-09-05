package br.com.fintech.fiap;

import java.time.LocalDate;

public class ReceitaVariavel extends Receita {
	private double valorMinimo;
	private double ultimoValorReceita;
	private int periodicidade;
	private int diasGanhoDefinidos;
	
	public ReceitaVariavel() {}
	
	public ReceitaVariavel(int id, LocalDate dataReceita, Categoria categoria, String descricao, double valorMinimo, double ultimoValorReceita, int periodicidade, int diaGanhoDefinidos) {
		super(id, dataReceita, categoria, descricao);
		this.valorMinimo = valorMinimo;
		this.ultimoValorReceita = ultimoValorReceita;
		this.periodicidade = periodicidade;
		this.diasGanhoDefinidos = diaGanhoDefinidos;
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
		return diasGanhoDefinidos;
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
		this.diasGanhoDefinidos = diaGanhoDefinidos;
	}
}
