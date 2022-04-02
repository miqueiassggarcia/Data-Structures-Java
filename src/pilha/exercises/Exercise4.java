package pilha.exercises;

import java.util.Stack;

public class Exercise4 {
	public static void main(String[] args) {
		Stack<Livro> livros = new Stack<Livro>();

		Livro livro1 = new Livro(
				"Estruturas de Dados e Algoritmos com JavaScript: Escreva um Código JavaScript Complexo e Eficaz Usando a Mais Recente ECMAScript",
				"978-8575226933",
				2019,
				"Loiane Groner"
				);
		Livro livro2 = new Livro(
				"Código limpo: Habilidades práticas do Agile Software",
				"978-8576082675",
				2009,
				"Robert C. Martin"
				);
		Livro livro3 = new Livro(
				"Arquitetura limpa: O guia do artesão para estrutura e design de software",
				"978-8550804606",
				2019,
				"Robert C. Martin"
				);
		Livro livro4 = new Livro(
				"Estruturas de Dados e Algoritmos com JavaScript: Escreva um Código JavaScript Complexo e Eficaz Usando a Mais Recente ECMAScript",
				"978-8575226933",
				2019,
				"Loiane Groner"
				);
		Livro livro5 = new Livro(
				"Código limpo: Habilidades práticas do Agile Software",
				"978-8576082675",
				2009,
				"Robert C. Martin"
				);
		Livro livro6 = new Livro(
				"Arquitetura limpa: O guia do artesão para estrutura e design de software",
				"978-8550804606",
				2019,
				"Robert C. Martin"
				);

		System.out.println("Empilhando os livros, pilha está vazia? "+livros.isEmpty());
		
		System.out.println("\nEmpilhando...");
		
		livros.push(livro1);
		livros.push(livro2);
		livros.push(livro3);
		livros.push(livro4);
		livros.push(livro5);
		livros.push(livro6);
		
		System.out.println(livros.size()+" livros empilhados:");
		System.out.println(livros);
		
		System.out.println("\nÚltimo livros empilhado:\n" + livros.peek());
		
		System.out.println("\nDesempilhando arquivos...");
		
		while(!livros.isEmpty()) {
			System.out.println("Desempilhando livro" + livros.pop());
		}
		
		System.out.println("\nTodos os livros foram desempilhados");
		
		System.out.println("Pilha realmente está vazia? "+ livros.isEmpty());
	}
}
