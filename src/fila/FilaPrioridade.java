package fila;

public class FilaPrioridade<T> extends Fila<T> {
	public FilaPrioridade() {
		super();
	}
	
	public void enfileirar(T elemento) {
		
		@SuppressWarnings("unchecked")
		Comparable<T> chave = (Comparable<T>) elemento;
		
		int i;
		for(i = 0; i<this.tamanho; i++) {
			if(chave.compareTo(this.elementos[i]) < 0) {
				break;
			}
		}
		super.adiciona(i, elemento);
	}
}
