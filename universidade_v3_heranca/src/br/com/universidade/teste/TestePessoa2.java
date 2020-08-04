package br.com.universidade.teste;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Endereco;
import br.com.universidade.modelo.Pessoa;
import br.com.universidade.modelo.Professor;
import br.com.universidade.tela.Magica;

public class TestePessoa2 {
	
	public static void main(String[] args) {
		Pessoa pessoa;
				
		if (JOptionPane.showInputDialog("Digite <A> para Aluno ou qualquer outra letra para Professor").toUpperCase().charAt(0)=='A') {
			pessoa = new Aluno(
					Magica.t("Nome"),
					new Endereco(
							Magica.t("Logradouro"),
							Magica.t("N�mero"),
							Magica.t("Complemento"),
							Magica.t("Bairro"),
							Magica.t("Cidade"),
							Magica.t("UF"),
							Magica.t("CEP")
							),
					Magica.t("E-mail"),
					Magica.i("RM")
					);
					
		}else {
			pessoa = new Professor(
					Magica.t("Nome"),
					new Endereco(
						Magica.t("Logradouro"),
						Magica.t("N�mero"),
						Magica.t("Complemento"),
						Magica.t("Bairro"),
						Magica.t("Cidade"),
						Magica.t("UF"),
						Magica.t("CEP")
						),
					Magica.t("Data de contrata��o"),
					Magica.t("Titula��o"),
					Magica.f("Valor Hora")
					);
						
	}		
		System.out.println(pessoa.getAll());
		
		System.out.println(pessoa.verificarDados());
}
	
}
