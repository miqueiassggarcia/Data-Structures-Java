package fila.teste;

import fila.Fila;

public class Teste2 {
	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<Integer>();
		
		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);
		
		System.out.println(fila);
		
		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
	}
}
