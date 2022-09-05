package br.com.fiap.fintech;

import java.time.LocalDate;

public class ReceitaAvulsa extends Receita {
	private static final long serialVersionUID = 1L;
	private double valorAvulsoReceita;
	
	public ReceitaAvulsa() {}

	public ReceitaAvulsa(int id, LocalDate dataReceita, Categoria categoria, String descricao, double valorAvulsoReceita) {
		super(id, dataReceita, categoria, descricao);
		this.valorAvulsoReceita = valorAvulsoReceita;
	}

	public double getValorAvulsoReceita() {
		return valorAvulsoReceita;
	}

	public void setValorAvulsoReceita(double valorAvulsoGasto) {
		this.valorAvulsoReceita = valorAvulsoGasto;
	}
}
