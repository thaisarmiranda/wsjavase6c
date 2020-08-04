package br.com.universidade.modelo;

import br.com.universidade.interfaces.PadraoPessoas;

public class Professor extends Pessoa implements PadraoPessoas{

	private String dtContratacao;
	private String titulacao;
	private float valorHora;
	
	public void setAll(String nome, Endereco endereco, String dtContratacao, String titulacao, float valorHora) {
		super.setAll(nome, endereco);
		this.dtContratacao = dtContratacao;
		this.titulacao = titulacao;
		this.valorHora = valorHora;
	}
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Contratação: " + dtContratacao + "\n" +
				"Titulação..: " + titulacao + "\n" +
				"Valor Hora.: R$ " + valorHora;
	}
	
	public Professor() {
		super();
	}
	
	public Professor(String nome, Endereco endereco, String dtContratacao, String titulacao, float valorHora) {
		super(nome, endereco);
		this.dtContratacao = dtContratacao;
		this.titulacao = titulacao;
		this.valorHora = valorHora;
	}
	
	public String getDtContratacao() {
		return dtContratacao;
	}
	public void setDtContratacao(String dtContratacao) {
		this.dtContratacao = dtContratacao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public boolean verificarDados() {
		if (valorHora>0) {
			return true;
		}
		return false;
	}

	
}
