package vetor.teste;

import vetor.Vetor;

public class Teste6 {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);
		
		vetor.adiciona("A");
		vetor.adiciona("B");
		vetor.adiciona("E");
		
		System.out.println(vetor);
		
		int pos = vetor.busca("U");
		if(pos > -1) {
			vetor.remove(pos);
		}
		
		System.out.println(vetor);
	}
}