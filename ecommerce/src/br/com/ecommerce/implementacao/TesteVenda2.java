package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;

public class TesteVenda2 {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
        cliente.setCpf(JOptionPane.showInputDialog("CPF"));
        cliente.setFone(JOptionPane.showInputDialog("Fone"));
        cliente.setNome(JOptionPane.showInputDialog("Nome"));
        cliente.setLimite(Float.parseFloat(JOptionPane.showInputDialog("Limite")));
       
        Endereco endereco = new Endereco();
        endereco.setLogradouro(JOptionPane.showInputDialog("Logradouro"));
        endereco.setBairro(JOptionPane.showInputDialog("Bairro"));
        endereco.setCidade(JOptionPane.showInputDialog("Cidade"));
        endereco.setUf(JOptionPane.showInputDialog("UF"));
        endereco.setComplemento(JOptionPane.showInputDialog("Complemento"));
        endereco.setNumero(JOptionPane.showInputDialog("Numero"));
       
        cliente.setEndereco(endereco);
       
        Produto produto = new Produto();
        produto.setDescricao(JOptionPane.showInputDialog("Descricao"));
        produto.setId(Integer.parseInt(JOptionPane.showInputDialog("ID")));
        produto.setQtde(Integer.parseInt(JOptionPane.showInputDialog("Qtde")));
        produto.setValorCompra(Float.parseFloat(JOptionPane.showInputDialog("Compra")));
        produto.setValorVenda(Float.parseFloat(JOptionPane.showInputDialog("Venda")));
       
        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.setProduto(produto);
        venda.setData(JOptionPane.showInputDialog("Data"));
        venda.setNumeroNotaFiscal(Integer.parseInt(JOptionPane.showInputDialog("NF")));
        venda.setTotal(Float.parseFloat(JOptionPane.showInputDialog("Total")));
       
        System.out.println(venda.getAll());

	}

}
