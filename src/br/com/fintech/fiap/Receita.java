package br.com.fiap.fintech;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public abstract class Receita implements Serializable {
	private String id;
	private Date dataReceita;
	private LocalDate dataRegistro;
	private Categoria categoria;
	private String descricao;
	
	public void Receita(String id, Date dataReceita, Categoria categoria, String descricao) {
		this.id = id;
		this.dataReceita = dataReceita;
		this.dataRegistro = LocalDate.now();
		this.categoria = categoria;
		this.descricao = descricao;
	}
	
	public int getId() {
		return id;
	}
	public Date getDataReceita() {
		return dataReceita;
	}
	public LocalDate getDataRegistro() {
		return dataRegistro;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDataReceita(Date dataReceita) {
		this.dataReceita = dataReceita;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Receita consultar(String id) {} // TODO implementar
	
	public void registrarReceita() {} // TODO implementar
}
