package br.com.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListComObjeto {

	public static void main(String[] args) {
		
		List<Cargo> lista = new ArrayList<Cargo>();           // < >  => representa um iten generico, uma lista generica, ou seja, todos os elementos do mesmo tipo
		lista.add(new Cargo("DBA", 15000, "PLENO"));
		lista.add(new Cargo("DBA", 12000, "JR"));
		lista.add(new Cargo("ESTAGIARIO", 3000, "SENIOR"));
		lista.add(new Cargo("DEV", 14000, "PLENO"));
		
		//System.out.println(lista.get(1).getAll());
		
	//	for (int cont=0; cont<lista.size();cont++) {
	//		System.out.println(lista.get(cont).getAll());
	//	}
	//	
		float total=0;
	//	for (int cont=0; cont<lista.size();cont++) {
	//		total+=lista.get(cont).getSalario();
	//	}
	//	System.out.println(total);
		
		Collections.sort(lista);
		
		for (Cargo c : lista) {
			System.out.println(c.getAll());
			total+=c.getSalario();
			}
			System.out.println("Total de Salários: "  + total);

			
		
	}

}
