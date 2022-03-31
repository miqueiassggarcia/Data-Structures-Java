package base;

import java.util.Arrays;

public class EstruturaEstatica<T> {
	private T[] elementos;
	private int tamanho;
	
	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public EstruturaEstatica() {
		this(10);
	}
	
	protected boolean adiciona(T elemento) {
		aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	protected boolean adiciona(int posicao, T elemento) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		aumentaCapacidade();
		
		for(int i = this.tamanho; i >= posicao; i--) {
			this.elementos[i] = this.elementos[i-1];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for(int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		return Arrays.toString(elementos);
	}
}
