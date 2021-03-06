package br.com.universidade.modelo;

public class Aluno {

	private String nome;
	private String email;
	private int rm;
	private Endereco endereco;
	
	public String getAll() {
		return
				"\n==============================\nDADOS DO ALUNO\n==============================\n" + "\n" +
				"Nome Aluno...: " + nome + "\n" +
				"E-mail Aluno.: " + email + "\n" +
				"RM Aluno.....: " + rm + "\n" +
				endereco.getAll();
	}
	
	public void setAll(String nome, String email, int rm, Endereco endereco) {
		this.nome = nome;
		this.email = email;
		this.rm = rm;
		this.endereco = endereco;
	}
	
	public Aluno() {
		super();
	}
	public Aluno(String nome, String email, int rm, Endereco endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.rm = rm;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
		
}