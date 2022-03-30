package teste;

import vetor.Lista;

public class Teste8 {
	public static void main(String[] args) {
		Lista<String> vetor = new Lista<String>(3);
		
		vetor.adiciona("Elemento");
		
		System.out.println(vetor);
	}
}
