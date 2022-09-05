package br.com.fintech.fiap;
import java.time.LocalDate;

/**
 * 
 * Gasto Vari�vel � um tipo de gasto cuja frequ�ncia � determinada conforme o modelo de sua superclasse.
 * Por�m, o valor deste gasto n�o segue um padr�o. <br>
 * O usu�rio � capaz de informar um valor m�nimo esperado para a cobran�a, no entanto pode retornar para registrar o valor real recebido.<br><br>
 * Exemplos: este gasto pode ser usado para proje��es ou especula��es de viagens, gastos com compras ou contas de luz, etc...<br>
 * Pense se, por exemplo, a pessoa gastou exatamente os R$400 reais que pensou em dedicar <b>no m�ximo</b> para o mercado este m�s? Ou na verdade acabou gastando R$512,87? 
 *
 */
public class GastoVariavel extends Gasto{
	
	private double valorMinimo;
	private double ultimoValorGasto;
	private int periodicidade;
	private int[] diaCobrancaDefinidos;
	
	public GastoVariavel() {}
	public GastoVariavel(LocalDate dataGasto, Categoria categoria, String descricao,  //super
			double valorMinimo, double ultimoValorGasto, int periodicidade) {
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
}
