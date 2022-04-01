package vetor.teste;

import vetor.Vetor;

public class Teste5 {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(3);
		
		vetor.adiciona("A");
		vetor.adiciona("B");
		vetor.adiciona("E");
		
		System.out.println(vetor);
		
		vetor.adiciona(2, "C");
		vetor.adiciona(3, "D");
		
		System.out.println(vetor);
	}
}