package br.com.fintech.fiap;
import java.time.LocalDate;

public class GastoAvulso extends Gasto {
	private double valorGastoAvulso;

	public GastoAvulso() {}
	public GastoAvulso(LocalDate dataGasto, Categoria categoria, String descricao, double valorGastoAvulso) {
		super(dataGasto, categoria, descricao);
		this.valorGastoAvulso = valorGastoAvulso;
	}	
}
