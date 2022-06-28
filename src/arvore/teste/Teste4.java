package arvore.teste;

import arvore.ArvoreBinaria;

public class Teste4 {

	public static void main(String[] args) {
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>(null);
		
		arvore.insert(10);
		arvore.insert(20);
		arvore.insert(5);
		arvore.insert(15);
		arvore.insert(7);
		
		arvore.print_central();
		System.out.println("\nTotal de nodes: " + arvore.total_nodes());
		System.out.println("Altura da arvore: " + arvore.altura());
	}

}