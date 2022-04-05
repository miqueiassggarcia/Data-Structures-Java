package lista.teste;

import lista.ListaEncadeada;

public class Teste2 {
	public static void main(String[] args) {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.adiciona(1);
		
		System.out.println("Tamanho = "+ lista.getTamanho());
		System.out.println(lista);
	}
}
