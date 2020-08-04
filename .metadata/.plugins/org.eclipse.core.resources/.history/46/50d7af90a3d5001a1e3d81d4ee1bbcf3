package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;
import br.com.ecommerce.tela.Magica;

public class TesteVenda {

	public static void main(String[] args) {
		
		Venda venda = new Venda(
				Magica.i("N° Nota Fiscal"),
				new Cliente(
						Magica.t("CPF"),
						Magica.t("Nome").toUpperCase(),
						Magica.t("Telefone"),
						Magica.f("Limite"),
						new Endereco(
								JOptionPane.showInputDialog("Logradouro").toUpperCase(),
								JOptionPane.showInputDialog("Numero").toUpperCase(),
								JOptionPane.showInputDialog("Complemento").toUpperCase(),
								JOptionPane.showInputDialog("Bairro").toUpperCase(),
								JOptionPane.showInputDialog("Cidade").toUpperCase(),
								JOptionPane.showInputDialog("UF").toUpperCase(),
								JOptionPane.showInputDialog("CEP").toUpperCase()
								)
						),
				new Produto(
						Integer.parseInt(JOptionPane.showInputDialog("ID")),
						JOptionPane.showInputDialog("Descrição").toUpperCase(),
						Integer.parseInt(JOptionPane.showInputDialog("Quantidade Comprada")),
						Float.parseFloat(JOptionPane.showInputDialog("Valor de Compra")),
						Float.parseFloat(JOptionPane.showInputDialog("Valor de Venda"))
						),
				Float.parseFloat(JOptionPane.showInputDialog("Total da Compra")),
				JOptionPane.showInputDialog("Data")
				);
		
		System.out.println(venda.getAll());
	}

}
