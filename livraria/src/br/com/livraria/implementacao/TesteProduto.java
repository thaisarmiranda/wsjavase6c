package br.com.livraria.implementacao;

import javax.swing.JOptionPane;

import br.com.livraria.modelo.Cd;
import br.com.livraria.modelo.Livro;
import br.com.livraria.modelo.Produto;
import br.com.livraria.tela.Magica;

public class TesteProduto {

	public static void main(String[] args) {
		Produto produto;
		
		if (JOptionPane.showInputDialog("Digite <L> para Livro ou qualquer outra letra para CD").toUpperCase().charAt(0)=='L') {
			produto = new Livro(
					Magica.i("Código"),
					Magica.t("Descrição"),
					Magica.i("Qtde"),
					Magica.f("Valor Compra"),
					Magica.f("Valor Venda"),
					Magica.t("Editora"),
					Magica.t("Autor"),
					Magica.i("ISBN")
					);		
					
		}else {
			produto = new Cd(
					Magica.i("Código"),
					Magica.t("Descrição"),
					Magica.i("Qtde"),
					Magica.f("Valor Compra"),
					Magica.f("Valor Venda"),
					Magica.t("Artista"),
					Magica.t("Gravadora"),
					Magica.t("Estilo")
					);
		}
		
		System.out.println(produto.getAll());
		
		System.out.println(produto.verificarDados());
		
	}

}
