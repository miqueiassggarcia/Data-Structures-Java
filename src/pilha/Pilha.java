package pilha;

import base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T>{
	public Pilha(int capacidade) {
		super(capacidade);
	}
	
	public Pilha() {
		super();
	}
	
	public void  empilha(T pilha) {
		super.adiciona(pilha);
	}
	
	public boolean estaVazia() {
		return super.estaVazia();
	}
	
	public T topo() {
		if(this.estaVazia()) {
			return null;
		}
		
		return this.elementos[tamanho - 1];
	}
	
	public T desempilha() {
		if(this.estaVazia()) {
			return null;
		}
		
		/*T elemento = this.elementos[tamanho-1];
		tamanho--;
		 */
		
		return this.elementos[--tamanho];
	}
	
	public int tamanho() {
		return super.tamanho();
	}
}
