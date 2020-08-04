package br.com.universidade.modelo;

public class Curso {
	
	private int id;
	private String descricao;
	private float valor;
	private int cargaHoraria;
	
	public String getAll() {
		return
				"C�digo Curso.: " + id + "\n" +
				"Curso........: " + descricao + "\n" +
				"Valor Curso..: R$ " + valor + "\n" +
				"Carga Hor�ria: " + cargaHoraria;
	}
	
	public void setAll(int id, String descricao, float valor, int cargaHoraria) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
	}
	
	public Curso() {
		super();
	}
	public Curso(int id, String descricao, float valor, int cargaHoraria) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	

}
