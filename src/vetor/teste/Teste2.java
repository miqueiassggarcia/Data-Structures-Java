package vetor.teste;

import vetor.Vetor;

public class Teste2 {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(3);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		System.out.println(vetor.busca(2));
	}
}