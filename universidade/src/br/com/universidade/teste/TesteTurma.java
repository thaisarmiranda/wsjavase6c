package br.com.universidade.teste;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Curso;
import br.com.universidade.modelo.Endereco;
import br.com.universidade.modelo.Turma;
import br.com.universidade.tela.Magica;

public class TesteTurma {

	public static void main(String[] args) {
		
		Turma turma = new Turma(
				Magica.t("Nome da Turma").toUpperCase(),
				new Curso(
						Magica.i("ID do Curso"),
						Magica.t("Descri��o do Curso").toUpperCase(),
						Magica.f("Valor do Curso"),
						Magica.i("Carga Hor�ria")
						),
				Magica.t("Per�odo").toUpperCase(),
				new Aluno(
						Magica.t("Nome do Aluno").toUpperCase(),
						Magica.t("E-mail").toUpperCase(),
						Magica.i("RM"),
						new Endereco(
								Magica.t("Logradouro").toUpperCase(),
								Magica.t("Numero").toUpperCase(),
								Magica.t("Complemento").toUpperCase(),
								Magica.t("Bairro").toUpperCase(),
								Magica.t("Cidade").toUpperCase(),
								Magica.t("UF").toUpperCase(),
								Magica.t("CEP").toUpperCase()
								)
						)
				); 
			
		System.out.println(turma.getAll());

	}

}
