package arvore;

public class Arvore<T extends Comparable> {
	private Elemento<T> raiz;
	
	public Arvore() {
		this.raiz = null;
	}
	
	public void adicionar(T valor) {
		Elemento<T> novoElemento = new Elemento<T>(valor);
		if( raiz == null ) {
			this.raiz = novoElemento;
		} else {
			Elemento<T> atual = this.raiz;
			while(true) {
				if(novoElemento.getValor().compareTo(atual.getValor()) == -1) {
					if(atual.getEsquerda() != null) {
						atual = atual.getEsquerda();
					} else {
						atual.setEsquerda(novoElemento);
						break;
					}
				} else {
					if(atual.getDireita() != null) {
						atual = atual.getDireita();
					} else {
						atual.setDireita(novoElemento);
						break;
					}
				}
			}
		}
	}
}