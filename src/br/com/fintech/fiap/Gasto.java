package br.com.fintech.fiap;
import java.time.LocalDate;

public abstract class Gasto{
	private int id;
	private LocalDate dataGasto;
	private LocalDate dataRegistro;
	private Categoria categoria;
	private String descricao;
	
	public Gasto() {}
	public Gasto(LocalDate dataGasto, Categoria categoria, String descricao) {
		this.dataGasto = dataGasto;
		this.dataRegistro = LocalDate.now();
		this.categoria = categoria;
		this.descricao = descricao;
	}
	
	public int getId() {
		return id;
	}
	public LocalDate getDataGasto() {
		return dataGasto;
	}
	public void setDataGasto(LocalDate dataGasto) {
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
	public void registrarGasto() {
		return;  	//TODO implementar
	} 
	public Gasto consultar(int id) {
		return null;	//TODO implementar
	}	 
}
