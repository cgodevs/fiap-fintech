package br.com.fintech.fiap;
import java.time.LocalDate;
import java.util.Date;

/**
 * O tipo de gasto que n�o sofre altera��o de valores
 */
public class GastoFixo extends Gasto {
	private double valorFixo;
	
	/**Periodicidade � o intervalo de dias entre cobran�as consecutivas do gasto fixo (caso exista).
	 * Exemplos: Fatura da academia a cada 30 dias, 
	 * parte do sal�rio a cada 15 dias, 
	 * o mesmo lanche fora da dieta a cada 7 dias**/
	private int periodicidade;
	
	/**A array contendo os dias de cobran�a para um gasto fixo deve conter ao menos 1 elemento. <br> 
	 * Sendo o primeiro elemento o �nico ou primeiroo dia registrado para a cobran�a peri�dica. <br><br>
	 * Exemplo: [26] representando o dia 26 para a data de cobran�a de uma fatura recebida sempre no dia 26 do m�s.<br> 
	 * Al�m do dia, o Gasto Fixo ainda pode ter (se existir) uma periodicidade=30, indicando a repeti��o de cobran�a para os elementos na array a cada 30 dias.<br><br>
	 *  
	 * Caso existam outros dias no m�s sem rela��o l�gica de intervalos num�ricos entre si para receber a cobran�a, 
	 * todos entrar�o na array. Por exemplo: cobran�as sempre nos dias [3, 17, 19 e 28]**/
	private int[] diaCobrancaDefinidos;
	
	public GastoFixo() {}
	public GastoFixo(LocalDate dataGasto, Categoria categoria, String descricao, double valorFixo, int periodicidade, int[] diaCobrancaDefinidos) {
		super(dataGasto, categoria, descricao);
		this.valorFixo = valorFixo;
		this.periodicidade = periodicidade;
		this.diaCobrancaDefinidos = diaCobrancaDefinidos;
	}
}
