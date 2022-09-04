import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public abstract class Gasto{
	private int id;
	private Date dataGasto;
	private LocalDate dataRegistro;
	private Categoria categoria;
	private String descricao;
	
	public Gasto(Date dataGasto, Categoria categoria, String descricao) {
		this.dataGasto = dataGasto;
		this.dataRegistro = LocalDate.now();
		this.categoria = categoria;
		this.descricao = descricao;
	}
	
	public int getId() {
		return id;
	}
	public Date getDataGasto() {
		return dataGasto;
	}
	public void setDataGasto(Date dataGasto) {
		this.dataGasto = dataGasto;
	}
	public LocalDate getDataRegistro() {
		return dataRegistro;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	public void registrar(Usuario usuario) {} //TODO implementar
	public Gasto consultar(int id) {}	 //TODO implementar
}
