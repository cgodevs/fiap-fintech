import java.time.LocalDate;
import java.util.Date;

public class GastoVariavel extends Gasto{
	private double valorMinimo;
	private double ultimoValorGasto;
	private int periodicidade;
	
	public GastoVariavel(Date dataGasto, //super
			Categoria categoria,  //super
			String descricao,  //super
			double valorMinimo, 
			double ultimoValorGasto, 
			int periodicidade) {
		super(dataGasto, categoria, descricao);
		this.valorMinimo = valorMinimo;
		this.ultimoValorGasto = ultimoValorGasto;
		this.periodicidade = periodicidade;
	}
	
	public double getValorMinimo() {
		return valorMinimo;
	}
	public void setValorMinimo(double valorMinimo) {
		this.valorMinimo = valorMinimo;
	}
	public double getUltimoValorGasto() {
		return ultimoValorGasto;
	}
	public void setUltimoValorGasto(double ultimoValorGasto) {
		this.ultimoValorGasto = ultimoValorGasto;
	}
	public int getPeriodicidade() {
		return periodicidade;
	}
	public void setPeriodicidade(int periodicidade) {
		this.periodicidade = periodicidade;
	}
	public int[] getDiaCobrancaDefinidos() {
		return diaCobrancaDefinidos;
	}
	public void setDiaCobrancaDefinidos(int[] diaCobrancaDefinidos) {
		this.diaCobrancaDefinidos = diaCobrancaDefinidos;
	}
	private int[] diaCobrancaDefinidos;	
}
