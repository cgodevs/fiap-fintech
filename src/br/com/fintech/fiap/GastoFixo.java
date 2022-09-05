package br.com.fintech.fiap;
import java.time.LocalDate;
import java.util.Date;

public class GastoFixo extends Gasto {
	private double valorFixo;
	private int periodicidade;
	private int[] diaCobrancaDefinidos;
	
	public GastoFixo() {}
	public GastoFixo(LocalDate dataGasto, Categoria categoria, String descricao, double valorFixo, int periodicidade, int[] diaCobrancaDefinidos) {
		super(dataGasto, categoria, descricao);
		this.valorFixo = valorFixo;
		this.periodicidade = periodicidade;
		this.diaCobrancaDefinidos = diaCobrancaDefinidos;
	}
}
