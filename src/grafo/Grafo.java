package grafo;

import java.util.ArrayList;

public class Grafo<T> {
	private ArrayList<Vertice<T>> vertices;
	private ArrayList<Aresta<T>> arestas;
	
	public Grafo() {
		this.vertices = new ArrayList<Vertice<T>>();
		this.arestas = new ArrayList<Aresta<T>>();
	}
	
	public void adicionarVertice(T dado) {
		Vertice<T> novoVertice = new Vertice<T>(dado);
		this.vertices.add(novoVertice);
	}
	
	public void adicionarAresta(Double peso, T dadoInicio, T dadoFim) {
		Vertice<T> inicio = this.getVertice(dadoInicio);
		Vertice<T> fim = this.getVertice(dadoFim);
		
		Aresta<T> aresta = new Aresta<T>(peso, inicio, fim);
		
		inicio.adicionarArestaSaida(aresta);
		fim.adicionarArestaEntrada(aresta);
		
		this.arestas.add(aresta);
	}
	
	public Vertice<T> getVertice(T dado) {
		Vertice<T> vertice = null;
		
		for(int i=0; i < this.vertices.size(); i++) {
			if(this.vertices.get(i).getDado().equals(dado)) {
				vertice = this.vertices.get(i);
				break;
			}
		}
		
		return vertice;
	}
}
