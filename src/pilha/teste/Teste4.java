package pilha.teste;

import pilha.Pilha;

public class Teste4 {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();

		System.out.println(pilha.topo());
		
		pilha.empilha(1);
		pilha.empilha(2);
		
		System.out.println(pilha.topo());
	}

}
