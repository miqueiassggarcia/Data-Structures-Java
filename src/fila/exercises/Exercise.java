package fila.exercises;

import fila.Fila;

public class Exercise {
	public static void main(String[] args) {
		Fila<Impressao> fila = new Fila<Impressao>();
		
		fila.enfileirar(new Impressao("A", 1));
		fila.enfileirar(new Impressao("B", 20));
		fila.enfileirar(new Impressao("C", 6));
		fila.enfileirar(new Impressao("X", 4));
		fila.enfileirar(new Impressao("Q", 10));
		
		while(!fila.estaVazia()) {
			Impressao imprime = fila.desenfileira();
			System.out.println("Imprimindo documento " + imprime.getNome() + "...");
			try {
				Thread.sleep(200 * imprime.getQuantFolhas());
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Todos as impressões foram feitas ");
	}
}
