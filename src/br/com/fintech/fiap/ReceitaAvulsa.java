package br.com.fiap.fintech;

public class ReceitaAvulsa extends Receita {
	private static final long serialVersionUID = 1L;
	private double valorAvulsoReceita;
	
	public ReceitaAvulsa() {}

	public ReceitaAvulsa(double valorAvulsoReceita) {
		super();
		this.valorAvulsoReceita = valorAvulsoReceita;
	}

	public double getValorAvulsoReceita() {
		return valorAvulsoReceita;
	}

	public void setValorAvulsoReceita(double valorAvulsoGasto) {
		this.valorAvulsoReceita = valorAvulsoGasto;
	}
}
