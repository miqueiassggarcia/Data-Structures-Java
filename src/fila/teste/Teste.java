package fila.teste;

import fila.Fila;

public class Teste {
	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<Integer>();
		
		System.out.println(fila.tamanho());
		System.out.println(fila.estaVazia());
	}
}
