package arvore.teste;

import arvore.ArvoreBinaria;

public class Teste4 {

	public static void main(String[] args) {
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>(null);
		
		arvore.insert(10);
		arvore.insert(2);
		arvore.insert(20);
		arvore.insert(32);
		arvore.print_central();
		System.out.println(arvore.total_nodes());
		System.out.println(arvore.altura());
	}

}