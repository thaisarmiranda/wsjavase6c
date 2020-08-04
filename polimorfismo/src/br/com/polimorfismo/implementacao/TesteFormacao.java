package br.com.polimorfismo.implementacao;

import javax.swing.JOptionPane;

import br.com.polimorfismo.beans.Bacharelado;
import br.com.polimorfismo.beans.Formacao;
import br.com.polimorfismo.beans.Medio;
import br.com.polimorfismo.beans.Tecnologo;
import br.com.polimorfismo.tela.Magica;

public class TesteFormacao {

	public static void main(String[] args) {
		
		Formacao formacao = null;	
		
		if (JOptionPane.showInputDialog("Qual forma��o deseja cadastrar?\n <T> para Tecnologo\n <B> para Bacharelado\n <M> para Medio").toUpperCase().charAt(0)=='T') {
			formacao = new Tecnologo(
					Magica.t("Descri��o"),
					Magica.i("Periodo"),
					Magica.d("Mensalidade"),
					Magica.i("Dura��o"),
					Magica.b("Plano Extendido")
					);
			System.out.println(formacao.getAll());
			}
		
		else if (JOptionPane.showInputDialog("Qual forma��o deseja cadastrar?\n <T> para Tecnologo\n <B> para Bacharelado\n <M> para Medio").toUpperCase().charAt(0)=='M') {
			formacao = new Medio(
					Magica.t("Descri��o"),
					Magica.i("Periodo"),
					Magica.d("Mensalidade"),
					Magica.i("Dura��o"),
					Magica.t("Tipo")
					);
			System.out.println(formacao.getAll());
			}
		
		else {
			formacao = new Bacharelado(
					Magica.t("Descri��o"),
					Magica.i("Periodo"),
					Magica.d("Mensalidade"),
					Magica.i("Dura��o"),
					Magica.t("Projeto de Conclus�o"),
					Magica.i("Carga Hor�rio do Est�gio")
					);
			System.out.println(formacao.getAll());
			}
	
	}
	
}

