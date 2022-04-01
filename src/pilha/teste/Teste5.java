package pilha.teste;

import pilha.Pilha;

public class Teste5 {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();

		System.out.println(pilha.desempilha());
		
		pilha.empilha(1);
		pilha.empilha(2);
		
		System.out.println(pilha);
		
		System.out.println(pilha.desempilha());
		
		System.out.println(pilha);
	}

}
