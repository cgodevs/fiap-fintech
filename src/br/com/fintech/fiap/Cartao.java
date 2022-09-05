package br.com.fintech.fiap;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author mateusfv
 */

public class Cartao {
	//attributes
	private long numeroCartao;
	private int idCartao;
	private short codSeguranca;
	private char tipoCartao;
	private String nomeTitular;
	private LocalDate dataExpiracao;
	private Usuario usuario;
	
	//methods
	public Cartao() {}
	public Cartao(long numero, String nome, short codigo, LocalDate data, char tipo, Usuario usuario) {
		this.numeroCartao = numero;
		this.nomeTitular = nome;
		this.codSeguranca = codigo;
		this.dataExpiracao = data;
		this.tipoCartao = tipo;
		this.usuario = usuario;
	}

	public long getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(long numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public short getCodSeguranca() {
		return codSeguranca;
	}

	public void setCodSeguranca(short codSeguranca) {
		this.codSeguranca = codSeguranca;
	}

	public LocalDate getDataExpiracao() {
		return dataExpiracao;
	}

	public void setDataExpiracao(LocalDate dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}

	public char getTipoCartao() {
		return tipoCartao;
	}

	public void setTipoCartao(char tipoCartao) {
		this.tipoCartao = tipoCartao;
	}

	public int getIdCartao() {
		return idCartao;
	}
	
	public void registrarCartao() {
		return;
	}
	
	public Cartao consultar(int id) {
		return null;
	}

}
