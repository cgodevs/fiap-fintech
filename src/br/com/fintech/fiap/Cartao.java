package br.com.fiap.fintech;
import java.util.Date;

public class Cartao {
	//attributes
	private long numeroCartao;
	private String nomeTitular;
	private short codSeguranca;
	private Date dataExpiracao;
	private char tipoCartao;
	private int idCartao;
	private Usuario usuario;
	
	//methods
	public Cartao(long numero, String nome, short codigo, Date data, char tipo, Usuario usuario) {
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

	public Date getDataExpiracao() {
		return dataExpiracao;
	}

	public void setDataExpiracao(Date dataExpiracao) {
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

}
