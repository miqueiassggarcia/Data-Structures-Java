package arvore;

public class Arvore<T extends Comparable> {
	private Elemento<T> raiz;
	
	public Arvore() {
		this.raiz = null;
	}
	
	public Elemento<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(Elemento<T> raiz) {
		this.raiz = raiz;
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
	
	public void emOrdem(Elemento<T> atual) {
		if(atual != null) {
			emOrdem(atual.getEsquerda());
			System.out.println(atual.getValor());
			emOrdem(atual.getDireita());
		}
	}
	
	public void preOrdem(Elemento<T> atual) {
		if(atual != null) {
			System.out.println(atual.getValor());
			preOrdem(atual.getEsquerda());
			preOrdem(atual.getDireita());
		}
	}
	
	public void posOrdem(Elemento<T> atual) {
		if(atual != null) {
			posOrdem(atual.getEsquerda());
			posOrdem(atual.getDireita());
			System.out.println(atual.getValor());
		}
	}
}