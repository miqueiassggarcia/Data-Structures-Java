package grafo;

import java.util.ArrayList;

public class Vertice<T> {
	private T dado;
	private ArrayList<Aresta<T>> arestasEntrada;
	private ArrayList<Aresta<T>> arestasSaida;
	
	public Vertice(T valor) {
		this.dado = valor;
		this.arestasEntrada = new ArrayList<Aresta<T>>();
		this.arestasSaida = new ArrayList<Aresta<T>>();
	}

	public void adicionarArestaEntrada(Aresta<T> aresta) {
		this.arestasEntrada.add(aresta);
	}
	
	public void adicionarArestaSaida(Aresta<T> aresta) {
		this.arestasSaida.add(aresta);
	}
	
	public T getDado() {
		return dado;
	}

	public void setDado(T dado) {
		this.dado = dado;
	}
}
