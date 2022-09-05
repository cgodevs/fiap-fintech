package br.com.fintech.fiap;
import java.time.LocalDate;

/**
 * @author caroline.oliveira
 * 
 * @summary A classe Receita e suas subclasses reproduzem comportamento an�logo ao desta documenta��o
 *
 */
public abstract class Gasto{
	private int id;
	
	/** A data real em que ocorreu um gasto, o usu�rio pode escolh�-la em um calend�rio, 
	 * sendo anterior ou posterior � data atual em que usa o app para fazer o registro
	 * Exemplos: 
	 * - Usu�rio esqueceu de registrar um gasto no dia em que ocorreu e agora ir� informar um dia no passado
	 * - Usu�rio gostaria de planejar determinado gasto, que ocorrer� o futuro
	 * **/
	private LocalDate dataGasto;
	
	/** A data em que o usu�rio informa o registro, ou seja, o LocalDate do exato momento
	 * em que usa o app para fazer o registro
	 * **/
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
