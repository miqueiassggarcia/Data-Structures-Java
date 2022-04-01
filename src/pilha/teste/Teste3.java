package pilha.teste;

import pilha.Pilha;

public class Teste3 {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();

		System.out.println(pilha.estaVazia());
		
		pilha.empilha(1);
		
		System.out.println(pilha.estaVazia());
	}

}
