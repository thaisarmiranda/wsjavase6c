package br.com.livraria.modelo;

import br.com.livraria.interfaces.PadraoProduto;

public class Cd extends Produto implements PadraoProduto {
	
	private String artista;
	private String gravadora;
	private String estilo;
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Artista..........: " + artista + "\n" +
				"Gravadora........: " + gravadora + "\n" +
				"Estilo...........: " + estilo;
	}
	
	public void setAll(int id, String descricao, int qtde, float valorCompra, float valorVenda, String artista, String gravadora,
			String estilo) {
		super.setAll(id, descricao, qtde, valorCompra, valorVenda);
		this.artista = artista;
		this.gravadora = gravadora;
		this.estilo = estilo;
	}
	
	public Cd() {
		super();
	}

	public Cd(int id, String descricao, int qtde, float valorCompra, float valorVenda, String artista, String gravadora,
			String estilo) {
		super(id, descricao, qtde, valorCompra, valorVenda);
		this.artista = artista;
		this.gravadora = gravadora;
		this.estilo = estilo;
	}
	
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	

}
