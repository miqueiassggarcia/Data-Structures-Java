package pilha;

public class Pilha<T> {
	private T elementos;
	private int tamanho;
	
	public Pilha(int capacidade) {
		this.elementos = (T[]) new Object(capacidade);
		this.tamanho = 0;
	}
	
	public void empilha(T pilha) {
		
	}
	
	public void aumentaCapacidade() {
		
	}
	
	public boolean estaVazia() {
		return true;
	}
	
	public T topo() {
		return this.elementos;
	}
	
	public T desempilha() {
		return this.elementos;
	}
	
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		return "[elementos=" + elementos + "]";
	}
	
	
}
