package br.com.ecommerce.modelo;

public class Cliente {

	private String cpf;
	private String nome;
	private String fone;
	private float limite;
	private Endereco endereco;

	public String getAll() {
		return
				"===============\nDados do Cliente\n===============\n" +
				"CPF.....: " + cpf + "\n" +
				"Nome....: " + nome + "\n" +
				"Telefone: " + fone + "\n" +
				"Limite..: R$ " + limite + "\n===============\n" +
				"Endere�o" + "\n===============\n" + endereco.getAll();
	}
	
	public void setAll(String cpf, String nome, String fone, float limite, Endereco endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.fone = fone;
		this.limite = limite;
		this.endereco = endereco;
	}
	
	public Cliente(String cpf, String nome, String fone, float limite, Endereco endereco) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.fone = fone;
		this.limite = limite;
		this.endereco = endereco;
	}

	public Cliente() {
		super();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
