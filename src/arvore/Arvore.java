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
	
	public boolean remover(T valor) {
		//buscar elemento
		Elemento<T> atual = this.raiz;
		Elemento<T> paiAtual = null;
		while(atual != null) {
			if(atual.getValor().equals(valor)) {
				break;
			} else {
				if(valor.compareTo(atual.getValor()) == -1) { // valor procurado é menor que o atual
					paiAtual = atual;
					atual = atual.getEsquerda();
				} else {
					paiAtual = atual;
					atual = atual.getDireita();
				}
			}
		}
		
		//verifica se existe o elemento
		if(atual != null) {
			// elemento de dois filhos ou somente filho a direita
			if(atual.getDireita() != null) {
				Elemento<T> substituto = atual.getDireita();
				Elemento<T> paiSubstituto = atual;
				while(substituto.getEsquerda() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getEsquerda();
				}
				
				substituto.setEsquerda(atual.getEsquerda());
				
				if(paiAtual != null) {
					if(atual.getValor().compareTo(paiAtual.getValor()) == -1) { //atual menor que paiAtual
						paiAtual.setEsquerda(substituto);
					} else {
						paiAtual.setDireita(substituto);
					}
				} else { // se não tem paiAtual, então é a raiz
					this.raiz = substituto;
				}
				
				// remover elemento da arvore
				if(substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) { //substituto menor que paiSubstituto
					paiSubstituto.setEsquerda(null);
				} else {
					paiSubstituto.setDireita(null);
				}
			} else if(atual.getEsquerda() != null) { // filho só à esquerda
				Elemento<T> substituto = atual.getEsquerda();
				Elemento<T> paiSubstituto = atual;
				while(substituto.getDireita() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getDireita();
				}

				if(paiAtual != null) {
					if(atual.getValor().compareTo(paiAtual.getValor()) == -1) { //atual menor que paiAtual
						paiAtual.setEsquerda(substituto);
					} else {
						paiAtual.setDireita(substituto);
					}
				} else { //se for a raiz
					this.raiz = substituto;
				}
				
				// remover elemento da arvore
				if(substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) { //substituto menor que paiSubstituto
					paiSubstituto.setEsquerda(null);
				} else {
					paiSubstituto.setDireita(null);
				}
			} else { // não tem filho
				if(paiAtual != null) {
					if(atual.getValor().compareTo(paiAtual.getValor()) == -1) { //atual menor que paiAtual
						paiAtual.setEsquerda(null);
					} else {
						paiAtual.setDireita(null);
					}
				} else { // é a raiz
					this.raiz = null;
				}
			}
			
			return true;
		} else {
			return false;
		}
	}
}