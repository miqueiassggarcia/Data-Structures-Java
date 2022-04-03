package fila.teste;

import fila.Fila;

public class Teste4 {
	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<Integer>();
		
		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);
		fila.enfileirar(4);
		
		System.out.println(fila);
		
		fila.desenfileira();
		
		System.out.println(fila);
		
		fila.desenfileira();
		
		System.out.println(fila);
	}

}
