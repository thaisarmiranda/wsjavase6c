package br.com.falhas.implementacao;

import br.com.falhas.excecoes.Excecao;

public class TesteFalhas {

	public static void main(String[] args) {
		String palavra = "";
		try {                                         // coloca dentro do TRY as linhas que voc� imagina que podem ter uma exce��o/erro
			int numero = Integer.parseInt("1");
			System.out.println(numero);
			
			System.out.println(palavra.length());
			
			int x[] = new int[3];
			x[0] = 15;
			x[1] = 98;
			x[2] = 12;
		
		}catch(Exception e) {                         // coloca dentro do CATCH a exce��o que ser� tratada      
			System.out.println(Excecao.tratarExcecao(e));
			
		}finally {									  // as linhas do bloco FINALLY ser�o executadas se houver ou n�o exce��o
			System.out.println("Tenha um bom dia!!");
		}

	}

}
