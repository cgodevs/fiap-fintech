package br.com.fintech.fiap;

import java.time.LocalDate;

public class ReceitaFixa extends Receita {
	private double valorFixo;
	private int periodicidade;
	private int[] diasGanhoDefinidos;
	
	public ReceitaFixa() {}
	
	public ReceitaFixa(int id, LocalDate dataReceita, Categoria categoria, String descricao, double valorFixo, int periodicidade, int[] diaGanhoDefinidos) {
		super(id, dataReceita, categoria, descricao);
		this.valorFixo = valorFixo;
		this.periodicidade = periodicidade;
		this.diasGanhoDefinidos = diaGanhoDefinidos;
	}
	
	public double getValorFixo() {
		return valorFixo;
	}
	public int getPeriodicidade() {
		return periodicidade;
	}
	public int[] getDiaCobrancaDefinidos() {
		return diasGanhoDefinidos;
	}
	public void setValorFixo(double valorFixo) {
		this.valorFixo = valorFixo;
	}
	public void setPeriodicidade(int periodicidade) {
		this.periodicidade = periodicidade;
	}
	public void setDiaCobrancaDefinidos(int[] diaCobrancaDefinidos) {
		this.diasGanhoDefinidos = diaCobrancaDefinidos;
	}
}
