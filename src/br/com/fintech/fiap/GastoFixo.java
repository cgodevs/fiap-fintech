package br.com.fintech.fiap;
import java.time.LocalDate;
import java.util.Date;

/**
 * O tipo de gasto que não sofre alteração de valores
 */
public class GastoFixo extends Gasto {
	private double valorFixo;
	
	/**Periodicidade é o intervalo de dias entre cobranças consecutivas do gasto fixo (caso exista).
	 * Exemplos: Fatura da academia a cada 30 dias, 
	 * parte do salário a cada 15 dias, 
	 * o mesmo lanche fora da dieta a cada 7 dias**/
	private int periodicidade;
	
	/**A array contendo os dias de cobrança para um gasto fixo deve conter ao menos 1 elemento. <br> 
	 * Sendo o primeiro elemento o único ou primeiroo dia registrado para a cobrança periódica. <br><br>
	 * Exemplo: [26] representando o dia 26 para a data de cobrança de uma fatura recebida sempre no dia 26 do mês.<br> 
	 * Além do dia, o Gasto Fixo ainda pode ter (se existir) uma periodicidade=30, indicando a repetição de cobrança para os elementos na array a cada 30 dias.<br><br>
	 *  
	 * Caso existam outros dias no mês sem relação lógica de intervalos numéricos entre si para receber a cobrança, 
	 * todos entrarão na array. Por exemplo: cobranças sempre nos dias [3, 17, 19 e 28]**/
	private int[] diaCobrancaDefinidos;
	
	public GastoFixo() {}
	public GastoFixo(LocalDate dataGasto, Categoria categoria, String descricao, double valorFixo, int periodicidade, int[] diaCobrancaDefinidos) {
		super(dataGasto, categoria, descricao);
		this.valorFixo = valorFixo;
		this.periodicidade = periodicidade;
		this.diaCobrancaDefinidos = diaCobrancaDefinidos;
	}
}
