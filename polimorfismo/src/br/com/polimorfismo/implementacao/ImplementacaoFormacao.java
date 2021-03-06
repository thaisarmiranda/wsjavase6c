package br.com.polimorfismo.implementacao;

import javax.swing.JOptionPane;

import br.com.polimorfismo.beans.Bacharelado;
import br.com.polimorfismo.beans.Formacao;
import br.com.polimorfismo.beans.Medio;
import br.com.polimorfismo.beans.Tecnologo;
import br.com.polimorfismo.tela.Magica;

public class ImplementacaoFormacao {

	public static void main(String[] args) {
		
		Formacao formacao = null;
		
		char resp = 0;
		
		do {
			resp = Magica.t("Digite: \n<B> Bacharelado\n<T> Tecnologo\n<M> Medio").charAt(0);

			if (resp=='B') {
				formacao = new Bacharelado(
						Magica.t("Descri��o"),
						Magica.i("Periodo"),
						0,
						0,
						Magica.t("Conclus�o"),
						Magica.i("Carga Hor�rio do Est�gio")
						);
			}else if (resp=='T') {
				formacao = new Tecnologo(
						Magica.t("Descri��o"),
						Magica.i("Periodo"),
						0,
						0,
						Magica.b("� Plano Extendido?")
						);
			}else if (resp=='M') {
				formacao = new Medio(
						Magica.t("Descri��o"),
						Magica.i("Periodo"),
						0,
						0,
						Magica.t("Tipo")
						);
			}else {
				JOptionPane.showMessageDialog(null, "Digite somente <B>, <T> ou <M>");
			}
			formacao.definirDuracao();
			formacao.calcularMensalidade(Magica.d("Digite o fator"));
			System.out.println(formacao.getAll());
		}while(JOptionPane.showConfirmDialog
				(null, "Continua?", "Aplicacao Polimorfismo", JOptionPane.YES_NO_OPTION)==0);
			
			
	} // fechar main

} // fechar classe
