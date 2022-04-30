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
	
	public void buscaEmLargura() {
		ArrayList<Vertice<T>> marcados = new ArrayList<Vertice<T>>();
		ArrayList<Vertice<T>> fila = new ArrayList<Vertice<T>>();
		
		Vertice<T> atual = this.vertices.get(0);
		
		marcados.add(atual);
		
		System.out.println(atual.getDado());
		
		fila.add(atual);
		
		while(fila.size() > 0) {
			Vertice<T> visitado = fila.get(0);
			for(int i=0; i < visitado.getArestasSaida().size(); i++) {
				Vertice<T> proximo = visitado.getArestasSaida().get(i).getFim();
				if(!marcados.contains(proximo)) { // se o vertice ainda não foi marcado
					marcados.add(proximo);
					System.out.println(proximo.getDado());
					fila.add(proximo);
				}
			}
			fila.remove(0);
		}
	}
}
