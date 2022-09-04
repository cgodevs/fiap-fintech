import java.time.LocalDate;
import java.util.Date;

public class GastoFixo extends Gasto {
	private double valorGastoAvulso;
	
	public GastoFixo(Date dataGasto, Categoria categoria, String descricao, double valorGastoAvulso) {
		super(dataGasto, categoria, descricao);
		this.valorGastoAvulso = valorGastoAvulso;
	}
}
