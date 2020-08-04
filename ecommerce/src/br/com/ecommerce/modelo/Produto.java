package br.com.ecommerce.modelo;

/*
 * Padrão => DTO (TO ou Beans) => Data Transfer Object - é um Design Pattern
 * Melhor forma para construir uma classe modelo: OBRIGATÓRIOS!!!
 * - Todo atributo DEVE ser private
 * - Todo atributo DEVE possuir um método GET (output) e SET (input) - os métodos exibirTudo e preencherTudo não substituem os individuais
 * - Deve existir um construtor vazio e um outro construtor para preencher o objeto (no mínimo)
 */

public class Produto {

// PRIMEIRA REGRA DTO	
	private int id;
	private String descricao;
	private int qtde;
	private float valorCompra;
	private float valorVenda;

/*
*	=> Método Construtor - utiliza o nome da Classe SEMPRE!!
*	=> Método Construtor não substitui o SET, ele complementa
*	=> Pode ter tantos métodos construtores quanto forem necessários
*	
*	public Produto() {}  => pode ser instanciado sem parametro
*
*	public Produto(int id) {   => tb pode ser instanciado com parametro, ao mesmo tempo
*		this.id = id;
*	}
*	
*	public Produto(int id, String descricao) {   => tb pode instanciar mais de um parametro ao mesmo tempo
*		this.id = id;
*		this.descricao = descricao;
*	}
*/
	
// TERCEIRA REGRA DTO
// Source => Generate Constructor using Fields (não selecionar para criar o metodo contrutor vazio)
	
	public Produto() {
		super();
}

// Source => Generate Constructor using Fields (selecionar tudo para criar o metodo contrutor com todos os atributos)

	public Produto(int id, String descricao, int qtde, float valorCompra, float valorVenda) {
	super();
	this.id = id;
	this.descricao = descricao;
	this.qtde = qtde;
	this.valorCompra = valorCompra;
	this.valorVenda = valorVenda;
}

// SEGUNDA REGRA DTO
// Source => Generate Getters and Setters (forma rápida de incluir os métodos get-exibir e set-preencher)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;          // this => faz referencia a propria classe / this.id (atributo da classe) = id (metodo)
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

	public void setAll(int pId, String pDescricao, int pQtde, float pValorCompra, float pValorVenda) {
		id = pId;
		descricao = pDescricao;
		qtde = pQtde;
		valorCompra = pValorCompra;
		valorVenda = pValorVenda;
	}
	
	public String getAll() {
		return 
				"Descrição........: " + descricao + "\n" +
				"Código...........: " + id + "\n" +
				"Quantidade.......: " + qtde + "\n" +
				"Valor de Compra..: R$ " + valorCompra + "\n" +
				"Valor de Venda...: R$ " + valorVenda;
	}
	
	public float getSubtotalVendas() {
		return valorVenda * qtde;
	}
	
	public double getValorVista() {
		return valorVenda * 0.9;
	}
	
	public void setAjuste(float porcentagem) {
		valorCompra = valorCompra + valorCompra * (porcentagem/100);
		valorVenda = valorVenda + valorVenda * (porcentagem/100);		
	}

	public String avaliarEstoque() {
		if (qtde>20) {
			return "Estoque Cheio";
		}else if (qtde<10) {
			return "Estoque Baixo";
		}else {
			return "Estoque Médio";
		}
	}
	
	public String getDescricaoSimples() {
		if (descricao.indexOf(" ")==-1) {  // significa que ele não encontrou o espaço
			return descricao;
		}else {
			return descricao.substring(0, descricao.indexOf(" "));
		}
	}
	
	public double getValorVista(float porcentagem) {
		return valorVenda - valorVenda * (porcentagem/100);
	}
}
