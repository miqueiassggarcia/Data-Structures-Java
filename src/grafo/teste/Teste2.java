package grafo.teste;

import grafo.Grafo;

public class Teste2 {

	public static void main(String[] args) {
		Grafo<String> grafo = new Grafo<String>();
		
		grafo.adicionarVertice("Joao");
		grafo.adicionarVertice("Paulo");
		grafo.adicionarVertice("Gerlandio");
		grafo.adicionarVertice("Beluga");
		
		grafo.adicionarAresta(2.0, "Joao", "Paulo");
		grafo.adicionarAresta(3.0, "Paulo", "Gerlandio");
		grafo.adicionarAresta(1.0, "Gerlandio", "Beluga");
		grafo.adicionarAresta(1.0, "Joao", "Gerlandio");

		grafo.buscaEmLargura();
	}

}
