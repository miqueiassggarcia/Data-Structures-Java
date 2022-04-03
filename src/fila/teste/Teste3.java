package fila.teste;

import fila.Fila;

public class Teste3 {
	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<Integer>();
		
		fila.enfileirar(1);
		fila.enfileirar(2);
		
		System.out.println(fila.inspecionar());
		System.out.println(fila);
	}
}
