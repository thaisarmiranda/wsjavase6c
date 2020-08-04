package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		
		//Criando o objeto = um buraco negro na memoria
		// Produto produto;

		// Instanciando o objeto = o objeto possui suas repartições
		Produto produto = new Produto();  // Produto() é metodo que usa o nome da classe, por isso inicia c letra maiuscula
		
			
		produto.setDescricao(JOptionPane.showInputDialog("Descrição do Produto"));
		produto.setId(Integer.parseInt(JOptionPane.showInputDialog("Código do Produto")));
		produto.setQtde(Integer.parseInt(JOptionPane.showInputDialog("Quantidade")));
		produto.setValorCompra(Float.parseFloat(JOptionPane.showInputDialog("Valor de Compra")));
		produto.setValorVenda(Float.parseFloat(JOptionPane.showInputDialog("Valor de Venda")));
				
		System.out.println(produto.getAll());
		System.out.println("==================================");
		System.out.println("Valor à Vista....: R$ " + produto.getValorVista());
		System.out.println("Subtotal Venda...: R$ " + produto.getSubtotalVendas());
					
		produto.setAjuste(20);
		System.out.println("Ajustado Compra..: R$ " + produto.getValorCompra());
		System.out.println("Ajustado Venda...: R$ " + produto.getValorVenda());
		
		System.out.println("Status Estoque...: " + produto.avaliarEstoque());
		
		System.out.println("Descrição Simples: " + produto.getDescricaoSimples());
		
		System.out.println("Valor Venda Desc.: R$ " + produto.getValorVista(50));
		
	}

}
