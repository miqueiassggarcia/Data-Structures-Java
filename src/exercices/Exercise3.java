package exercices;

import vetor.Lista;

public class Exercise3 {
	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("D");
		
		System.out.println(lista);
		
		lista.remove("D");
		
		System.out.println(lista);
	}
}
