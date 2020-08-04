package br.com.falhas.excecoes;

public class Excecao {

	public static String tratarExcecao(Exception e) {
		
		if (e instanceof NullPointerException) {
			return "Objeto nulo";
		}else if (e instanceof NumberFormatException) {
			return "N�mero inv�lido";
		}else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor estourou";
		}else {
			return "Exce��o n�o tratada";
		}
		
	}
	
}
