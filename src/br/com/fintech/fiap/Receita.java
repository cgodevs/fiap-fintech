package br.com.fintech.fiap;

import java.time.LocalDate;

public abstract class Receita  {
	private int id;
	private LocalDate dataReceita;
	private LocalDate dataRegistro;
	private Categoria categoria;
	private String descricao;
	
	public Receita() {}
	
	public Receita(int id, LocalDate dataReceita, Categoria categoria, String descricao) {
		this.id = id;
		this.dataReceita = dataReceita;
		this.dataRegistro = LocalDate.now();
		this.categoria = categoria;
		this.descricao = descricao;
	}
	
	public int getId() {
		return this.id;
	}
	public LocalDate getDataReceita() {
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
	public void setDataReceita(LocalDate dataReceita) {
		this.dataReceita = dataReceita;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Receita consultar(String id) {
		return null;} // TODO implementar
	
	public void registrarReceita() {} // TODO implementar
}
