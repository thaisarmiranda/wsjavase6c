package br.com.colecoes.teste;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		
		Set lista = new HashSet();    // SET n�o permite elementos duplicados e n�o respeita a ordem dos inputs (ordem aleat�ria)
		lista.add("DBA");
		lista.add("ESTAGIARIO");
		lista.add("ANALISTA");
		lista.add("DBA");
		lista.add("DEV");
		lista.add("CURIOSO");
		lista.add("XPTO");
		lista.add("GP");
		System.out.println(lista);
		lista.remove("XPTO");
		//Colections.sort(lista); => n�o aceita ordena��o, ele que escolhe a melhor ordem

	}

}
