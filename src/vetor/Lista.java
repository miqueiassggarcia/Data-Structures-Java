package vetor;

import java.util.Arrays;

public class Lista<T> {
	private T[] elementos;
	private int tamanho;
	
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public Lista() {
		this(10);
	}
	
	public boolean adiciona(T elemento) {
		aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	public void remove(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posiï¿½ï¿½o invï¿½lida");
		}
		
		for(int i = posicao; i < this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		
		this.elementos[tamanho-1] = null;
		this.tamanho--;
	}
	
	public void remove(T elemento) {
		int pos = this.busca(elemento);
		if(pos > -1) {
			this.remove(pos);
		}
	}
	
	public void limpar() {
		for(int i = 0; i < this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}
	
	public T obter(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}
	
	public int busca(T elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public int ultimoIndice(T elemento) {
		for(int i = this.tamanho-1; i >= 0; i--) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean contem(T elemento) {
		return busca(elemento) > -1;
	}
	
	public boolean adiciona(int posicao, T elemento) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("PosiÃ§Ã£o invÃ¡lida");
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
