package fila;

import base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>{
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public Fila() {
		super();
	}
	
	public void  enfileirar(T elemento) {
		//this.elementos[this.tamanho] = elemento;
		//this.tamanho++;
		
		//this.elemento[this.tamanho++] = elemento;
		
		super.adiciona(elemento);
	}
	
	public boolean estaVazia() {
		return super.estaVazia();
	}
	
	public T inspecionar() {
		if(this.estaVazia()) {
			return null;
		}
		
		return this.elementos[0];
	}
	
	public T desenfileira() {
		final int POS = 0;
		
		if(this.estaVazia()) {
			return null;
		}
		
		T elemento = this.elementos[POS];
		super.remove(POS);
		
		return elemento;
	}
	
	public int tamanho() {
		return super.tamanho();
	}
}
