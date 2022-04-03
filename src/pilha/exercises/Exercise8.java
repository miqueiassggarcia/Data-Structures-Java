package pilha.exercises;

import java.util.Stack;

public class Exercise8 {
	public static void main(String[] args) {
		Stack<Integer> original = new Stack<Integer>();
		Stack<Integer> destino = new Stack<Integer>();
		Stack<Integer> auxiliar = new Stack<Integer>();

		original.push(6);
		original.push(5);
		original.push(4);
		original.push(3);
		original.push(2);
		original.push(1);
		
		torreDeHanoi(original.size(), original, destino, auxiliar);
	}

	public static void torreDeHanoi(
			int tamanho,
			Stack<Integer> original,
			Stack<Integer> destino,
			Stack<Integer> auxiliar
			) {
		if(tamanho > 0) {
			torreDeHanoi(tamanho-1, original, auxiliar, destino);
			destino.push(original.pop());
			System.out.println("------");
			System.out.println("Original " + original);
			System.out.println("Destino " + destino);
			System.out.println("Auxiliar" + auxiliar);
			torreDeHanoi(tamanho-1, auxiliar, destino, original);
		}
	}
}
