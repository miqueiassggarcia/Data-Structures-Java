package vetor;

import base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

	public Lista2(int capacidade) {
		super(capacidade);
	}

	public Lista2() {
		super();
	}
	
	public boolean adiciona(T elemento) {
		return super.adiciona(elemento);
	}

	public boolean adiciona(int pos, T elemento){
		return super.adiciona(pos, elemento);
	}
	
	public void remove(int pos){
		super.remove(pos);
	}
	
	public T busca(int pos){
		if (!(pos >= 0 && pos < tamanho)){
			throw new IllegalArgumentException("Posicao inválida");
		}
		return elementos[pos];
	}
	
	public int busca(T elemento){
		for (int i=0; i<tamanho ;i++){
			if (elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}
}