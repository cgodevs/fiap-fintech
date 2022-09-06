package br.com.fintech.fiap;
import java.time.LocalDate;

/**
 * Gasto inesperado... pneu furou, geladeira quebrou, precisou comprar mais um boneco do Lucas Neto pra filha que perdeu o segundo
 * **/
public class GastoAvulso extends Gasto {
	private double valorGastoAvulso;

	public GastoAvulso() {}
	public GastoAvulso(LocalDate dataGasto, Categoria categoria, String descricao, double valorGastoAvulso) {
		super(dataGasto, categoria, descricao);
		this.setValorGastoAvulso(valorGastoAvulso);
	}
	public double getValorGastoAvulso() {
		return valorGastoAvulso;
	}
	public void setValorGastoAvulso(double valorGastoAvulso) {
		this.valorGastoAvulso = valorGastoAvulso;
	}	
}
