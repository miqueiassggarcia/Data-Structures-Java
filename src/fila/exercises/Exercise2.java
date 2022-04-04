package fila.exercises;

import fila.Fila;

public class Exercise2 {
	public static void main(String[] args) {
		Fila<String> normal = new Fila<>();
		Fila<String> prioridade = new Fila<>();
		
		final int MAX_PRIORIDADE = 3;
		
		normal.enfileirar("Pessoa 1");
		normal.enfileirar("Pessoa 2");
		normal.enfileirar("Pessoa 3");
		prioridade.enfileirar("Pessoa 1P");
		prioridade.enfileirar("Pessoa 2P");
		prioridade.enfileirar("Pessoa 3P");
		prioridade.enfileirar("Pessoa 4P");
		normal.enfileirar("Pessoa 4");
		normal.enfileirar("Pessoa 5");
		normal.enfileirar("Pessoa 6");
		
		int count = 0;
		while(!normal.estaVazia() || !prioridade.estaVazia()) {
			count = 0;
			while(!prioridade.estaVazia() && count < MAX_PRIORIDADE) {
				atender(prioridade);
				count++;
			}
			
			if(!normal.estaVazia()) {
				atender(normal);
			}
			
			if(prioridade.estaVazia()) {
				while(!normal.estaVazia()) {
					atender(normal);
				}
			}
		}
	}
	
	public static void atender(Fila<String> fila) {
		String pessoaAtendida = fila.desenfileira();
		System.out.println(pessoaAtendida + " foi atendida.");
	}
}
