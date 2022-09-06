package br.com.fiap.fintech;
import java.time.LocalDate;

public class Cartao {
	//attributes
	private long numero;
	private String nomeTitular;
	private short codSeguranca;
	private LocalDate dataExpiracao;
	private char tipoCartao;
	private int id;
	private Usuario usuario;
	
	//methods
	public Cartao(long numero, String nome, short cod, LocalDate data, char tipo, Usuario usuario) {
		this.numero = numero;
		this.nomeTitular = nome;
		this.codSeguranca = cod;
		this.dataExpiracao = data;
		this.tipoCartao = tipo;
		this.usuario = usuario;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
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

	public int getId() {
		return id;
	}

}
