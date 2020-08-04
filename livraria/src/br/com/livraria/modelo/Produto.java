package br.com.livraria.modelo;

public abstract class Produto {

	private int id;
	private String descricao;
	private int qtde;
	private float valorCompra;
	private float valorVenda;

	public boolean verificarDados() {
		return false;
	}
	
	public Produto() {
		super();
}

	public Produto(int id, String descricao, int qtde, float valorCompra, float valorVenda) {
	super();
	this.id = id;
	this.descricao = descricao;
	this.qtde = qtde;
	this.valorCompra = valorCompra;
	this.valorVenda = valorVenda;
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
		this.descricao = descricao.toUpperCase();
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public float getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public void setAll(int id, String descricao, int qtde, float valorCompra, float valorVenda) {
		this.id = id;
		this.descricao = descricao;
		this.qtde = qtde;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
	}
	
	public String getAll() {
		return 
				"Descrição........: " + descricao + "\n" +
				"Código...........: " + id + "\n" +
				"Quantidade.......: " + qtde + "\n" +
				"Valor de Compra..: R$ " + valorCompra + "\n" +
				"Valor de Venda...: R$ " + valorVenda;
	}


}