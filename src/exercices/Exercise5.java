package exercices;

import vetor.Lista;

public class Exercise5 {
	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("D");
		
		lista.limpar();
		
		System.out.println(lista);
	}
}
