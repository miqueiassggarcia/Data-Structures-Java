package fila.exercises;

import java.util.Random;

import fila.Fila;

public class Exercise4 {
	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<>();
		
		for(int i = 0; i < 10; i++) {
			fila.enfileirar(i);
		}
		
		Random aleatorio = new Random();
		int numero = 0;
		
		while(numero == 0) {
			numero = aleatorio.nextInt(10);
		}
		
		System.out.println("Número = " + numero);
		
		while(fila.tamanho() > 1) {
			for(int i = 0; i < numero; i++) {
				fila.enfileirar(fila.desenfileira());
			}
			
			System.out.println("Eliminado = " + fila.desenfileira());
		}
		
		System.out.println("\nGanhador " + fila.desenfileira());
	}
}
