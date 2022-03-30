package exercices;

import vetor.Lista;

public class Exercise {

	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		
		boolean existe = lista.contem("C");
		
		if(existe) {
			System.out.println("O elemento existe");
		} else {
			System.out.println("O elemento não existe");
		}

	}

}
