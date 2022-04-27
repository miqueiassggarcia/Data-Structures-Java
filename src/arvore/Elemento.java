package arvore;

public class Elemento<T> {
	private T valor;
	private Elemento<T> esquerda;
	private Elemento<T> direita;

	public Elemento(T valor) {
		this.valor = valor;
		this.esquerda = null;
		this.direita = null;
	}
	
	public Elemento<T> getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Elemento<T> esquerda) {
		this.esquerda = esquerda;
	}

	public Elemento<T> getDireita() {
		return direita;
	}

	public void setDireita(Elemento<T> direita) {
		this.direita = direita;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}
}