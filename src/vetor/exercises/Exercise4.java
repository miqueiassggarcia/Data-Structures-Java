package vetor.exercises;

import vetor.Lista;

public class Exercise4 {
	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("D");
		
		System.out.println(lista.obter(1));
	}
}
