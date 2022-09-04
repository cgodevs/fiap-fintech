package br.com.fintech.fiap;
import java.time.LocalDate;
import java.util.Date;

public class GastoAvulso extends Gasto {
	
	public GastoAvulso(Date dataGasto, Categoria categoria, String descricao, double valorGastoAvulso) {
		super(dataGasto, categoria, descricao);
		this.valorGastoAvulso = valorGastoAvulso;
	}

	private double valorGastoAvulso;
	
}
