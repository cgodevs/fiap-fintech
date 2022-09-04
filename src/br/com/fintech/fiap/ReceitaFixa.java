package br.com.fiap.fintech;

public class ReceitaFixa extends Receita {
	private double valorFixo;
	private int periodicidade;
	private int[] diaGanhoDefinidos;
	
	public double getValorFixo() {
		return valorFixo;
	}
	public int getPeriodicidade() {
		return periodicidade;
	}
	public int[] getDiaCobrancaDefinidos() {
		return diaGanhoDefinidos;
	}
	public void setValorFixo(double valorFixo) {
		this.valorFixo = valorFixo;
	}
	public void setPeriodicidade(int periodicidade) {
		this.periodicidade = periodicidade;
	}
	public void setDiaCobrancaDefinidos(int[] diaCobrancaDefinidos) {
		this.diaGanhoDefinidos = diaCobrancaDefinidos;
	}
}
