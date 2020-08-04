package br.com.universidade.modelo;

/*
 * Polimorfismo => quarto pilar da POO onde temos m�todos com o mesmo nome executando a��es diferentes
 * Existem 2 tipos:
 * - Overload (sobrecarga): quando os m�todos est�o na mesma classe (Exemplo: m�todos construtores)
 * - Overriding (sobreecrita): quando os m�todos est�o em classes diferentes (filhas e pai), onde o m�todo da subclasse ter� prioridade (filha)
 */

public abstract class Pessoa {
	
	private String nome;
	private Endereco endereco;
	
	public boolean verificarDados() {
		return false;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Pessoa(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}
	public Pessoa() {
		super();
	}
	
	public void setAll(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getAll() {
		return
				"Nome: " + nome + "\n" + "Endere�o: " + endereco.getAll();
	}
}
