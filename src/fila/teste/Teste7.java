package fila.teste;

import fila.FilaPrioridade;

public class Teste7 {
	public static void main(String[] args) {
		FilaPrioridade<Paciente> filaPrioridade = new FilaPrioridade<Paciente>();
		
		filaPrioridade.enfileirar(new Paciente("A", 2));
		filaPrioridade.enfileirar(new Paciente("C", 1));
		filaPrioridade.enfileirar(new Paciente("B", 3));
		
		System.out.println(filaPrioridade);
		
		System.out.println(filaPrioridade.desenfileira());
		
		System.out.println(filaPrioridade);
	}
}
