package br.com.fiap.fintech;

public class ReceitaFixa extends Receita {
	private static final long serialVersionUID = 1L;
	private double valorFixo;
	private int periodicidade;
	private int[] diaGanhoDefinidos;
	
	public ReceitaFixa() {}
	
	public ReceitaFixa(double valorFixo, int periodicidade, int[] diaGanhoDefinidos) {
		super();
		this.valorFixo = valorFixo;
		this.periodicidade = periodicidade;
		this.diaGanhoDefinidos = diaGanhoDefinidos;
	}
	
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
