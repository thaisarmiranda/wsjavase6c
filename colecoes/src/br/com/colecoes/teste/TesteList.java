package br.com.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		
		List lista = new ArrayList();
		lista.add("DBA");
		lista.add(15000.0);
		lista.add("ESTAGIARIO");
		lista.add(1500.0);
		lista.add("ANALISTA");
		lista.add(16000.0);
		lista.add("DBA");
		lista.add(15000.0);
		System.out.println("N�o ordenada: " + lista);
		//Collections.sort(lista);
		//System.out.println("Ordenada: " + lista);
		//System.out.println("Segundo elemento: " + lista.get(1));
		//lista.remove(1);
		//System.out.println("Com o primeiro removido: " + lista);
		System.out.println("Usando o FOR:");
		for(int contador=0; contador<lista.size();contador++) {
			System.out.println("Cargo: " + lista.get(contador));
		}
		                                                      // N�O VALE A PENA COLOCAR V�RIOS TIPOS DE DADOS EM UMA MESMA LISTA
		double total=0;                                                    
		for (int cont=1; cont<lista.size();cont+=2) {
			total+= (double) lista.get(cont);
		}
		System.out.println("Total: " + total);
	}

}
